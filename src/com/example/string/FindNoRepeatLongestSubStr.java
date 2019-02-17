package com.example.string;

/**
 * Created by wecash on 19/2/17.
 * 查找无重复最长子串
 */
public class FindNoRepeatLongestSubStr {

    public int findNoRepeatLongestSubStr(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int l = s.length();
        if (l == 0) {
            return 0;
        }
        int res[] = new int[l];
        res[0] = 1;
        for (int i = 1; i < l; i++) {
            for (int j = 1; j <= res[i - 1]; j++) { //动态规划，用res数组保存以i为结尾字符串的无重复字符长度
                if (s.charAt(i - j) == s.charAt(i)) {
                    res[i] = j;
                }
            }
            if (res[i] == 0) {
                res[i] = res[i - 1] + 1;
            }
        }
        int max = 0;
        for (int i = 0; i < l; i++) {
            if (max < res[i]) {
                max = res[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        FindNoRepeatLongestSubStr f = new FindNoRepeatLongestSubStr();
        System.out.println(f.findNoRepeatLongestSubStr(s));
    }
}
