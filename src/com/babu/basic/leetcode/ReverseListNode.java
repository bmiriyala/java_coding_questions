package com.babu.basic.leetcode;

public class ReverseListNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node = node1.reverse();
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
