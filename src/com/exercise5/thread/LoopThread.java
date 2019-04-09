package com.exercise5.thread;

import java.util.concurrent.Semaphore;

/**
 * Created by wecash on 19/4/6.
 * 通过N个线程顺序循环打印从0至100，如给定N=3则输出:
     thread0: 0
     thread1: 1
     thread2: 2
     thread0: 3
     thread1: 4
 */
public class LoopThread {

    static int result = 0;

    public static void main(String[] args) throws InterruptedException {
        int N = 3;
        Thread[] threads = new Thread[N];
        final Semaphore[] synObjects = new Semaphore[N];
        for (int i = 0; i < N; i++) {
            synObjects[i] = new Semaphore(1);
            if (i != N - 1) {
                synObjects[i].acquire();
            }
        }
        for (int i = 0; i < N; i++) {
            final Semaphore lastSemaphore = i == 0 ? synObjects[N - 1] : synObjects[i - 1];
            final Semaphore currentSemaphore = synObjects[i];
            final int index = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            lastSemaphore.acquire();
                            System.out.println("thread" + index + ": " + result++);
                            if (result > 100) {
                                System.exit(0);
                            }
                            currentSemaphore.release();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            threads[i].start();
        }
    }
}
