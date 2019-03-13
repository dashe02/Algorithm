package com.exercise.array;

import java.util.Stack;

/**
 * Created by wecash on 19/3/13.
 */
public class SumOfAll {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 1, 1, 5, 6};
        int sum = 10;
        SumOfAll s = new SumOfAll();
        s.sumOfAll(array, sum);
    }

    private void sumOfAll(int[] array, int sum) {
        int m = 0;
        int tempVal = 0;
        Stack<Integer> stack = new Stack<>();
        while (m < array.length) {
            if (tempVal + array[m] < sum) {
                stack.push(m);
                tempVal = tempVal + array[m];
                m++;
            } else {
                if (tempVal + array[m] == sum) {
                    for (int j = 0; j < stack.size(); j++) {
                        System.out.print(array[stack.get(j)] + " ");
                    }
                    System.out.print(array[m] + "\n");
                }
                if (stack.size() > 0) {
                    int n = stack.pop();
                    tempVal = tempVal - array[n];
                    m = n + 1;
                    //for (; array[m] == array[n]; m++) ;
                } else {
                    break;
                }
            }
        }
    }
}
