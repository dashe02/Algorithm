package com.test.exercise;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/3/25.
 */
public class ListReverse {

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
        ListReverse l = new ListReverse();
        Node newNode = l.reverseNode(n1);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }

    // 1->2->3->4->5
    private Node reverseNode(Node n1) {
        Node current = n1;
        if (current == null || current.next == null) {
            return current;
        }
        //2
        Node head = current.next;
        Node preNode = null;
        //2->1->3->4->5
        while (current != null && current.next != null) {
            //4
            Node nextNode = current.next;
            //4->5
            Node nextNextNode = nextNode.next;
            //4->3
            nextNode.next = current;
            //4->3->5
            current.next = nextNextNode;
            if (preNode != null) {
                //1->5
                preNode.next = nextNode;
            }
            //3
            preNode = current;
            //5
            current = nextNextNode;
        }
        return head;
    }
}
