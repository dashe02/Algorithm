package com.exercise3;

import java.util.PriorityQueue;

/**
 * Created by wecash on 19/3/28.
 */
public class BinaryInsert {

    PriorityQueue<Integer> small = new PriorityQueue<>();

    PriorityQueue<Integer> large = new PriorityQueue<>();

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 8, 9, 0, 1, 4};
        BinaryInsert b = new BinaryInsert();
        /*
        * 5
        * 2 5
        * 2 3 5
        * 2 3 5 8
        * 2 3 5 8 9
        * 0 2 3 5 8 9
        * 0 1 2 3 5 8 9
        * 0 1 2 3 4 5 8 9
        */
        for (int i = 0; i < nums.length; i++) {
            b.binaryInsert(nums[i]);
            System.out.println(b.findMedium());
        }
    }

    private void binaryInsert(int num) {
        small.add(num);
        large.add(-small.peek());
        small.poll();
        if (small.size() < large.size()) {
            small.add(-large.peek());
            large.poll();
        }
    }

    int findMedium() {
        int len = small.size() + large.size();
        if (len % 2 == 1) return small.peek();
        return (small.peek() - large.peek()) / 2;
    }
}
