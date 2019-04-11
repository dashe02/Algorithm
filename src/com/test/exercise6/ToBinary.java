package com.test.exercise6;

/**
 * Created by wecash on 19/4/10.
 */
public class ToBinary {

    public static void main(String[] args) {
        transfer(10);
        System.out.println();
        count1(10);
    }

    private static void transfer(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(n >>> i & 1);
        }
    }

    private static void count1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & 1;
        }
        System.out.print(count);
    }
}
