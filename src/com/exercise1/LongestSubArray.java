package com.exercise1;

import java.util.Stack;

/**
 * Created by wecash on 19/3/22.
 */
public class LongestSubArray {

    public static void main(String[] args) {
        int[] array = {10, 9, 2, 5, 3, 7, 101, 18};
        LongestSubArray l = new LongestSubArray();
        int len = l.longestSubArray(array);
        System.out.print(len);
    }

    private int longestSubArray(int[] array) {
        int len = 1;
        for (int i = 0; i < array.length; i++) {
            int temp = 1;
            Stack<Integer> stack = new Stack<>();
            stack.push(array[i]);
            for (int j = i + 1; j < array.length; j++) {
                int t = stack.peek();
                if (array[j] > t) {
                    stack.push(array[j]);
                    temp++;
                } else {
                }
            }
            if (len == 1) {
                len = temp;
            } else {
                if (len < temp) {
                    len = temp;
                }
            }
        }
        return len;
    }
}
