package com.test.test.array;

/**
 * Created by wecash on 19/3/4.
 */
public class SumOfArray {

    public static void main(String[] args) {
        SumOfArray s = new SumOfArray();
        System.out.println(s.isSumOfArray(3));
    }

    private boolean isSumOfArray(int c) {
        int i = 0, j = (int) Math.sqrt(c);
        while (i <= j) {
            int powNum = i * i + j * j;
            if (powNum == c) {
                return true;
            } else if (powNum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
