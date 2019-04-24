package com.exercise8;

/**
 * Created by wecash on 19/4/23.
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || "".equals(s)) return true;
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (notOk(chars[i])) {
                i++;
            } else if (notOk(chars[j])) {
                j--;
            } else {
                if (String.valueOf(chars[i]).equalsIgnoreCase(String.valueOf(chars[j]))) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean notOk(char aChar) {
        return !((aChar >= 'a' && aChar <= 'z') || (aChar >= 'A' && aChar <= 'z')
                || (aChar >= 'a' && aChar <= 'Z') || (aChar >= 'A' && aChar <= 'Z'));
    }

    public static void main(String[] args) {
        String s = "OP";
        System.out.print(isPalindrome(s));
    }
}
