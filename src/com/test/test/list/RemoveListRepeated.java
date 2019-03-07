package com.test.test.list;

import com.example.lru.Node;

import java.util.*;

/**
 * Created by wecash on 19/3/7.
 */
public class RemoveListRepeated {

    public static void main(String[] args) {
        Node2 n1 = new Node2(1);
        Node2 n2 = new Node2(2);
        Node2 n3 = new Node2(3);
        Node2 n4 = new Node2(3);
        Node2 n5 = new Node2(5);
        Node2 n6 = new Node2(6);
        Node2 n7 = new Node2(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        /*RemoveListRepeated r = new RemoveListRepeated();
        Node2 newHead = r.remove(n1);
        while (newHead != null) {
            System.out.print(newHead.value);
            newHead = newHead.next;
        }*/
        RemoveListRepeated r = new RemoveListRepeated();
        Node2 newNode = r.removeNode(n1, n5);
        while (newNode != null) {
            System.out.print(newNode.value);
            newNode = newNode.next;
        }

    }

    private Node2 removeNode(Node2 head, Node2 n3) {
        if (head == null) return null;
        Node2 temp = head;
        int count = 0;
        while (head != null) {
            if (head.value == n3.value) {
                break;
            }
            count++;
            head = head.next;
        }

        Node2 pre = temp;
        for (int i = 1; i < count; i++) {
            pre = pre.next;
        }
        pre.next = null;
        pre.next = n3.next;
        return temp;
    }

    private Node2 remove(Node2 n1) {
        if (n1 == null) return null;
        Node2 temp = n1;
        int count = getRepeated(n1);
        for (int i = 0; i < count; i++) {
            n1 = removeRepeated(n1);
        }
        return temp;
    }

    private int getRepeated(Node2 n1) {
        Map<Integer, Integer> wantedSet = new HashMap<>();
        Set<Integer> repeatedIndex = new HashSet<>();
        int count = 0;
        while (n1 != null) {
            if (repeatedIndex.contains(n1.value)) {
                wantedSet.put(count - 1, count + 2);
            }
            count++;
            repeatedIndex.add(n1.value);
            n1 = n1.next;
        }
        return wantedSet.size();
    }

    private Node2 removeRepeated(Node2 n1) {
        if (n1 == null) return null;
        Node2 temp = n1;
        Map<Integer, Integer> wantedSet = new HashMap<>();
        Set<Integer> repeatedIndex = new HashSet<>();
        int count = 0;
        while (n1 != null) {
            if (repeatedIndex.contains(n1.value)) {
                wantedSet.put(count - 1, count + 2);
                break;
            }
            count++;
            repeatedIndex.add(n1.value);
            n1 = n1.next;
        }
        Integer start = 0;
        Integer end = 0;
        for (Map.Entry entry : wantedSet.entrySet()) {
            start = (Integer) entry.getKey();
            end = (Integer) entry.getValue();
        }
        return recreateList(start, end, temp);
    }


    private Node2 recreateList(Integer start, Integer end, Node2 temp) {
        Node2 slow = temp;
        Node2 fast = temp;
        for (int i = 1; i < start; i++) {
            slow = slow.next;
        }
        for (int i = 1; i < end; i++) {
            fast = fast.next;
        }
        slow.next = null;
        slow.next = fast;
        return temp;
    }
}
