package com.exercise3;

/**
 * Created by wecash on 19/3/27.
 */
public class MySqrt {

    public static void main(String[] args) {
        int n = 20;
        MySqrt m = new MySqrt();
        int result = m.mysqrt(0, n, n);
        System.out.print(result);
    }

    //0 8 mid=4
    //0 3 mid=1
    //2 3
    private int mysqrt(int left, int right, int n) {
        if (left > right) {
            return right;
        }
        int mid = left + (right - left) / 2;
        //System.out.print(mid);
        int temp = mid * mid;
        if (temp == n) {
            return mid;
        } else if (temp > n) {
            return mysqrt(left, mid - 1, n);
        } else if (temp < n) {
            return mysqrt(mid + 1, right, n);
        }
        return 0;
    }
}
