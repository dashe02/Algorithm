package com.exercise.thread;

import sun.misc.Unsafe;

/**
 * Created by wecash on 19/3/14.
 */
public class ThreadTest {

    volatile static int index = 0;

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (index == 0) {
                        System.out.print("A");
                    }
                    Unsafe.getUnsafe().compareAndSwapInt(index, 0, 0, 1);
                }
            }
        });
        threadA.start();
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (index == 1) {
                        System.out.print("B");
                    }
                    Unsafe.getUnsafe().compareAndSwapInt(index, 0, 1, 0);
                }
            }
        });
        threadB.start();
    }
}
