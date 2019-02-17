package com.example.string;

/**
 * Created by wecash on 19/2/17.
 */
public class ReverseString {

    public String reverseString(String s) {
        if (s == null || s.equals("")) {
            return null;
        }
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "I am a teacher";
        ReverseString r = new ReverseString();
        System.out.println(r.reverseString(s));
    }
}
