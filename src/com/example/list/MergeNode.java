package com.example.list;

/**
 * Created by wecash on 19/3/6.
 */
public class MergeNode {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n8 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n8;

        Node n4 = new Node(1);
        Node n5 = new Node(3);
        Node n6 = new Node(4);
        Node n7 = new Node(5);

        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        Node node = merge(n1, n4);
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
    }

    private static Node merge(Node head1, Node head2) {
        Node dump = new Node(0);
        Node cur = dump;
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
        while (head1 != null) {
            cur.next = head1;
            head1 = head1.next;
            cur = cur.next;
        }
        while (head2 != null) {
            cur.next = head2;
            head2 = head2.next;
            cur = cur.next;
        }
        return dump.next;
    }
}
