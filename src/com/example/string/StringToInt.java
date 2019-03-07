package com.example.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wecash on 19/3/7.
 */
public class StringToInt {

    public static void main(String[] args) {
        String str = "-123";
        int result = stringToInt(str);
        System.out.print(result);
    }

    private static int stringToInt(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        if (isNotNumStr(str)) {
            return 0;
        }
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '+') {
                continue;
            }
            if (c == '-') {
                flag = true;
                continue;
            }
            int one = c - '0';
            temp = temp * 10 + one;
        }
        if (flag) {
            temp = 0 - temp;
        }
        return temp;
    }

    private static boolean isNotNumStr(String str) {
        String regex = "^(\\+)|([0-9]*)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return !m.find();
    }
}
