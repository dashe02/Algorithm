package com.exercise8;

/**
 * Created by wecash on 19/4/20.
 */
public class RemoveElements {
    //1->2->6->3->4->5->6, val = 6
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.val == val) {
                count++;
            }
            temp = temp.next;
        }
        while (count != 0) {
            ListNode p = head;
            int len = 0;
            while (p != null) {
                if (p.val == val) {
                    break;
                }
                len++;
                p = p.next;
            }
            head = help(head, len);
            count--;
        }
        return head;
    }

    private ListNode help(ListNode head, int index) {
        int pre = index - 1;
        int next = index + 1;
        if (pre == next) return null;
        ListNode firstNode = head;
        ListNode secondNode = head;
        for (int i = 0; i < pre; i++) {
            if (firstNode != null) {
                firstNode = firstNode.next;
            }
        }
        for (int i = 0; i < next; i++) {
            if (secondNode != null) {
                secondNode = secondNode.next;
            }
        }
        if (index == 0) {
            head = secondNode;
        } else {
            if (firstNode != null) {
                firstNode.next = secondNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(5);
        ListNode l7 = new ListNode(6);
        //l1.next = l2;
        /*l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;*/
        RemoveElements r = new RemoveElements();
        ListNode newNode = r.removeElements(l1, 1);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }
}
