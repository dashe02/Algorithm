package com.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/25.
 */
public class KuoHao {
    public static void main(String[] args) {
        int n = 3;
        KuoHao k = new KuoHao();
        k.kuohao(n);
    }

    private void kuohao(int n) {
        List<String> res = new ArrayList<>();
        kk("", res, n, n);
        System.out.print(res);
    }


    private void kk(String s, List<String> res, int left, int right) {
        if (left > right) {
            return;
        }
        if (left > 0) {
            kk(s + "(", res, left - 1, right);
        }
        if (right > 0) {
            kk(s + ")", res, left, right - 1);
        }
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
    }
}
