package com.exercise5;

import com.exercise.list.Node;

import java.util.Stack;

/**
 * Created by wecash on 19/4/7.
 * 两个链表，分别表示2个整数，每个链表的节点含有数值0-9
 * 比如6->1->7 和 2->9->5 相加，得到9->1->2
 * <p>
 * 617+295=912
 */
public class ListOfSum {

    public static void main(String[] args) {
        Node n1 = new Node(6);
        Node n2 = new Node(1);
        Node n3 = new Node(7);

        n1.next = n2;
        n2.next = n3;

        Node n4 = new Node(2);
        Node n5 = new Node(9);
        Node n6 = new Node(5);

        n4.next = n5;
        n5.next = n6;

        Node result = listOfSum(n1, n4);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }

    }

    private static Node listOfSum(Node n1, Node n4) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (n1 != null) {
            s1.push(n1.val);
            n1 = n1.next;
        }
        while (n4 != null) {
            s2.push(n4.val);
            n4 = n4.next;
        }
        Integer num1 = 0;
        Integer temp1 = 1;
        while (!s1.isEmpty()) {
            num1 += temp1 * s1.pop();
            temp1 *= 10;
        }
        Integer num2 = 0;
        Integer temp2 = 1;
        while (!s2.isEmpty()) {
            num2 += temp2 * s2.pop();
            temp2 *= 10;
        }

        Integer result = num1 + num2;
        Stack<Integer> stack = new Stack<>();
        //912
        while (result != 0) {
            stack.push(result % 10);
            result /= 10;
        }
        Node r = null;
        Node temp = null;
        while (!stack.isEmpty()) {
            if (r == null) {
                r = new Node(stack.pop());
                temp = r;
            } else {
                temp.next = new Node(stack.pop());
                temp = temp.next;
            }
        }
        return r;
    }
}
