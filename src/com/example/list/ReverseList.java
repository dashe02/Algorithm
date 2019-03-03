package com.example.list;

/**
 * Created by wecash on 19/3/3.
 * <p>
 * 1 -> 2 -> 3 -> 4 -> 5
 * 5 -> 4 -> 3 -> 2 ->1
 * <p>
 */
public class ReverseList {


    public Node reverseList(Node head) {
        if (head == null) return null;
        Node reverseNode = null;
        Node currentNode = head;
        Node preNode = null;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (next == null) {
                reverseNode = currentNode;
            }
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = next;
        }
        return reverseNode;
    }

    public Node reverseFromMToN(Node head, int m, int n) {
        if (head == null) return null;
        Node reverseNode = null;
        Node currentNode = null;
        Node preNode = null;
        Node sNode = null;
        Node endNode = null;
        for (int i = 1; i < m - 1; i++) {
            head = head.next;
        }
        sNode = head;
        return sNode;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        ReverseList r = new ReverseList();
        //System.out.print(r.reverseList(head).val);
        /*Node reverseNode = r.reverseList(head);
        while (reverseNode != null) {
            System.out.print(reverseNode.val);
            reverseNode = reverseNode.next;
        }*/
        Node startNode = r.reverseFromMToN(head, 2, 4);
        Node reverseNode = r.reverseList(startNode.next);
        startNode.next = reverseNode;
        while (startNode != null) {
            System.out.println(startNode.val);
            startNode = startNode.next;
        }
    }

}
