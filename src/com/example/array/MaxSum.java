package com.example.array;

/**
 * Created by wecash on 19/2/23.
 * n个整数,找出连续的m个加和是最大
 * 1,5,7,0,4,3,2
 * 15,57,70,04,43,32
 * 157,570,704,043,432
 * 1570,5704,7043,0432
 */
public class MaxSum {

    public int findMaxSum(int[] array, int m) {
        int result = 0;
        for (int i = 0; i < array.length - m + 1; i++) {
            int max = 0;
            max += array[i];
            System.out.println(array[i]);
            for (int j = i + 1; j < (i + m) && (i + m <= array.length); j++) {
                System.out.println(array[j]);
                max += array[j];
            }
            if (result < max) {
                result = max;
            }
            System.out.println("=========");
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 7, 0, 4, 3, 2};
        MaxSum m = new MaxSum();
        System.out.println(m.findMaxSum(array, 4));
    }

}
