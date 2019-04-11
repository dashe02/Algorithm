package com.exercise5;

/**
 * Created by wecash on 19/4/9.
 */
public class Singleton {

    private Singleton() {

    }

    private static class Holder {
        private final static Singleton singleton = new Singleton();
    }

    public static Singleton getSingleton() {
        return Holder.singleton;
    }
}
