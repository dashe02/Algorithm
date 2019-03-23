package com.test.test.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wecash on 19/3/7.
 */
public class ReverseStringEmp {

    public static void main(String[] args) {
        //String str = "AB#$CompareTwoVersion%D";
        String str="abcd";
        ReverseStringEmp r = new ReverseStringEmp();
        //System.out.print(r.reverseStringEmp(str));
        System.out.print(r.isZiMu(str));
    }

    private String reverseStringEmp(String str) {
        return null;
    }

    public boolean isZiMu(String c) {
        String regex = "^([a-z]|[A-Z])*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(c);
        if (m.find()) {
            return true;
        }
        return false;
    }
}
