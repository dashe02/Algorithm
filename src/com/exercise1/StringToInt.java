package com.exercise1;

/**
 * Created by wecash on 19/3/20.
 */
public class StringToInt {

    public static void main(String[] args) {
        String str = "-123456";
        StringToInt s = new StringToInt();
        int strInt = s.stringToInt(str);
        System.out.print(strInt);
    }

    private int stringToInt(String str) {
        char[] chars = str.toCharArray();
        int sum = 0;
        int temp = 1;
        boolean flag = false;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[0] == '-') {
                flag = true;
            }
            char c = chars[i];
            int intC = c - '0';
            sum += intC * temp;
            temp = temp * 10;
        }
        if (sum > Math.pow(2, 31) - 1 || sum < Math.pow(2, -31)) {
            return 0;
        }
        if (flag) {
            sum = -sum;
        }
        return sum;
    }
}
