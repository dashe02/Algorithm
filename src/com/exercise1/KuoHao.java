package com.exercise1;

import java.util.Stack;

/**
 * Created by wecash on 19/3/19.
 * {{{[[[[[ ]]]]]}}}
 */
public class KuoHao {

    public boolean isOk(char before, char after) {
        if ((before == '{' && after == '}') ||
                (before == '[' && after == ']')
                || (before == '(' && after == ')')) {
            return true;
        }
        return false;
    }

    public boolean isPush(char c) {
        return (c == '{' ||
                c == '['
                || c == '(');
    }

    public boolean isPop(char c) {
        return (c == '}' ||
                c == ']'
                || c == ')');
    }

    public static void main(String[] args) {
        String str = "{{{[[[[]]]]]}}}";
        KuoHao k = new KuoHao();
        System.out.print(k.kuohao(str));
    }

    private boolean kuohao(String str) {
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isPush(c)) {
                stack.push(c);
            } else if (isPop(c)) {
                if (isOk(stack.pop(), c)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
