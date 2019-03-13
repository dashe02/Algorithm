package com.example.mythread;

/**
 * Created by wecash on 19/3/8.
 */
public class ThreadTest {

    public static void main(String[] args) {

        CommonThreadResource commonThreadResource = new CommonThreadResource();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                commonThreadResource.doA();
            }
        });

        threadA.start();

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                commonThreadResource.doB();
            }
        });
        threadB.start();

    }


}
