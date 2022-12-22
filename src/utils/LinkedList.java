package utils;

import java.io.*;

/*
https://leetcode.com/problems/delete-node-in-a-linked-list/discuss/654837/listnode-class-implementation-for-java
 */

public class LinkedList {
    public ListNode head;

    public static class ListNode {

        public int val;
        public ListNode next;
        private ListNode head;
//        ListNode head;


        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        
        public static ListNode insert(ListNode list, int val) {
            ListNode new_node = new ListNode(val);

            if (list.head == null)
                list.head = new_node;
            else {
                ListNode last = list.head;
                while (last.next != null) {
                    last = last.next;
                }

                last.next = new_node;
            }
            return list;
        }

        public static void printList(ListNode list) {
            ListNode currNode = list.head;
            while (currNode != null) {
                System.out.println(currNode.val + " ");
                currNode = currNode.next;

            }
        }

        public static ListNode createList(int... values) {
            ListNode head = new ListNode(values[0]);
            ListNode prev = head;
            for (int i = 1; i < values.length; i++) {
                prev.next = new ListNode(values[i]);
                prev = prev.next;
            }
            return head;
        }
    }
}
