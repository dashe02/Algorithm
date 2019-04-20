package com.exercise8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/4/15.
 */
public class FirstUniqChar {
    //s = "leetcode"
    public int firstUniqChar(String s) {
        if (s == null) return -1;
        if ("".equals(s)) return -1;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> indexMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Integer count = map.get(chars[i]);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(chars[i], count);
            indexMap.put(chars[i], i);
        }
        int minIndex = -1;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character c = entry.getKey();
            Integer count = entry.getValue();
            if (count == 1) {
                int index = indexMap.get(c);
                if (minIndex == -1) {
                    minIndex = index;
                } else {
                    if (index <= minIndex) {
                        minIndex = index;
                    }
                }
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        FirstUniqChar f = new FirstUniqChar();
        String s = "cc";
        System.out.print(f.firstUniqChar(s));
    }
}
