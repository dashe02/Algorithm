package com.example.array;

/**
 * Created by wecash on 19/2/17.
 */
public class RemoveDuplicateFromArray {

    public int removeDuplicateFromArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int pre = 0, cur = 0, n = arr.length;
        while (cur < n) {
            if (arr[pre] == arr[cur]) {
                //如果快慢相同
                cur++;
            } else {
                pre++;
                arr[pre] = arr[cur];
                cur++;
            }
        }
        return pre + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicateFromArray r = new RemoveDuplicateFromArray();
        int l = r.removeDuplicateFromArray(arr);
        System.out.println(l);
    }

}
