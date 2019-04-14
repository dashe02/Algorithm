package com.exercise7;

import java.util.Stack;

/**
 * Created by wecash on 19/4/13.
 */
public class StringToInterger {
    public static void main(String[] args) {
        String str = "42";
        int result = strToInteger(str);
        System.out.print(result);
    }

    private static int strToInteger(String str) {
        char[] chars = str.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i] - '0');
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
