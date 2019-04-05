package com.test.exercise2;

/**
 * Created by wecash on 19/4/1.
 */
public class Fabinace {

    public static void main(String[] args) {
        int n = 8;
        Fabinace f = new Fabinace();
        System.out.println(f.fabinace(n));
        System.out.println(f.fabinace1(n));
    }

    //1 1 2 3 5 8 13 21
    private int fabinace(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    private int fabinace1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fabinace1(n - 1) + fabinace1(n - 2);
    }
}
