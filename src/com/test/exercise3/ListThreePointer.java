package com.test.exercise3;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/3/31.
 */
public class ListThreePointer {

    //1->2->3->4->5->6->7
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
    }
}
