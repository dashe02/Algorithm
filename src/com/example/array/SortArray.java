package com.example.array;

import java.util.Arrays;

/**
 * Created by wecash on 19/2/26.
 */
public class SortArray {

    public static void main(String[] args) {
        int[] array=new int[]{3,2,1,7,0,4,5};
        SortArray s=new SortArray();
        s.sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    private void sortArray(int[] array) {
        //偶数位 3,1,0,5
        //奇数位 2,7,4
        //0,1,3,5  7,4,2
        //0,7,1,4,3,2,5

    }
}
