package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by wecash on 19/3/6.
 */
public class MThreadPool {


    public List<MThread> threadList;

    public BlockingQueue<Runnable> taskQueue;

    public int workThreadNum;

    public int threadNum;

    public MThreadPool(int initThreadNum) {
        threadList = new ArrayList<>(initThreadNum);
        taskQueue = new ArrayBlockingQueue<Runnable>(initThreadNum * 4);
        workThreadNum = 0;
        threadNum = initThreadNum;
    }

    public void executor(Runnable runnable) {
        if (workThreadNum <= threadNum) {
            MThread mThread = new MThread(runnable);
            mThread.start();
            threadList.add(mThread);
            workThreadNum++;
        } else {
            if (!taskQueue.offer(runnable)) {
                rejectTask();
            }
        }
    }

    private void rejectTask() {
        System.out.println("=======线程池满了======");
    }

    public static void main(String[] args) {
        MThreadPool mThreadPool = new MThreadPool(5);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    MThread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("======任务执行=====");
            }
        };
        for (int i = 0; i < 30; i++) {
            mThreadPool.executor(runnable);
        }
    }


    class MThread extends Thread {

        private Runnable task;

        public MThread(Runnable task) {
            this.task = task;
        }

        public void run() {
            while (true) {
                if (task != null) {
                    task.run();
                    task =null;
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
