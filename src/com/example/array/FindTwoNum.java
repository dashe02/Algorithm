package com.example.array;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/4.
 */
public class FindTwoNum {

    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 15};
        int target = 9;
        FindTwoNum f = new FindTwoNum();
        System.out.print(Arrays.toString(f.findTwoNum(array, target)));
    }

    private int[] findTwoNum(int[] array, int target) {
        int i = 0, j = array.length - 1;
        while (i <= j) {
            int temp = array[i] + array[j];
            if (temp == target) {
                //return new int[]{i + 1, j + 1};
                System.out.print((i + 1) + "==" + (j + 1));
                break;
            } else if (temp > target) {
                j--;
            } else {
                i++;
            }
            System.out.println();
        }
        return null;
    }
}
