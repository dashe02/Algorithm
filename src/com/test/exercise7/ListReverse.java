package com.test.exercise7;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/4/14.
 */
public class ListReverse {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        Node reverseNode = listReverse(n1);
        while (reverseNode != null) {
            System.out.print(reverseNode.val);
            reverseNode = reverseNode.next;
        }
    }

    private static Node listReverse(Node n1) {
        if (n1 == null) return null;
        if (n1.next == null) return n1;
        Node reverseNode = null;
        Node current = n1;
        Node pre = null;
        while (current != null) {
            Node next = current.next;
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
