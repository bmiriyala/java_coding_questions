package com.babu.basic.leetcode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(list1 != null && list2 != null){
            if( list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if(list1 == null){
            tail.next = list2;
        } else {
            tail.next = list1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        //Input: list1 = [1,2,4], list2 = [1,3,4]
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;




        //Input: list1 = [], list2 = []
        //Input: list1 = [], list2 = [0]
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
       //ListNode node =  mergeTwoSortedLists.mergeTwoLists(node1, node4);
        ListNode node =  mergeTwoSortedLists.mergeTwoLists(null, new ListNode());
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode reverse() {
        if(this == null) { // to avoid this take ListNode as an argument and check null
            return null;
        }

        ListNode current = this;
        ListNode previous = null;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
  }
