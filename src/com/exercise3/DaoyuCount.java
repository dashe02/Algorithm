package com.exercise3;

/**
 * Created by wecash on 19/3/29.
 */
public class DaoyuCount {

    static int daoyu[][] =
            {
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 1, 1, 1, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0, 1, 1, 0},
                    {0, 0, 0, 0, 0, 1, 1, 0},
                    {0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1},
            };

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < daoyu.length; i++) {
            for (int j = 0; j < daoyu[i].length; j++) {
                if (daoyu[i][j] == 1) {
                    count++;
                    lj(i, j);
                }
            }
        }
        System.out.print(count);
    }


    private static void lj(int i, int j) {
        daoyu[i][j] = 2;
        //上边
        if (i - 1 >= 0 && daoyu[i - 1][j] == 1)
            lj(i - 1, j);
        //下边
        if (i + 1 < daoyu.length && daoyu[i + 1][j] == 1)
            lj(i + 1, j);
        //左边
        if (j - 1 >= 0 && daoyu[i][j - 1] == 1)
            lj(i, j - 1);
        //右边
        if (j + 1 < daoyu.length && daoyu[i][j + 1] == 1)
            lj(i, j + 1);
    }
}
