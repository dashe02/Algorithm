package com.exercise1;

/**
 * Created by wecash on 19/3/19.
 */
public class CompareTwoNum {

    public static void main(String[] args) {
        CompareTwoNum c = new CompareTwoNum();
        int x1 = 1010;
        int k1 = 3;
        int x2 = 1010101010;
        int k2 = 2;
        System.out.print(c.compareTwoNum(buildNum(x1, k1), buildNum(x2, k2)));
    }

    private String compareTwoNum(String a, String b) {
        if (a.equals(b)) return "Equal";
        if (a.compareTo(b) < 0) return "Less";
        if (a.compareTo(b) > 0) return "Greater";
        return null;
    }

    private static String buildNum(int x, int k) {
        String xStr = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(xStr);
        }
        return sb.toString();
    }
}
