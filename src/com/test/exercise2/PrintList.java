package com.test.exercise2;

import com.exercise.list.Node;

import java.util.Stack;

/**
 * Created by wecash on 19/4/3.
 */
public class PrintList {
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
        PrintList p = new PrintList();
        p.printList(node1);
    }

    private void printList(Node node1) {
        if (node1 == null) return;
        Stack<Integer> stack = new Stack<>();
        while (node1 != null) {
            stack.push(node1.val);
            node1 = node1.next;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
