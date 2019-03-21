package com.exercise1;

/**
 * Created by wecash on 19/3/21.
 * <p>
 * 1->2->3->4->5
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int preIndex = len - n;
        if (preIndex < 0) {
            return null;
        }
        ListNode preNode = head;
        if (preIndex == 0) {
            //删除第一个节点
            for (int i = 0; i < 1; i++) {
                preNode = preNode.next;
            }
            return preNode;
        } else {
            for (int i = 0; i < preIndex - 1; i++) {
                preNode = preNode.next;
            }
            if (preNode != null) {
                if (preNode.next != null) {
                    ListNode next = preNode.next.next;
                    preNode.next = null;
                    preNode.next = next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Solution s = new Solution();
        ListNode newNode = s.removeNthFromEnd(n1, 5);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
