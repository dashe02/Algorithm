package com.exercise8;

import java.math.BigInteger;

/**
 * Created by wecash on 19/4/15.
 */
public class ZeroCount {

    //5!
    public int trailingZeroes(int n) {
        if (n == 0) return 0;
        BigInteger result = BigInteger.ONE;
        for (int i = n; i >= 1; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
        int count = 0;
        String r = result.toString();
        for (int i = r.length() - 1; i >= 0; i--) {
            char c = r.charAt(i);
            if (c == '0') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ZeroCount z = new ZeroCount();
        System.out.print(z.trailingZeroes(13));
    }
}
