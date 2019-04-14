package com.exercise7;

import java.util.Stack;

/**
 * Created by wecash on 19/4/13.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int n = 123;
        int r = reverseInteger(n);
        System.out.print(r);
    }

    private static int reverseInteger(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            stack.push(n % 10);
            n = n / 10;
        }
        int result = 0;
        int temp = 1;
        while (!stack.isEmpty()) {
            result += temp * stack.pop();
            temp = temp * 10;
        }
        return result;
    }
}
