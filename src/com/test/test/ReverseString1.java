package com.test.test;

/**
 * Created by wecash on 19/2/25.
 */
public class ReverseString1 {

    public static void main(String[] args) {
        String str = "abcdgb";
        ReverseString1 r = new ReverseString1();
        System.out.println(r.reverseString(str));
        System.out.println(r.reverseString1(str));
    }

    private String reverseString1(String str) {
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }

    private String reverseString(String str) {
        char[] chars = str.toCharArray();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }


}
