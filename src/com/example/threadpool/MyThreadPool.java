package com.example.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wecash on 19/2/27.
 */
public class MyThreadPool {

    //存放线程的集合
    private List<MyThread> threads;

    //任务队列
    private BlockingQueue<Runnable> taskQueue;

    //线程池初始限定大小
    private int threadNum;

    //已经工作的线程数目
    private int workThreadNum;

    private final ReentrantLock mainLock = new ReentrantLock();

    public MyThreadPool(int initPoolNum) {
        this.threads = new ArrayList<>(initPoolNum);
        this.taskQueue = new ArrayBlockingQueue<Runnable>(initPoolNum * 4);
        this.threadNum = initPoolNum;
        this.workThreadNum = 0;
    }

    public void executor(Runnable runnable) {
        try {
            mainLock.lock();
            //线程池未满，每加入一个任务则开启一个线程
            if (workThreadNum < threadNum) {
                MyThread myThread = new MyThread(runnable);
                myThread.start();
                threads.add(myThread);
                workThreadNum++;
            } else {
                //线程池满了,放入任务队列
                if (!taskQueue.offer(runnable)) {
                    rejectTask();
                }
            }
        } finally {
            mainLock.unlock();
        }
    }

    private void rejectTask() {
        System.out.println("任务队列已满,无法继续添加,请扩大你的线程池");
    }

    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool(5);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    MyThread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("=====任务执行=====");
            }
        };
        for (int i = 0; i < 30; i++) {
            myThreadPool.executor(task);
        }
    }

    class MyThread extends Thread {

        private Runnable task;

        public MyThread(Runnable runnable) {
            this.task = runnable;
        }

        @Override
        public void run() {
            //该线程一直启动着,不断从任务队列取出任务执行
            while (true) {
                //如果初始化任务不为空,则运行任务
                if (task != null) {
                    task.run();
                    task = null;
                    //否则去任务队列里取任务执行
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
