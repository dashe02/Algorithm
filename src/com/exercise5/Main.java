package com.exercise5;

import com.exercise5.thread.OddEvenThread;

/**
 * Created by wecash on 19/4/6.
 */
public class Main {

    public static void main(String[] args) {
        new Thread(new OddEvenThread(), "奇线程").start();
        new Thread(new OddEvenThread(), "偶线程").start();
    }
}
