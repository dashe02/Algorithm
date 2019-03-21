package com.exercise1;

/**
 * Created by wecash on 19/3/20.
 */
public class IntReverse {

    public static void main(String[] args) {
        int a = -123;
        IntReverse i = new IntReverse();
        System.out.print(i.reverse(a));
    }

    private int reverse(int a) {
        boolean flag = false;
        if (a < 0) {
            flag = true;
            a = -a;
        }
        int y = 0;
        while (a > 0) {
            y = y * 10 + a % 10;
            a = a / 10;
        }
        if (y < Math.pow(2, -31) || y > Math.pow(2, 31) - 1) {
            return 0;
        }
        if (flag) {
            y = -y;
        }
        return y;
    }
}
