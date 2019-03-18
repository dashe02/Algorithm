package com.exercise.array;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by wecash on 19/3/18.
 */
public class FindSumToOne {

    public static void main(String[] args) {
        int n = 6;
        int m = 8;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        FindSumToOne f = new FindSumToOne();
        f.findSumToOne(array, m);
    }

    private void findSumToOne(int[] array, int sum) {
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int m = i;
            Stack<Integer> stack = new Stack<>();
            int tempVal = 0;
            while (m < array.length) {
                if (tempVal + array[m] < sum) {
                    stack.push(m);
                    tempVal = tempVal + array[m];
                    m++;
                } else {
                    if (tempVal + array[m] == sum) {
                        StringBuilder sb = new StringBuilder();
                        for (int j = 0; j < stack.size(); j++) {
                            sb.append(array[stack.get(j)]).append(" ");
                        }
                        sb.append(array[m]);
                        stringSet.add(sb.toString());
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
        System.out.print(stringSet);
    }
}
