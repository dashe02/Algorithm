package com.exercise7;

/**
 * Created by wecash on 19/4/13.
 */
public class FindInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {};
        int target = 10;
        FindInMatrix f = new FindInMatrix();
        boolean isFind = f.findInMatrix(matrix, target);
        System.out.print(isFind);
    }

    private boolean findInMatrix(int[][] matrix, int target) {
        int rows = 0;
        int cols = matrix[0].length;
        while (rows <= matrix.length - 1 && cols >= 0) {
            if (matrix[rows][cols] == target) {
                return true;
            } else if (matrix[rows][cols] > target) {
                rows++;
            } else {
                cols--;
            }
        }
        return false;
    }
}
