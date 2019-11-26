package com.weaponlin.leetcode_cn.p349;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; nums1 != null && i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; nums2 != null && i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }

        if (set2.isEmpty()) {
            return new int[0];
        }

        int[] res = new int[set2.size()];
        Iterator<Integer> iterator = set2.iterator();
        int idx = 0;
        while (iterator.hasNext()) {
            res[idx++] = iterator.next();
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int a : arr) {
            System.out.println(a);
        }

        arr = solution.intersection(new int[]{9, 4, 9, 8, 4}, new int[]{4, 9, 5});
        for (int a : arr) {
            System.out.println(a);
        }

        arr = solution.intersection(null, null);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
