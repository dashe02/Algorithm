package com.example.array;

/**
 * Created by wecash on 19/3/6.
 */
public class Shunshizhen {

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int a = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = a + j;
            }
            a += 4;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


    }
}
