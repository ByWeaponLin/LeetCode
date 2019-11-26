package com.weaponlin.leetcode_cn.p27;

/**
 * https://leetcode-cn.com/problems/remove-element/
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else if (count > 0) {
                nums[i - count] = nums[i];
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        Solution solution = new Solution();
        int len = solution.removeElement(nums, 3);
        print(nums, len);
    }

    private static void print(int[] nums, int len) {
        System.out.println("len: " + len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ", ");
        }

    }
}
