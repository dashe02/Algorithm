package com.example.pattern;

/**
 * Created by wecash on 19/2/23.
 */
public class Sington {

    private Sington() {

    }

    private static final class LazyHolder {
        private static final Sington instance = new Sington();
    }

    public static final Sington getSington() {
        return LazyHolder.instance;
    }
}
