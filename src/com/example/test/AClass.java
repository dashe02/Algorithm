package com.example.test;

/**
 * Created by wecash on 19/2/27.
 */
public class AClass {

    private void aMethod() {
        System.out.println("aMethod");
    }

    public static void main(String[] args) {
        AClass aClass =  (AClass) null;
        aClass.aMethod();
    }

}
