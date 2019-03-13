package com.exercise.array;

/**
 * Created by wecash on 19/3/13.
 * 求一个数的平方根
 */
public class Sqrt {

    public static void main(String[] args) {
        Sqrt s = new Sqrt();
        System.out.print(s.sqrt(9));
    }

    private int sqrt(int x) {
        int left = 1;
        int right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else if (mid * mid > x) {
                right = mid - 1;
            }
        }
        if (left * left > x) {
            return left - 1;
        }
        return left;
    }
}
