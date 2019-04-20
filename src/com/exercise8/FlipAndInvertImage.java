package com.exercise8;

/**
 * Created by wecash on 19/4/15.
 */
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int rows = A.length;
        int cols = 0;
        if (rows != 0)
            cols = A[0].length;
        int[][] temp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int k = cols - 1;
            for (int j = 0; j < cols; j++) {
                temp[i][k--] = A[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (temp[i][j] == 0) {
                    temp[i][j] = 1;
                } else if (temp[i][j] == 1) {
                    temp[i][j] = 0;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[][] A = new int[3][3];
        A[0][0] = 1;
        A[0][1] = 1;
        A[0][2] = 0;

        A[1][0] = 1;
        A[1][1] = 0;
        A[1][2] = 1;

        A[2][0] = 0;
        A[2][1] = 0;
        A[2][2] = 0;
        FlipAndInvertImage f = new FlipAndInvertImage();
        f.flipAndInvertImage(A);
    }
}
