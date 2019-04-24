package com.exercise8;

/**
 * Created by wecash on 19/4/20.
 */
public class ListReverse {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListReverse l = new ListReverse();
        ListNode reverseNode = l.listReverse(l1);
        while (reverseNode != null) {
            System.out.print(reverseNode.val);
            reverseNode = reverseNode.next;
        }
    }

    //1->2->3->4->5
    //2->1->3->4->5
    private ListNode listReverse(ListNode head) {
        if (head == null) return null;
        ListNode reverseNode = null;
        ListNode current = head;
        ListNode pre = null;
        while (current != null) {
            ListNode next = current.next;
            if (next == null) {
                reverseNode = current;
            }
            current.next = pre;
            pre = current;
            current = next;
        }
        return reverseNode;
    }
}
