package com.example.array;

/**
 * Created by wecash on 19/3/8.
 */
public class FinMulMax {

    public static void main(String[] args) {
        String str = "abcdefghijklmnop";
        char[] chars = str.toCharArray();
        int n = str.length() / 4;
        int[][] result = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            result[0][i] = chars[i];
        }
        for (int i = n; i <= 2 * n; i++) {
            result[i][n] = chars[i];
        }
        for (int i = 2 * n; i <= 3 * n; i++) {
            result[n][n] = chars[i];
        }
        for (int i = 3 * n; i <= 4 * n; i++) {
            result[i][0] = chars[i];
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; i++) {
                System.out.print(result[i][j]);
            }
            System.out.print("\n");
        }
    }
}
