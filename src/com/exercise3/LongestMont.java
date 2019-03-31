package com.exercise3;

/**
 * Created by wecash on 19/3/29.
 */
public class LongestMont {

    public static void main(String[] args) {
        int[] a = {1, 2, 0, 2, 0, 2};
        LongestMont l = new LongestMont();
        int len = l.longestMountain(a);
        System.out.print(len);
    }

    public int longestMountain(int[] a) {
        if (a.length == 0 || a.length < 3) return 0;
        int max = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] < a[i] && a[i + 1] < a[i]) {
                int left = i - 1;
                int right = i + 1;
                while (left > 0 && a[left - 1] < a[left]) {
                    left--;
                }
                while (right < a.length - 1 && a[right + 1] < a[right]) {
                    right++;
                }
                max = Math.max(max, right - left + 1);
            }
        }
        return max;
    }
}
