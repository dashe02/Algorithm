package com.exercise8;

/**
 * Created by wecash on 19/4/18.
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.val == slow.val) {
                return true;
            }
        }
        return false;
    }
}
