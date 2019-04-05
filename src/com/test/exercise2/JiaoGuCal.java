package com.test.exercise2;

/**
 * Created by wecash on 19/4/1.
 * 角谷定理。输入一个自然数，若为偶数，则把它除以2，若为奇数，则把它乘以3加1。
 * 经过如此有限次运算后，总可以得到自然数值1。求经过多少次可得到自然数1。如：输入22，输出
 * 22  11  34  17  52  26  13  40  20  10  5  16  8  4  2  1
 * STEP=16
 */
public class JiaoGuCal {

    static int step = 1;

    public static void main(String[] args) {
        int num = 22;
        JiaoGuCal j = new JiaoGuCal();
        j.jiaoGuCal(num);
        System.out.print(step);
    }

    private void jiaoGuCal(int num) {
        if (num == 1) {
            return;
        }
        if (num % 2 == 0) {
            num = num / 2;
        } else if (num % 2 == 1) {
            num = num * 3 + 1;
        }
        step++;
        jiaoGuCal(num);
    }
}
