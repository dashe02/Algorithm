package com.exercise5;

/**
 * Created by wecash on 19/4/7.
 */
public class PrintMatrix {

    public static void main(String[] args) {
        int[][] matrix = {};
        PrintMatrix p = new PrintMatrix();
        p.printMatrix(matrix);
    }

    private void printMatrix(int[][] matrix) {
        help(matrix, matrix.length, matrix[0].length);
    }


    private void help(int[][] matrix, int rows, int cols) {
        int start = 0;
        while (start * 2 < cols && start * 2 < rows) {
            printMatrixInCycle(matrix, rows, cols, start);
            start++;
        }
    }


    private void printMatrixInCycle(int[][] matrix, int rows, int cols, int start) {
        int endX = cols - start - 1;
        int endY = rows - start - 1;
        //从左往右打印
        for (int i = start; i < endX; i++) {
            System.out.print(matrix[start][i] + " ");
        }
        //从上往下打印
        if (endY > start) {
            for (int i = start + 1; i <= endY; i++) {
                System.out.print(matrix[i][endX] + " ");
            }
        }
        //从右往左打印
        if (endY > start && endX > start) {
            for (int i = endX - 1; i >= start; i--) {
                System.out.print(matrix[endY][i] + " ");
            }
        }
        //从下往上打印
        if (endY - 1 > start && endX > start) {
            for (int i = endY - 1; i >= start + 1; i--) {
                System.out.print(matrix[i][start] + " ");
            }
        }
    }
}
