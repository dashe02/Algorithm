package com.exercise2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wecash on 19/3/23.
 */
public class DeadLock {

    private Lock lockA = new ReentrantLock();

    private Lock lockB = new ReentrantLock();

    public void methodA() {
        try {
            lockA.lock();
            Thread.sleep(1000);
            lockB.lock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lockB.unlock();
            lockA.unlock();
        }
    }

    public void methodB() {
        try {
            lockB.lock();
            Thread.sleep(1000);
            lockA.lock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lockA.unlock();
            lockB.unlock();
        }
    }

    public static void main(String[] args) {

    }
}


