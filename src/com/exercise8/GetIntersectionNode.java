package com.exercise8;

/**
 * Created by wecash on 19/4/18.
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = 0;
        int lenB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        int diff = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        if (lenA > lenB) {
            diff = lenA - lenB;
            for (int i = 0; i < diff; i++) {
                nodeA = nodeA.next;
            }
        } else {
            diff = lenB - lenA;
            for (int i = 0; i < diff; i++) {
                nodeB = nodeB.next;
            }
        }
        while (nodeA != null && nodeB != null) {
            if (nodeA.val == nodeB.val) {
                break;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(8);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode n11 = new ListNode(8);
        /*ListNode n12 = new ListNode(1);
        ListNode n13 = new ListNode(0);
        ListNode n14 = new ListNode(8);
        ListNode n15 = new ListNode(4);
        ListNode n16 = new ListNode(5);
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n15.next = n16;*/

        GetIntersectionNode g = new GetIntersectionNode();
        ListNode result = g.getIntersectionNode(n1, n11);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}