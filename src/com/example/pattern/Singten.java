package com.example.pattern;

/**
 * Created by wecash on 19/3/10.
 */
public class Singten {

    private static Singten sington = null;


    private Singten() {

    }

    public static Singten getSington() {
        if (sington == null) {
            sington = new Singten();
        }
        return sington;
    }

}
