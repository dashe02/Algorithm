package com.exercise2;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/3/23.
 */
public class JIOUList {

    public Node oddEvenList(Node head) {
        if (head == null) return null;
        Node oddHead = null;
        Node evenHead = null;
        int len = 1;
        Node p = head;
        for (int i = 1; i < 3; i++) {
            if (i % 2 == 0) {
                evenHead = p;
            } else if (i % 2 == 1) {
                oddHead = p;
            }
            p = p.next;
        }
        Node tempOddHead = oddHead;
        Node tempEvenHead = evenHead;
        while (p != null) {
            if (len % 2 == 0) {
                tempEvenHead.next = p;
                p = p.next;
                tempEvenHead = tempEvenHead.next;
            } else if (len % 2 == 1) {
                tempOddHead.next = p;
                p = p.next;
                tempOddHead = tempOddHead.next;
            }
            len++;
        }
        tempEvenHead.next = null;
        if (tempOddHead != null) {
            tempOddHead.next = evenHead;
        }
        return oddHead;
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(1);
        Node n3 = new Node(3);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(4);
        Node n7 = new Node(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        JIOUList j = new JIOUList();
        Node newNode = j.oddEvenList(n1);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }
}
