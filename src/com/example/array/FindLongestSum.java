package com.example.array;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/6.
 */
public class FindLongestSum {

    public static void main(String[] args) {
        int[] array = {1, -1, 1, -1, 1, -1, 1, -1};
        Arrays.sort(array);
        FindLongestSum f = new FindLongestSum();
        System.out.print(f.findLongest(array, 0));
    }

    private int findLongest(int[] array, int sum) {
        int temp = array[0];
        int length = 0;
        for (int i = 1; i < array.length; i++) {
            if (temp == sum) {
                break;
            }
            temp += array[i];
            length++;
        }
        return length + 1;
    }
}
