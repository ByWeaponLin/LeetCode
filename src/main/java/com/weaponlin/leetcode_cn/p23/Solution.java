package com.weaponlin.leetcode_cn.p23;

import com.weaponlin.pojo.ListNode;

/**
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/submissions/
 */
public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1){
            return lists[0];
        }

        ListNode node = mergeTwoLists(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            if (lists[i] != null) {
                node = mergeTwoLists(node, lists[i]);
            }
        }

        return node;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode head;
        if (l1.val <= l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
        ListNode tmp = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tmp.next = l1;
                tmp = tmp.next;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                tmp = tmp.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            tmp.next = l1;
        }
        if (l2 != null) {
            tmp.next = l2;
        }

        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode[] nodes = new ListNode[3];
        nodes[0] = getNode0();
        nodes[1] = getNode1();
        nodes[2] = getNode2();

        ListNode node = solution.mergeKLists(nodes);
        print(node);
    }

    private static ListNode getNode0() {
        ListNode head = new ListNode(9);
        ListNode l2 = new ListNode(16);
        ListNode l3 = new ListNode(23);
        ListNode l4 = new ListNode(24);
        ListNode l5 = new ListNode(26);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        return head;
    }

    private static ListNode getNode1() {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(13);
        ListNode l4 = new ListNode(24);
        ListNode l5 = new ListNode(26);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        return head;
    }

    private static ListNode getNode2() {
        ListNode head = new ListNode(3);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(23);
        ListNode l4 = new ListNode(34);
        ListNode l5 = new ListNode(35);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        return head;
    }

    private static void print(ListNode head) {
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
