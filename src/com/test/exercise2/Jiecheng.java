package com.test.exercise2;

/**
 * Created by wecash on 19/4/2.
 */
public class Jiecheng {

    public static void main(String[] args) {
        int n = 5;
        Jiecheng j = new Jiecheng();
        int m = j.jiecheng(n);
        System.out.print(m);
    }


    //5!=5*4*3*2*1
    //120+24+6+2+1
    private int jiecheng(int n) {
        int sum = 0;
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
            sum += f;
        }
        return sum;
    }
}
