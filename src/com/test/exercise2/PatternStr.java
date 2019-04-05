package com.test.exercise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wecash on 19/4/1.
 */
public class PatternStr {
    public static void main(String[] args) {
        String str = "134.1";
        PatternStr p = new PatternStr();
        boolean isOk = p.patternStr(str);
        System.out.print(isOk);
    }

    private boolean patternStr(String str) {
        Pattern p = Pattern.compile("^\\d{3}.\\d{1}$");
        Matcher m = p.matcher(str);
        return m.find();
    }
}
