package com.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/19.
 */
public class StringCom {

    public static void main(String[] args) {
        String str = "abcbabcb";
        StringCom s = new StringCom();
        String one = s.stringCom(str);
        System.out.print(one);
    }

    private String stringCom(String str) {
        char[] chars = str.toCharArray();
        List<Character> list = new ArrayList<>();
        int i = 0;
        for (; i < chars.length - 1; i++) {
            char c = chars[i];
            char c1 = chars[i + 1];
            if (list.size() >= 2) {
                if (c == list.get(0) && c1 == list.get(1)) {
                    break;
                } else {
                    list.add(c);
                }
            } else {
                list.add(c);
            }

        }
        int len = chars.length - i;
        int x = len % list.size();
        if (x != 0) {
            return "false";
        }
        int j = 0;
        while (i < chars.length && j < list.size()) {
            if (chars[i] != list.get(j)) {
                return "false";
            }
            if (j == list.size() - 1) {
                j = -1;
            }
            i++;
            j++;
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : list) {
            sb.append(character);
        }
        return sb.toString();
    }
}
