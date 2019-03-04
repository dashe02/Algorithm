package com.example.array;

/**
 * Created by wecash on 19/3/4.
 */
public class SumOfSquareNum {

    public boolean isSumOfSquareNum(int target) {
        int i = 0, j = (int) Math.sqrt(target);
        while (i <= j) {
            int powNum = i * i + j * j;
            if (powNum == target) {
                return true;
            } else if (powNum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SumOfSquareNum s = new SumOfSquareNum();
        System.out.println(s.isSumOfSquareNum(3));
    }
}
