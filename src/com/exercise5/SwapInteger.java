package com.exercise5;

/**
 * Created by wecash on 19/4/8.
 */
public class SwapInteger {

    public static void main(String[] args) {
        Integer a = 129;
        Integer b = 200;
        System.out.println("a:" + a + ",b:" + b);
        SwapInteger s = new SwapInteger();
        s.swap(a, b);
        System.out.println("after a:" + a + ",b:" + b);
    }

    private void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
