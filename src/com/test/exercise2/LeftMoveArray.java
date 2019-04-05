package com.test.exercise2;

/**
 * Created by wecash on 19/4/2.
 */
public class LeftMoveArray {

    public static void main(String[] args) {
        //
        String str = "abcXYZdef";
        int moveIndex = 8;
        LeftMoveArray l = new LeftMoveArray();
        String res = l.leftMoveArray(str, moveIndex);
        System.out.print(res);
    }

    private String leftMoveArray(String str, int moveIndex) {
        int move = moveIndex;
        if (moveIndex < 0) {
            move = -moveIndex;
        }
        if (move % str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        char[] newChar = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int newIndex = i + moveIndex;
            if (newIndex < 0) {
                newIndex = chars.length + newIndex;
            } else if (newIndex >= chars.length) {
                newIndex = newIndex % chars.length;
            }
            newChar[newIndex] = chars[i];
        }
        return new String(newChar);
    }
}
