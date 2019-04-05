package com.test.exercise3;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/3/31.
 */
public class ListReverse {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListReverse l = new ListReverse();
        Node newNode = l.listReverse(node1);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }

    private Node listReverse(Node node1) {
        if (node1 == null) return null;
        Node resultNode = null;
        Node currentNode = node1;
        Node pre = null;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            if (nextNode == null) {
                resultNode = currentNode;
            }
            currentNode.next = pre;
            pre = currentNode;
            currentNode = nextNode;
        }
        return resultNode;
    }
}
