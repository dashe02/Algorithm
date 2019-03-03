package com.example.list;

/**
 * Created by wecash on 19/3/3.
 */
public class MergeList {

    public Node mergeList(Node head1, Node head2) {
        if (head1 == null && head2 == null) return null;
        //if (head1 == null && head2 != null) return head2;
        //if (head1 != null && head2 == null) return head1;
        Node head = new Node(0);
        Node cur = head;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                cur.next = head1;
                head1 = head1.next;
            } else {
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }
        if (head1 != null) {
            cur.next = head1;
        }
        if (head2 != null) {
            cur.next = head2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        n1.next = n2;
        n2.next = n3;

        Node n4 = new Node(1);
        Node n5 = new Node(3);
        Node n6 = new Node(4);
        n4.next = n5;
        n5.next = n6;

        MergeList m = new MergeList();
        Node n = m.mergeList(n1, n4);
        while (n != null) {
            System.out.print(n.val);
            n = n.next;
        }
    }
}
