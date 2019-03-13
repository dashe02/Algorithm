package com.example.array;

/**
 * Created by wecash on 19/3/12.
 */
public class SumOfTwo {

    public static void main(String[] args) {
        SumOfTwo s = new SumOfTwo();
        System.out.println(s.add(20, 10));
        System.out.println(s.minus(20, 10));
    }

    private int minus(int a, int b) {
        return add(a, add(~b, 1));
    }

    private int add(int a, int b) {
        int sum = a;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }

}
