package com.exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/24.
 * 简单的回溯算法，先写n个左括号，然后就写右括号，每当完成一组之后，就吧字符串存起来。
 * 然后再倒退步骤到写第n-1个左括号，然后写右括号，在写左括号，再全写右括号。
 * 依次回溯递归，每完成一趟就回到能再改变的位置
 */
public class GenerateKuoHao {

    public static void main(String[] args) {
        int n = 3;
        GenerateKuoHao g = new GenerateKuoHao();
        List<String> result = g.generateKuoHao(n);
        System.out.print(result);
    }

    private List<String> generateKuoHao(int n) {
        List<String> list = new ArrayList<>();
        chuli("", list, n, n);
        return list;
    }


    private void chuli(String s, List<String> list, int left, int right) {
        if (left > right) {
            return;
        }
        if (left > 0) {
            chuli(s + "(", list, left - 1, right);
        }
        if (right > 0) {
            chuli(s + ")", list, left, right - 1);
        }
        if (left == 0 && right == 0) {
            list.add(s);
            return;
        }
    }
}
