package com.exercise7;

/**
 * Created by wecash on 19/4/13.
 */
public class Transfer {

    public static void main(String[] args) {
        int n = 10;
        transferToBinary(n);
        System.out.println();
        count(n);
    }

    private static void transferToBinary(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(n >>> i & 1);
        }
    }

    private static void count(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & 1;
        }
        System.out.print(count);
    }
}
