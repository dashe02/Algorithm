package com.test.test;

import com.example.lru.Node;

/**
 * Created by wecash on 19/2/25.
 */
public class ListReverse {

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        Node1 n1 = new Node1(2);
        Node1 n2 = new Node1(5);
        Node1 n3 = new Node1(0);
        Node1 n4 = new Node1(3);
        Node1 n5 = new Node1(7);
        Node1 n6 = new Node1(6);

        root.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        /*while (root != null) {
            System.out.print(root.value + "->");
            root = root.next;
        }*/

        ListReverse r = new ListReverse();
        System.out.println(r.reverseList(root).value);
    }

    private Node1 reverseList(Node1 root) {
        if (root == null) return null;
        Node1 pre = null;
        Node1 currentNode = root;
        Node1 reverseNode = null;
        while (currentNode != null) {
            Node1 nextNode = currentNode.next;
            if (nextNode == null) {
                reverseNode = currentNode;
            }
            currentNode.next = pre;
            pre = currentNode;
            currentNode = nextNode;
        }
        return reverseNode;
    }
}
