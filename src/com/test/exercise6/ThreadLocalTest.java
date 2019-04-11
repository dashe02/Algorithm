package com.test.exercise6;

/**
 * Created by wecash on 19/4/10.
 */
public class ThreadLocalTest {

    static int a = 1;

    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
            @Override
            protected Integer initialValue() {
                return a;
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Integer b = threadLocal.get();
                    b++;
                    threadLocal.set(b);
                    System.out.println("" + Thread.currentThread().getName() + " " + threadLocal.get());
                }
            }).start();
        }
    }
}
