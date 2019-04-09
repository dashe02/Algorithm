package com.exercise4;

/**
 * Created by wecash on 19/4/5.
 */
public class LongestDuicheng {
    public static void main(String[] args) {
        String str = "goooooooooog";
        LongestDuicheng l = new LongestDuicheng();
        int s = l.longestDuicheng(str);
        System.out.print(s);
    }

    private int longestDuicheng(String str) {
        int max = 0;
        for (int k = 0; k < str.length(); k++) {
            int i = k;
            int j = str.length() - 1;
            int temp = 0;
            while (i <= j) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    i++;
                    j--;
                    temp += 2;
                } else if (str.charAt(i) == str.charAt(j) && i == j) {
                    i++;
                    j--;
                    temp += 1;
                } else {
                    j--;
                }
            }
            if (max == 0) {
                max = temp;
            } else if (max < temp) {
                max = temp;
            }
        }

        return max;
    }
}
