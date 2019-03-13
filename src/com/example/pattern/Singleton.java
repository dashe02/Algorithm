package com.example.pattern;

/**
 * Created by wecash on 19/3/10.
 */
public class Singleton {

    private final static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
