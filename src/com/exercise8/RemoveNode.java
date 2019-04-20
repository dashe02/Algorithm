package com.exercise8;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/4/16.
 */
public class RemoveNode {

    public void deleteNode(Node head, Node node) {
        if (head == null) return;
        int index = 1;
        Node p = head;
        while (p != null) {
            if (p.val == node.val) {
                break;
            }
            index++;
            p = p.next;
        }
        //1
        int pre = index - 1;
        //3
        int next = index + 1;
        Node preNode = head;
        Node nextNode = head;
        for (int i = 1; i < pre; i++) {
            preNode = preNode.next;
        }
        for (int i = 1; i < next; i++) {
            nextNode = nextNode.next;
        }
        if (preNode != null) {
            preNode.next = nextNode;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(4);
        Node n2 = new Node(5);
        Node n3 = new Node(1);
        Node n4 = new Node(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        RemoveNode r = new RemoveNode();
        r.deleteNode(n1, n2);
        while (n1 != null) {
            System.out.print(n1.val);
            n1 = n1.next;
        }
    }
}
