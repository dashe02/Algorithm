package com.test.exercise6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wecash on 19/4/10.
 */
public class Test {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("放款失败.*.余额不足.*");
        Matcher m = p.matcher("放款失败：第1步即是失败状态, 信托返回支付消息为(可能为空): [DpE0092]客户帐号[0120020000000153]余额不足[UPAFIL]");
        System.out.print(m.find());
    }
}
