package com.example.find;

import java.util.*;

/**
 * Created by wecash on 19/3/5.
 */
public class FindSumOfTwo {

    public void findTwoNumForSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + "====" + array[j]);
                }
            }
        }

    }

    public void findTwoNumForSum1(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer key = target - array[i];
            map.put(key, i);
        }
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i]) && i != map.get(array[i])) {
                //System.out.println(array[i] + "==" + array[map.get(array[i])]);
                int a1 = array[i] <= array[map.get(array[i])] ? array[i] : array[map.get(array[i])];
                int a2 = array[i] >= array[map.get(array[i])] ? array[i] : array[map.get(array[i])];
                stringSet.add(a1 + "," + a2);
            }
        }
        for (String str : stringSet) {
            System.out.println(str);
        }
    }


    public void findAll(int array[], int sum) {
        Stack<Integer> stack = new Stack<>();
        int tempSum = 0;
        int m = 0;
        while (m < array.length) {
            if (array[m] + tempSum < sum) {
                stack.push(m);
                tempSum = tempSum + array[m];
                m++;
            } else {
                if (array[m] + tempSum == sum) {
                    for (int i = 0; i < stack.size(); i++) {
                        System.out.print(array[stack.get(i)] + " ");
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

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 7, 5, 9};
        int target = 10;
        FindSumOfTwo f = new FindSumOfTwo();
        Arrays.sort(array);
        f.findAll(array, target);
        //f.findTwoNumForSum1(array, target);
    }
}
