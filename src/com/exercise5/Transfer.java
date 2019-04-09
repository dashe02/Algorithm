package com.exercise5;

/**
 * Created by wecash on 19/4/8.
 */
public class Transfer {
    public static void main(String[] args) {
        //transferBinary();
        System.out.print(count(10));
    }

    private static void transferBinary() {
        int n = 10;
        for (int i = 31; i >= 0; i--) {
            System.out.print(n >>> i & 1);
        }
    }

    public static int count(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
