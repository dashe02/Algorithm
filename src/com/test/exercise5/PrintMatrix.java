package com.test.exercise5;

/**
 * Created by wecash on 19/4/9.
 */
public class PrintMatrix {
    public static void main(String[] args) {
        int[][] matrix = {};
        printMatrix(matrix, matrix.length, matrix[0].length);
    }


    private static void printMatrix(int[][] matrix, int rows, int cols) {
        int start = 0;
        while (start * 2 < rows && start * 2 < cols) {
            printMatrixInCycle(matrix, rows, cols, start);
            start++;
        }
    }

    private static void printMatrixInCycle(int[][] matrix, int rows, int cols, int start) {
        int endX = cols - 1 - start;
        int endY = rows - 1 - start;
        //从左向右打印一行
        for (int i = start; i <= endX; i++) {
            System.out.print(matrix[start][i] + " ");
        }
        //从上向下打印一列
        if (endY > start) {
            for (int i = start + 1; i <= endY; i++) {
                System.out.print(matrix[i][endX] + " ");
            }
        }
        //从右向左打印一行
        if (endX > start && endY > start) {
            for (int i = endX - 1; i >= start; i--) {
                System.out.print(matrix[endY][i] + " ");
            }
        }
        if (endY - 1 > start && endX > start) {
            for (int i = endY - 1; i >= start + 1; i--) {
                System.out.print(matrix[i][start] + " ");
            }
        }
    }


}
