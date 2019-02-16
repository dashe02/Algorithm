package com.example.list;

/**
 * Created by wecash on 19/2/16.
 */
public class ListReverse {

    /*
    * 定义3个指针，分别指向当前遍历到的结点、
    * 它的前一个结点及后一个结点。
    * 在遍历过程中，首先记录当前节点的后一个节点，
    * 然后将当前节点的后一个节点指向前一个节点，
    * 其次前一个节点再指向当前节点，
    * 最后再将当前节点指向最初记录的后一个节点，
    * 如此反复，直到当前节点的后一个节点为NULL时，则代表当前节点时反转后的头结点了
    *
    * 9 -> 1 -> 3 -> 5 -> 7 -> 0 -> 4
    */

    public Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node reverseNode = null;
        Node currentNode = head;
        Node preNode = null;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            if (nextNode == null) {
                reverseNode = currentNode;
            }
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }
        return reverseNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(9);
        Node n2 = new Node(1);
        Node n3 = new Node(3);
        Node n4 = new Node(5);
        Node n5 = new Node(7);
        Node n6 = new Node(0);
        Node n7 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        ListReverse listReverse = new ListReverse();
        //System.out.println(listReverse.reverseList(n1).val);
        Node newNode = listReverse.reverseList(n1);
        while (newNode!= null) {
            System.out.println(newNode.val);
            newNode = newNode.next;
        }
    }
}


class Node {

    int val;

    Node next = null;

    public Node(int val) {
        this.val = val;
    }
}