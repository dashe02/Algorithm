package com.exercise1;

/**
 * Created by wecash on 19/3/21.
 */
public class MinPath {

    public static void main(String[] args) {
        MinPath m = new MinPath();
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 3;
        array[0][2] = 1;

        array[1][0] = 1;
        array[1][1] = 5;
        array[1][2] = 1;

        array[2][0] = 4;
        array[2][1] = 2;
        array[2][2] = 1;
        int minPath = m.getMinPath(array);
        System.out.print(minPath);
    }

    private int getMinPath(int[][] array) {
        int rows = array.length;
        int cols = 0;
        if (rows != 0) {
            cols = array[0].length;
        }
        int[][] dp = new int[rows + 1][cols + 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = array[0][0];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + array[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + array[i][j];
                } else {
                    if (dp[i - 1][j] < dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j] + array[i][j];
                    } else {
                        dp[i][j] = dp[i][j - 1] + array[i][j];
                    }
                }
            }
        }
        return dp[rows - 1][cols - 1];
    }
}
