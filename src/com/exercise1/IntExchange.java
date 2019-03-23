package com.exercise1;

/**
 * Created by wecash on 19/3/23.
 */
public class IntExchange {

    public int integerReplacement(int n) {
        int c = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                n >>= 1;
            } else if (n == 3 || ((n >> 1) & 1) == 0) {
                --n;
            } else {
                ++n;
            }
            ++c;
        }
        return c;
    }


    public static void main(String[] args) {
        int n = 7;
        IntExchange i = new IntExchange();
        System.out.print(i.integerReplacement(n));
    }
}
