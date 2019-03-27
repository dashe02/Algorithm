package com.test;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/3/26.
 */
public class ListReverseTest {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListReverseTest l = new ListReverseTest();
        Node newNode = l.reverseList(n1);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }

    //1->2->3->4->5
    public Node reverseList(Node head) {
        Node current = head;
        if (current == null || current.next == null) return head;
        Node p = current.next;
        Node pre = null;
        //2->1->3->4->5
        while (current != null && current.next != null) {
            //4
            Node nextNode = current.next;
            //5
            Node nextNextNode = nextNode.next;
            //4->3
            nextNode.next = current;
            //3->5
            current.next = nextNextNode;
            //4->3->5
            if (pre != null) {
                pre.next = nextNode;
            }
            pre = current;
            current = nextNextNode;
        }
        return p;
    }
}
