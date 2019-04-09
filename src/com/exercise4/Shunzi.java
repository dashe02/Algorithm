package com.exercise4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/4/5.
 * 从扑克牌中随机抽5 张牌，判断是不是一个顺子，
 * 即这5 张牌是不是连续的。
 * 2-10 为数字本身，
 * A 为1，J 为11，Q 为12，K 为13，而大小王可以看成任意数字。
 */
public class Shunzi {

    static Map<String, String> map = new HashMap<>();

    static {
        map.put("A", "1");
        map.put("J", "11");
        map.put("Q", "12");
        map.put("K", "13");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");
        map.put("10", "10");
    }

    public static void main(String[] args) {
        String[] nums = {"2", "0", "4", "5", "6"};
        Shunzi shunzi = new Shunzi();
        boolean isShunzi = shunzi.shunzi(nums);
        System.out.print(isShunzi);
    }

    private boolean shunzi(String[] nums) {
        if (nums.length != 5) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].equals("0")) {
                count++;
            }
        }
        int cc = 0;
        int c = 0;
        for (int i = 0; i < nums.length - 1; ) {
            if (nums[i].equals("0")) {
                i++;
            } else {
                int j = i + 1;
                if (nums[j].equals("0")) {
                    j++;
                }
                int diff = Integer.parseInt(map.get(nums[j]))
                        - Integer.parseInt(map.get(nums[i]));
                if (diff != 1) {
                    cc = diff - 1;
                    c++;
                }
                i++;
            }
        }
        if (c <= count && cc == count) {
            return true;
        }
        return false;
    }
}
