package com.weaponlin.leetcode_cn.p382;

import com.weaponlin.pojo.ListNode;

import java.util.Random;

public class Solution {
    private ListNode head;

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        Random ran = new Random();
        int res = head.val, i = 2;
        ListNode p = head.next;
        while (p != null) {
            if (ran.nextInt() % i == 0) {
                res = p.val;
            }
            i++;
            p = p.next;
        }
        return res;
    }
}
