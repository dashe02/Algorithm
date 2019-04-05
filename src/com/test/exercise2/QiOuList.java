package com.test.exercise2;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/4/2.
 */
public class QiOuList {

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
        QiOuList q = new QiOuList();
        Node newNode = q.qiOuList(node1);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }

    //1->2->3->4->5
    private Node qiOuList(Node node1) {
        if (node1 == null) return null;
        //1
        Node oddNode = null;
        //2
        Node evenNode = null;
        //1
        Node oddNodeDummp = null;
        //2
        Node evenNodeDummp = null;
        int len = 1;
        while (node1 != null) {
            if (len % 2 == 1) {
                //1->3
                if (oddNode == null) {
                    oddNode = node1;
                    oddNodeDummp = oddNode;
                } else {
                    oddNodeDummp.next = node1;
                    oddNodeDummp = oddNodeDummp.next;
                }
            } else if (len % 2 == 0) {
                if (evenNode == null) {
                    evenNode = node1;
                    evenNodeDummp = evenNode;
                } else {
                    evenNodeDummp.next = node1;
                    evenNodeDummp = evenNodeDummp.next;
                }
            }
            len++;
            node1 = node1.next;
        }
        if (evenNodeDummp != null) {
            evenNodeDummp.next = null;
        }
        if (oddNodeDummp != null) {
            oddNodeDummp.next = evenNode;
        }
        return oddNode;
    }
}
