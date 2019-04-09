package com.exercise5.thread;

/**
 * Created by wecash on 19/4/6.
 * 两个线程交替打印0~100的奇偶数：
     偶线程：0
     奇线程：1
     偶线程：2
     奇线程：3
 */
public class OddEvenThread implements Runnable {

    static int value = 0;

    @Override
    public void run() {
        while (value < 100) {
            synchronized (OddEvenThread.class) {
             System.out.println(Thread.currentThread().getName()+":"+value++);
             OddEvenThread.class.notify();
                try {
                    OddEvenThread.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
