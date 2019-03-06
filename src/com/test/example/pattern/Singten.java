package com.test.example.pattern;

/**
 * Created by wecash on 19/3/4.
 */
public class Singten {


    private Singten() {

    }

    public static class Holder {
        public static final Singten singten = new Singten();
    }

    public static final Singten getSingten() {
        return Holder.singten;
    }
}
