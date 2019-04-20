package com.exercise8;

/**
 * Created by wecash on 19/4/19.
 */
public class MiddleNode {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        MiddleNode m = new MiddleNode();
        ListNode resultNode = m.middleNode(n1);
        while (resultNode != null) {
            System.out.print(resultNode.val);
            resultNode = resultNode.next;
        }
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int step = len / 2 + 1;
        for (int i = 1; i < step; i++) {
            head = head.next;
        }
        return head;
    }
}
