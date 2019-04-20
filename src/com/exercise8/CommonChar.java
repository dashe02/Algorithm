package com.exercise8;

import java.util.*;

/**
 * Created by wecash on 19/4/15.
 */
public class CommonChar {

    //["bella","label","roller"]
    //b 1
    //e 1
    //l 2
    //a 1

    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        if (A == null) return result;
        if (A.length == 0) return result;
        String firstStr = A[0];
        for (int i = 1; i < A.length; i++) {
            String str = A[i];
            firstStr = findCommonStr(firstStr, str);
        }
        for (char c : firstStr.toCharArray()) {
            result.add(String.valueOf(c));
        }
        return result;
    }


    //cool lock
    private String findCommonStr(String firstStr, String str) {
        if (firstStr == null) return null;
        Map<Character, Integer> map = getCharacterIntegerMap(firstStr);
        Map<Character, Integer> m = getCharacterIntegerMap(str);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            char key = (char) entry.getKey();
            Integer value = (Integer) entry.getValue();
            Integer val = m.get(key);
            if (val != null) {
                int v = value <= val ? value : val;
                for (int i = 0; i < v; i++) {
                    sb.append(key);
                }
            }
        }
        return sb.toString();
    }

    private Map<Character, Integer> getCharacterIntegerMap(String firstStr) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : firstStr.toCharArray()) {
            Integer count = map.get(c);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(c, count);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] A = {"bella", "label", "roller"};
        CommonChar c = new CommonChar();
        List<String> result = c.commonChars(A);
        System.out.print(result);
    }
}
