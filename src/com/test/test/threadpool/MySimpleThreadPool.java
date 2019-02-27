package com.test.test.threadpool;

import com.example.threadpool.MyThreadPool;

import javax.crypto.Mac;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wecash on 19/2/27.
 */
public class MySimpleThreadPool {

    private List<Runnable> threadList;

    private BlockingQueue<Runnable> taskQueue;

    private int initThreadNum;

    private int workThreadNum;

    private ReentrantLock mainLock = new ReentrantLock();

    public MySimpleThreadPool(int initThreadNum) {
        this.threadList = new ArrayList<>(initThreadNum);
        this.taskQueue = new ArrayBlockingQueue<Runnable>(initThreadNum * 4);
        this.initThreadNum = initThreadNum;
        this.workThreadNum = 0;
    }

    public void executor(Runnable runnable) {
        try {
            mainLock.lock();
            if (workThreadNum < initThreadNum) {
                SimpleThread simpleThread = new SimpleThread(runnable);
                simpleThread.start();
                threadList.add(simpleThread);
                workThreadNum++;
            } else {
                if (!taskQueue.offer(runnable)) {
                    rejectTask();
                }
            }
        } finally {
            mainLock.unlock();
        }
    }

    private void rejectTask() {
        System.out.println("队列满了");
    }

    public static void main(String[] args) {
        MySimpleThreadPool mySimpleThreadPool = new MySimpleThreadPool(5);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    SimpleThread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("任务执行");
            }
        };
        for (int i = 0; i < 30; i++) {
            mySimpleThreadPool.executor(task);
        }
    }

    class SimpleThread extends Thread {

        private Runnable task;

        public SimpleThread(Runnable runnable) {
            this.task = runnable;
        }

        @Override
        public void run() {
            while (true){
                if (task != null) {
                    task.run();
                    task = null;
                } else {
                    Runnable queueTask = taskQueue.poll();
                    if (queueTask != null) {
                        queueTask.run();
                    }
                }
            }
        }
    }


}
