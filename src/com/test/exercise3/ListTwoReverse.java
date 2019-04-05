package com.test.exercise3;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/3/31.
 */
public class ListTwoReverse {

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
        ListTwoReverse l = new ListTwoReverse();
        Node newNode = l.listTwoReverse(node1);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }

    //1->2->3->4->5
    private Node listTwoReverse(Node node1) {
        if (node1 == null) return null;
        Node current = node1;
        Node p = current.next;
        Node pre = null;
        //2->1->3
        while (current != null && current.next != null) {
            //4
            Node next = current.next;
            //5
            Node nextNextNode = next.next;
            //4->3
            next.next = current;
            //3->5
            current.next = nextNextNode;
            if (pre != null) {
                //1->4
                pre.next = next;
            }
            //3
            pre = current;
            //5
            current = nextNextNode;
        }
        return p;
    }
}
