package com.exercise1;

/**
 * Created by wecash on 19/3/19.
 */
public class Beishu {

    public static void main(String[] args) {
        int n = 7;
        Beishu b = new Beishu();
        int sum = b.beishu(n);
        System.out.print(sum);
    }

    private int beishu(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
