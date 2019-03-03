package com.test.test.mythread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wecash on 19/2/28.
 */
public class SThreadPool {

    private List<SThread> sThreadList;

    private BlockingQueue<Runnable> taskQueue;

    private int threadNum;

    private int workThreadNum = 0;

    private ReentrantLock mainLock = new ReentrantLock();

    public SThreadPool(int initThread) {
        sThreadList = new ArrayList<>(initThread);
        taskQueue = new ArrayBlockingQueue<Runnable>(initThread * 4);
        threadNum = initThread;
    }

    public void executor(Runnable runnable) {
        try {
            mainLock.lock();
            if (workThreadNum <= threadNum) {
                SThread sThread = new SThread(runnable);
                sThread.start();
                sThreadList.add(sThread);
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
        System.out.println("========队列满了=======");
    }

    class SThread extends Thread {

        private Runnable task;

        public SThread(Runnable task) {
            this.task = task;
        }

        @Override
        public void run() {
            while (true) {
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

    public static void main(String[] args) {
        SThreadPool sThreadPool = new SThreadPool(5);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("=====任务运行=====");
            }
        };
        for (int i = 0; i < 30; i++) {
            sThreadPool.executor(task);
        }
    }
}
