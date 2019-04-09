package com.test.exercise5;

/**
 * Created by wecash on 19/4/8.
 */
public class BinaryCount {

    public static void main(String[] args) {
        int n = 10;
        transferToBinary(n);
        System.out.println();
        getCount(n);
    }

    private static void getCount(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        System.out.println(count);
    }

    private static void transferToBinary(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(n >>> i & 1);
        }
    }
}
