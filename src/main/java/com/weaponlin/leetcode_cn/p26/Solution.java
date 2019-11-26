package com.weaponlin.leetcode_cn.p26;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
class Solution {
    private int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int len = 1;
        int current = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[current] != nums[i]) {
                len++;
                nums[++current] = nums[i];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int len1 = solution.removeDuplicates(nums1);
        print(nums1, len1);
        System.out.println("len1: " + len1);

        int len2 = solution.removeDuplicates(nums2);
        print(nums2, len2);
        System.out.println("len2: " + len2);
    }

    private static void print(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ", ");
        }

    }
}
