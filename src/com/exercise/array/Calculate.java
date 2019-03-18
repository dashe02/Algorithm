package com.exercise.array;

import java.util.Stack;

/**
 * Created by wecash on 19/3/18.
 */
public class Calculate {

    public static void main(String[] args) {
        /*int x = 3;
        int f = 5;
        int d = 100;
        int p = 10;
        Calculate c = new Calculate();
        int days = c.calculate(x, f, p, d);
        System.out.print(days);*/
    }

    /*private int calculate(int x, int f, int p, int d) {
        return (d + f * p) / (x + p);
    }*/

    public int get(int n, int k) {
        //产生的数字在1到k之间
        //长度为n
        //前面到数字和后面到数字满足 A<=B || A mod B !=0
        int count = 0;
        if (n < 2) {
            return 1;
        } else {
            for (int i = 1; i < k; i++)
                if (k % i != 0)
                    count += get(n - 1, i);
        }
        return 0;
    }
}
