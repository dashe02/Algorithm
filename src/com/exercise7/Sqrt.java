package com.exercise7;

/**
 * Created by wecash on 19/4/13.
 */
public class Sqrt {

    public static void main(String[] args) {
        int n = 9;
        int r = sqrt(n);
        System.out.print(r);
    }

    //0,9
    private static int sqrt(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int x = mid * mid;
            if (x == n) {
                return mid;
            } else if (x > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left * left > n) {
            left = left - 1;
        }
        return left;
    }

}
