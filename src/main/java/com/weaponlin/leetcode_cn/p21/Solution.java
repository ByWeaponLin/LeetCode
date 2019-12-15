package com.weaponlin.leetcode_cn.p21;

import com.weaponlin.pojo.ListNode;

public class Solution {

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
        print(solution.mergeTwoLists(getNode1(), getNode2()));
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
