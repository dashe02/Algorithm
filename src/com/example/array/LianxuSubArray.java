package com.example.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wecash on 19/2/22.
 */
public class LianxuSubArray {

    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 2, 4};
        //3,1,2,4,31,12,24,312,124,3124
        //1.元素有一个的
        //2.元素有2个的
        //3.元素有3个的
        //4.元素有4个的
        List<List<String>> lists = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            zuhe(i, array, lists);
        }
        //System.out.println(lists);
        int sum = 0;
        for (List<String> one : lists) {
            int min = getMin(one);
            sum += min;
        }
        System.out.println(sum);
    }

    private static void zuhe(int i, int[] array, List<List<String>> lists) {
        //System.out.println(i);
        Stack<String> stack = new Stack<>();
        stack.push(array[i] + ",");
        for (int j = i + 1; j < array.length; j++) {
            String data = stack.pop();
            String temp = data;
            stack.push(data);
            String newStr = temp + array[j] + ",";
            stack.push(newStr);
            temp = null;
        }
        while (!stack.isEmpty()) {
            String result = stack.pop();
            String[] sArr = result.split(",");
            List<String> arrayResult = new ArrayList<>();
            for (String s : sArr) {
                if (s != null && !s.equals(""))
                    arrayResult.add(s);
            }
            lists.add(arrayResult);
        }
    }

    private static int getMin(List<String> one) {
        int min = Integer.parseInt(one.get(0));
        for (int i = 1; i < one.size(); i++) {
            int val = Integer.parseInt(one.get(i));
            if (min > val) {
                min = val;
            }
        }
        return min;
    }
}
