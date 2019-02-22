package com.example.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/2/22.
 */
public class FindStr {
    public int lengthOfLongestSubstring(String s) {
        List<String> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    list.add(s.substring(i, j));
                    max = Math.max(max, j - i);
                    break;
                }
            }
        }
        System.out.println(list);
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        FindStr f = new FindStr();
        System.out.println(f.lengthOfLongestSubstring(s));
    }
}
