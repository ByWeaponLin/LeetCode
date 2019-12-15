package com.weaponlin.utils;

import com.weaponlin.pojo.ListNode;

public class ListNodeUtil {

    public static ListNode getNode() {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        return head;
    }

    public static void print(ListNode head) {
        if (head == null) {
            System.out.println();
        }
        ListNode tmp = head;
        while(tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

}
