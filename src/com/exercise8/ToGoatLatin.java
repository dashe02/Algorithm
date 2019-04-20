package com.exercise8;

/**
 * Created by wecash on 19/4/15.
 */
public class ToGoatLatin {
    public static void main(String[] args) {
        String str = "I speak Goat Latin";
        ToGoatLatin t = new ToGoatLatin();
        System.out.print(t.toGoatLatin(str));
    }

    public String toGoatLatin(String str) {
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            String tran = transfer(s, i + 1);
            if (tran != null) {
                sb.append(tran).append(" ");
            }
        }
        return sb.toString().trim();
    }

    private String transfer(String s, int n) {
        if (s == null) return null;
        if ("".equals(s)) return null;
        char[] chars = s.toCharArray();
        char c = chars[0];
        StringBuilder sb = new StringBuilder();
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' ||
                c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            sb.append(s).append("ma");
        } else {
            for (int i = 1; i < chars.length; i++) {
                sb.append(chars[i]);
            }
            sb.append(c).append("ma");
        }
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }
}
