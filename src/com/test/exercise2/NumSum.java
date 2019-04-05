package com.test.exercise2;

/**
 * Created by wecash on 19/4/1.
 * 输入一个数，求这个数的各位数字之和。
 */
public class NumSum {

    static int sum = 0;

    public static void main(String[] args) {
        int num = 123458;
        NumSum n = new NumSum();
        n.numSum(num);
        System.out.print(sum);
    }

    private void numSum(int num) {
        if (num == 0) {
            return;
        }
        sum += num % 10;
        num = num / 10;
        numSum(num);
    }
}
