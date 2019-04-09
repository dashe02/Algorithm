package com.exercise5;

/**
 * Created by wecash on 19/4/8.
 * https://cxyxiaowu.com/articles/2019/04/04/1554345885751.html
 */
public class FindInMatrix {

    public static void main(String[] args) {
        int[][] matrix = {};
        int target = 10;
        System.out.print(findNumInMatrix(matrix, target));
    }

    private static boolean findNumInMatrix(int[][] matrix, int target) {
        int rows = 0;
        int cols = matrix[0].length;
        while (rows <= matrix.length - 1 && cols >= 0) {
            if (target == matrix[rows][cols]) {
                return true;
            } else if (target > matrix[rows][cols]) {
                rows++;
            } else {
                cols--;
            }
        }
        return false;
    }
}
