package com.weaponlin.leetcode_cn.p19;

import com.weaponlin.pojo.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/submissions/
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) {
            return head;
        }
        if (head == null) {
            return head;
        }

        ListNode first = head;

        for (int i = 0; i < n; i++) {
            if (first == null) {
                return head;
            }
            first = first.next;
        }
        if (first == null) {
            return head.next;
        }

        ListNode second = head;
        while(first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }


    public static void main(String[] args) {

        Solution solution = new Solution();
        print(solution.removeNthFromEnd(getNode(), -1));
        print(solution.removeNthFromEnd(getNode(), 0));
        print(solution.removeNthFromEnd(getNode(), 1));
        print(solution.removeNthFromEnd(getNode(), 2));
        print(solution.removeNthFromEnd(getNode(), 3));
        print(solution.removeNthFromEnd(getNode(), 4));
        print(solution.removeNthFromEnd(getNode(), 5));
        print(solution.removeNthFromEnd(getNode(), 6));
    }

    private static ListNode getNode() {
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
