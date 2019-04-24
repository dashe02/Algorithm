package com.exercise8;

/**
 * Created by wecash on 19/4/21.
 */
public class Mysqrt {

    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1;
        int right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int temp = mid * mid;
            if (temp == x) {
                return mid;
            } else if (temp > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left * left > x) {
            left = left - 1;
        }
        return left;
    }
}
