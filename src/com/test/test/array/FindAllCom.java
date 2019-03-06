package com.test.test.array;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by wecash on 19/3/6.
 */
public class FindAllCom {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 7, 9, 10, 11};
        int target = 10;
        Arrays.sort(array);
        FindAllCom f = new FindAllCom();
        f.findAll(array, target);
    }


    private void findAll(int[] array, int sum) {
        Stack<Integer> stack = new Stack<>();
        int m = 0;
        int tempSum = 0;
        while (m < array.length) {
            if (array[m] + tempSum < sum) {
                stack.push(m);
                tempSum = tempSum + array[m];
                m++;
            } else {
                if (array[m] + tempSum == sum) {
                    for (int j = 0; j < stack.size(); j++) {
                        System.out.print(array[stack.get(j)] + " ");
                    }
                    System.out.print(array[m] + "\n");
                }
                if (stack.size() > 0) {
                    int n = stack.pop();
                    tempSum = tempSum - array[n];
                    m = n + 1;
                    for (; array[m] == array[n]; m++) ;
                } else {
                    break;
                }
            }
        }
    }
}
