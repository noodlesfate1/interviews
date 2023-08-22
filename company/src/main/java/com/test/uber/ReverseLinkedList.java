package com.test.uber;// Reverse a singly linked list.

import common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
    
        ListNode newHead = null;
        
        while(head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        
        return newHead;
    }
}
