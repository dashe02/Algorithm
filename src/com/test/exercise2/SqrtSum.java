package com.test.exercise2;

/**
 * Created by wecash on 19/4/1.
 * 转换为平方和的数组,求和等于10的数组元素之和
 */
public class SqrtSum {

    public static void main(String[] args) {
        int sum = 3;
        SqrtSum s = new SqrtSum();
        boolean isTrue = s.sqrtSum(sum);
        System.out.print(isTrue);
    }

    private boolean sqrtSum(int sum) {
        int i = 0;
        int j = (int) Math.sqrt(sum);
        while (i <= j) {
            int pom = i * i + j * j;
            if (pom == sum) {
                return true;
            } else if (pom > sum) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
