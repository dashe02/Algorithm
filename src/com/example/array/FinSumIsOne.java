package com.example.array;

import java.util.Stack;

/**
 * Created by wecash on 19/2/26.
 */
public class FinSumIsOne {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 5, 6, 7, 10};
        FinSumIsOne f = new FinSumIsOne();
        f.finSumIsOne1(array, 10);
    }

    private void finSumIsOne(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + ":" + array[j]);
                }
            }
        }
    }

    private void finSumIsOne1(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            Stack<String> stack = new Stack<>();
            int sum = array[i];
            stack.push(array[i] + ",");
            for (int j = i + 1; j < array.length; j++) {
                if (sum == target) {
                    System.out.println(stack.pop());
                    break;
                } else if (sum > target) {

                } else if (sum < target) {
                    sum += array[j];
                    String origin = stack.pop();
                    origin += array[j];
                    stack.push(origin);
                }

            }
        }
    }

}
