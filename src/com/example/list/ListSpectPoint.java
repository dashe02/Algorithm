package com.example.list;

/**
 * Created by wecash on 19/3/6.
 * 1. 1->2->4->7->8->9->5
 * 2. 1->3->8->9->5
 */
public class ListSpectPoint {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(7);
        Node n5 = new Node(8);
        Node n6 = new Node(9);
        Node n7 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        Node n8 = new Node(1);
        Node n9 = new Node(3);
        Node n10 = new Node(8);
        Node n11 = new Node(9);
        Node n12 = new Node(5);
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;
        n11.next = n12;

        ListSpectPoint l = new ListSpectPoint();
        l.listSpectPoint(n1, n8);
    }

    private void listSpectPoint(Node head1, Node head2) {
        int len1 = 0;
        int len2 = 0;
        Node n1 = head1;
        Node n2 = head2;
        while (head1 != null) {
            len1++;
            head1 = head1.next;
        }
        while (head2 != null) {
            len2++;
            head2 = head2.next;
        }
        int preStep = 0;
        Node fast = null;
        Node slow = null;
        if (len2 >= len1) {
            preStep = len2 - len1;
            fast = n2;
            slow = n1;
        } else {
            preStep = len1 - len2;
            fast = n1;
            slow = n2;
        }
        for (int i = 0; i < preStep; i++) {
            fast = fast.next;
        }

        while (fast != null && slow != null) {
            if (fast.val == slow.val) {
                System.out.print(fast.val);
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
    }
}
