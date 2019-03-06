package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wecash on 19/3/6.
 */
public class IPRegex {

    public static void main(String[] args) {
        String ip = "1041.95.203";
        String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(ip);
        if (m.find()) {
            System.out.println("匹配成功");
        } else {
            System.out.println("匹配不成功");
        }
    }
}
