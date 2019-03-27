package com.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wecash on 19/3/25.
 */
public class RemoveMoreNum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        RemoveMoreNum r = new RemoveMoreNum();
        int len = r.removeDuplicates(nums);
        System.out.print(len);
    }

    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = map.get(nums[i]);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            if (count <= 2) {
                map.put(nums[i], count);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer count = entry.getValue();
            for (int i = 0; i < count; i++) {
                list.add(entry.getKey());
            }
        }
        return list.size();
    }
}
