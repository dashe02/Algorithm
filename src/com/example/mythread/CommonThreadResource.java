package com.example.mythread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wecash on 19/3/8.
 */
public class CommonThreadResource {

    ReentrantLock lock = new ReentrantLock();

    Condition aCondition = lock.newCondition();

    Condition bCondition = lock.newCondition();

    volatile boolean flag = false;

    public void doA() {
        while (true) {
            try {
                lock.lock();
                if (flag) {
                    try {
                        aCondition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("A");
                flag = true;
                bCondition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    public void doB() {
        while (true) {
            try {
                lock.lock();
                if (!flag) {
                    try {
                        bCondition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("B");
                flag = false;
                aCondition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }
}
