package com.exercise1;

/**
 * Created by wecash on 19/3/21.
 */
public class CompareTwoVersion {

    public int compareVersion(String version1, String version2) {

        char[] cc1 = version1.toCharArray();
        char[] cc2 = version2.toCharArray();
        int i = 0, j = 0;
        while (i < cc1.length && j < cc2.length) {
            if ((cc1[i] != '.' || cc2[j] != '.')) {
                if (cc1[i] == cc2[j]) {
                    i++;
                    j++;
                } else if (cc1[i] < cc2[j]) {
                    return -1;
                } else if (cc1[i] > cc2[j]) {
                    return 1;
                }
            } else {
                i++;
                j++;
            }
        }
        int lc1 = cc1.length - i;
        int count1 = 0;
        while (i < cc1.length) {
            if (cc1[i] != '0') {
                return 1;
            } else {
                count1++;
            }
            i++;
        }
        int lc2 = cc2.length - j;
        int count2 = 0;
        while (j < cc2.length) {
            if (cc2[j] != '0') {
                return -1;
            } else {
                count2++;
            }
            j++;
        }
        if (lc1 == count1 || lc2 == count2) {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        CompareTwoVersion c = new CompareTwoVersion();
        String version1 = "1.0";
        String version2 = "1.0";
        System.out.print(c.compareVersion(version1, version2));
    }
}
