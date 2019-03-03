package com.example.fb;

/**
 * Created by wecash on 19/2/27.
 */
public class Fabinate {
    public static void main(String[] args) {
        Fabinate f = new Fabinate();
        System.out.println(f.fabinate(8));
        System.out.println(f.fabinate1(8));
    }

    private int fabinate1(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c= a + b;
            a = b;
            b = c;
        }
        return c;
    }

    private int fabinate(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fabinate(n - 1) + fabinate(n - 2);
        }
    }

}
