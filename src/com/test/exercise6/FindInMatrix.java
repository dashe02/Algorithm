package com.test.exercise6;

/**
 * Created by wecash on 19/4/10.
 */
public class FindInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {};
        int target = 10;
        boolean isFind = findinMatrix(matrix, target);
        System.out.print(isFind);
    }

    private static boolean findinMatrix(int[][] matrix, int target) {
        int rows = 0;
        int cols = matrix[0].length;
        while (rows <= matrix.length - 1 && cols >= 0) {
            if (matrix[rows][cols] == target) {
                return true;
            } else if (matrix[rows][cols] > target) {
                cols++;
            } else {
                rows--;
            }
        }
        return false;
    }
}
