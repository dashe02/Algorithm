package com.exercise8;

import java.util.Arrays;

/**
 * Created by wecash on 19/4/15.
 */
public class FindFairCandySwap {
    //A = [1,1], B = [2,2]
    public int[] fairCandySwap(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                boolean isFair = fair(i, j, A, B);
                if (isFair) {
                    return new int[]{A[i], B[j]};
                }
            }
        }
        return null;
    }


    private boolean fair(int swapA, int swapB, int[] A, int[] B) {
        //2
        int sumA = B[swapB];
        //1
        int sumB = A[swapA];
        for (int i = 0; i < A.length; i++) {
            //1
            if (i != swapA) {
                //2
                int tempA = A[i];
                //4
                sumA += tempA;
            }
        }
        for (int i = 0; i < B.length; i++) {
            if (i != swapB) {
                //3
                int tempB = B[i];
                //4
                sumB += tempB;
            }
        }
        return sumA == sumB;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 5};
        int[] B = {2, 4};
        FindFairCandySwap f = new FindFairCandySwap();
        int[] result = f.fairCandySwap(A, B);
        System.out.print(Arrays.toString(result));
    }
}
