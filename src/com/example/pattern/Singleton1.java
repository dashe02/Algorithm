package com.example.pattern;

/**
 * Created by wecash on 19/3/10.
 */
public class Singleton1 {

    private static Singleton1 singleton1 = null;

    private Singleton1() {

    }

    public static Singleton1 getSingleton1() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
