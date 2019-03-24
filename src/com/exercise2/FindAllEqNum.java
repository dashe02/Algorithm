package com.exercise2;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by wecash on 19/3/23.
 */
public class FindAllEqNum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        FindAllEqNum f = new FindAllEqNum();
        int target = 10;
        f.findAllEqNum(array, target);
    }

    private void findAllEqNum(int[] array, int target) {
        Set<String> result=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int m = i;
            int tempVal = 0;
            Stack<Integer> stack = new Stack<>();
            while (m < array.length) {
                if (tempVal + array[m] < target) {
                    stack.push(m);
                    tempVal = tempVal + array[m];
                    m++;
                } else {
                    if (tempVal + array[m] == target) {
                        StringBuilder sb = new StringBuilder();
                        for (int j = 0; j < stack.size(); j++) {
                            sb.append(array[stack.get(j)]).append("=");
                        }
                        sb.append(array[m]);
                        result.add(sb.toString());
                    }
                    if (stack.size() > 0) {
                        int n = stack.pop();
                        tempVal = tempVal - array[n];
                        for (; array[m] == array[n]; m++) ;
                        m = n + 1;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.print(result);
    }
}
