package com.exercise3;

/**
 * Created by wecash on 19/3/25.
 */
public class ListReverse {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListReverse l = new ListReverse();
        Node newNode = l.reverseList(n1);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }

    // 1->2->3->4->5
    // 2->3->1
    public Node reverseList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node p = head;
        Node res = p.next;
        Node pre = null;
        Node pNextNext = null;

        while (p != null && p.next != null) {
            pNextNext = p.next.next;
            p.next.next = p;
            if (pre == null) {
                pre = p;
            } else {
                pre.next = p.next;
            }
            p.next = pNextNext;

            pre = p;
            p = p.next;

        }
        return res;

    }

}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}