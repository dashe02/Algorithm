package com.exercise7;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/4/14.
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
        Node reverseNode = listReverse(n1);
        while (reverseNode != null) {
            System.out.print(reverseNode.val);
            reverseNode = reverseNode.next;
        }
    }


    //1->2->3->4->5
    //2->1->3->4->5
    //3->2->1->4->5
    //4->3->2->1->5
    //5->4->3->2->1
    private static Node listReverse(Node n1) {
        if (n1 == null) return null;
        if (n1.next == null) return n1;
        Node reverseNode = null;
        Node current = n1;
        Node pre = null;
        //1
        while (current != null) {
            //null
            //5
            //4
            //3
            //2
            Node next = current.next;
            if (next == null) {
                reverseNode = current;
            }
            //5->4->3->2->1
            //4->3->2->1
            //3->2->1
            //2->1
            //1->null
            current.next = pre;
            //pr3=4
            //pre=3
            //pre=2
            //pre=1
            pre = current;
            //null
            //5
            //4
            //3
            //2
            current = next;
        }
        return reverseNode;
    }
}
