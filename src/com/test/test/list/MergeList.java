package com.test.test.list;

/**
 * Created by wecash on 19/3/4.
 */
public class MergeList {

    public Node2 mergeList(Node2 l1, Node2 l2) {

        Node2 head = new Node2(0);
        Node2 cur = head;
        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return head.next;

    }

    public static void main(String[] args) {
        Node2 n1 = new Node2(1);
        Node2 n2 = new Node2(2);
        Node2 n3 = new Node2(4);
        n1.next = n2;
        n2.next = n3;

        Node2 n4 = new Node2(1);
        Node2 n5 = new Node2(3);
        Node2 n6 = new Node2(4);
        n4.next = n5;
        n5.next = n6;

        MergeList m = new MergeList();
        Node2 node = m.mergeList(n1, n4);
        while (node != null) {
            System.out.print(node.value);
            node = node.next;
        }
    }
}
