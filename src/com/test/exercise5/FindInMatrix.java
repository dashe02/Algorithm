package com.test.exercise5;

/**
 * Created by wecash on 19/4/9.
 */
public class FindInMatrix {
    public boolean findInMatrix(int[][] matrix, int target) {
        int rows = 0;
        int cols = matrix[0].length;
        while (rows <= matrix.length - 1 && cols >= 0) {
            if (matrix[rows][cols] == target) {
                return true;
            } else if (target > matrix[rows][cols]) {
                cols++;
            } else {
                rows--;
            }
        }
        return false;
    }
}
