package com.test.test.array;

import java.util.Stack;

/**
 * Created by wecash on 19/3/7.
 */
public class FindAll {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 9, 10};
        FindAll f = new FindAll();
        f.findAll(array, 10);
    }

    private void findAll(int[] array, int sum) {
        int m = 0;
        int tempVal = 0;
        Stack<Integer> stack = new Stack<>();
        while (m < array.length) {
            if (array[m] + tempVal < sum) {
                stack.push(m);
                tempVal = tempVal + array[m];
                m++;
            } else {
                if (array[m] + tempVal == sum) {
                    for (int i = 0; i < stack.size(); i++) {
                        System.out.print(array[stack.get(i)] + " ");
                    }
                    System.out.print(array[m] + "\n");
                }
                if (stack.size() > 0) {
                    int n = stack.pop();
                    tempVal = tempVal - array[n];
                    m = n + 1;
                    for (; array[m] == array[n]; m++) ;
                } else {
                    break;
                }
            }
        }
    }
}
