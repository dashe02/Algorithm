package com.exercise5;

/**
 * Created by wecash on 19/4/7.
 * https://blog.csdn.net/qq_37429553/article/details/80726246
 */
public class SumOfTwo {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        SumOfTwo s = new SumOfTwo();
        String result = s.sumOfTwo(a, b);
        System.out.print(result);
    }

    private String sumOfTwo(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int al = a.length() - 1;
        int bl = b.length() - 1;
        int carray = 0;
        while (al >= 0 || bl >= 0) {
            int sum = carray;
            if (al >= 0) {
                sum += (a.charAt(al) - '0');
                al--;
            }
            if (bl >= 0) {
                sum += (b.charAt(bl) - '0');
                bl--;
            }
            sb.append(sum % 2);
            carray = sum / 2;
        }
        if (carray != 0)
            sb.append(1);
        return sb.reverse().toString();
    }
}
