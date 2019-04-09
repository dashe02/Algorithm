package com.exercise4;

/**
 * Created by wecash on 19/4/6.
 */
public class PrintMatrixArray {

    public static void main(String[] args) {
        int[][] array = {};
        PrintMatrixArray p = new PrintMatrixArray();
        p.printMatrixArray(array);
    }

    private void printMatrixArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        printMatrixArray0(array, rows, cols);
    }

    private void printMatrixArray0(int[][] nums, int rows, int cols) {
        if (nums == null || rows <= 0 || cols <= 0) {
            return;
        }
        int start = 0;
        while (start * 2 < cols && start * 2 < rows) {
            printMatrixInCycle(nums, rows, cols, start);
            start++;
        }
    }

    private void printMatrixInCycle(int[][] nums, int rows, int cols, int start) {
        //终止列号
        int endX = cols - 1 - start;
        //终止行号
        int endY = rows - 1 - start;
        //从左向右打印一行
        for (int i = start; i <= endX; i++) {
            System.out.print(nums[start][i] + " ");
        }
        //从上到下打印一列
        if (endY > start) {
            for (int i = start + 1; i <= endY; i++) {
                System.out.print(nums[i][endX] + " ");
            }
        }
        //从右至左打印一行
        if (endY > start && endX > start) {
            for (int i = endX - 1; i >= start; i--) {
                System.out.print(nums[endY][i] + " ");
            }
        }
        //从下向上打印一列
        if (endY - 1 > start && endX > start) {
            for (int i = endY - 1; i >= start + 1; i--) {
                System.out.print(nums[i][start] + " ");
            }
        }
    }
}
