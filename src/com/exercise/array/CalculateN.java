package com.exercise.array;

import java.math.BigInteger;

/**
 * Created by wecash on 19/3/18.
 */
public class CalculateN {


    public static void main(String[] args) {
        int n = 4;
        CalculateN c = new CalculateN();
        //BigInteger num = c.calculateN(n);
        //System.out.print(num);
        //System.out.print(c.calculateTwo("2", "2"));
        String result = "2";
        // 2*2 2*2 2*2 2*2 2*2
        for (int i = 1; i < n; i++) {
            result = c.calculateTwo("2", result);
        }
        System.out.print(result);
    }

    private BigInteger calculateN(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            result = result.multiply(new BigInteger("2"));
        }
        return result;
    }

    //"328"*"28"=8*28+20*28+300*28
    //8*8*1+8*2*10
    private String calculateTwo(String one, String two) {
        char[] oneChar = one.toCharArray();
        char[] twoChar = two.toCharArray();
        int sum = 0;
        int temp = 1;
        for (int i = oneChar.length - 1; i >= 0; i--) {
            int oneInt = oneChar[i] - '0';
            int t = 1;
            oneInt *= temp;
            for (int j = twoChar.length - 1; j >= 0; j--) {
                int twoInt = twoChar[j] - '0';
                sum += oneInt * twoInt * t;
                t = t * 10;
            }
            temp = temp * 10;
        }
        //System.out.print(sum);
        return String.valueOf(sum);
    }
}
