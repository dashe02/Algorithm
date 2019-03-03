package com.example.produce;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wecash on 19/3/3.
 */
public class Resource {

    private int resource = 0;

    private ReentrantLock lock = new ReentrantLock();

    private Condition notEmpty = lock.newCondition();

    private Condition notFull = lock.newCondition();

    public void produce() {
        while (true) {
            try {
                lock.lock();
                if (resource == 10) {
                    try {
                        notFull.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("生产者生产资源:" + (++resource));
                notEmpty.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }


    public void consume() {
        while (true) {
            try {
                lock.lock();
                if (resource == 0) {
                    try {
                        notEmpty.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者消费:" + (--resource));
                notFull.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Resource resource = new Resource();
        Thread pThread = new Thread(new Runnable() {
            @Override
            public void run() {
                resource.produce();
            }
        });
        pThread.start();

        Thread cThread = new Thread(new Runnable() {
            @Override
            public void run() {
                resource.consume();
            }
        });
        cThread.start();
    }
}
