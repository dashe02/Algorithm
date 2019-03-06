package com.example.list;

/**
 * Created by wecash on 19/3/6.
 * 1->2->3->4->5->6
 */
public class ReverseNode {

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

        Node reverseNode = reverseNodeM(n1);
        while (reverseNode != null) {
            System.out.print(reverseNode.val);
            reverseNode = reverseNode.next;
        }
    }

    private static Node reverseNodeM(Node head) {
        if (head == null) {
            return null;
        }
        Node reverseNode = null;
        Node currentNode = head;
        Node pre = null;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (next == null) {
                reverseNode = currentNode;
            }
            currentNode.next = pre;
            pre = currentNode;
            currentNode = next;
        }
        return reverseNode;
    }
}
