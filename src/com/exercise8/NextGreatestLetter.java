package com.exercise8;

/**
 * Created by wecash on 19/4/15.
 * 数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。
 */
public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {

        if (letters == null) return '0';
        if (letters.length == 0) return '0';
        char c = find(letters, target);
        if (c == '0') {
            return letters[0];
        } else {
            return c;
        }
    }

    private char find(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        NextGreatestLetter n = new NextGreatestLetter();
        System.out.print(n.nextGreatestLetter(letters, target));
    }
}
