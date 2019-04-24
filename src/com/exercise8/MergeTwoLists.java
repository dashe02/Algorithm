package com.exercise8;

/**
 * Created by wecash on 19/4/20.
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        if (l1 == null || l2 == null) return result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        while (l1 != null) {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }
        while (l2 != null) {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;

        MergeTwoLists m = new MergeTwoLists();
        ListNode newNode = m.mergeTwoLists(l1, l4);
        while (newNode != null) {
            System.out.print(newNode.val + "-->");
            newNode = newNode.next;
        }
    }
}
