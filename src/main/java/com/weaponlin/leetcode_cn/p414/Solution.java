package com.weaponlin.leetcode_cn.p414;

import java.util.Arrays;

/**
 * TODO
 */
public class Solution {


    public int thirdMax(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }

        int[] top = new int[3];
        int count = init(nums, top);
        if (count <= 2) {
            return top[2];
        }
        for (int i = 3; i < nums.length; i++) {
            resort(top, nums[i]);
        }

        return top[0];
    }

    private void resort(int[] top, int num) {
        int i = top.length - 1;
        for (; i >= 0; i--) {
            if (top[i] <= num) {
                break;
            }
        }
        if (i == -1 || top[i] == num) {
            return;
        }
        int j = 0;
        for (; j < i; j++) {
            top[j] = top[j + 1];
        }
        top[i] = num;
    }

    private int init(int[] nums, int[] top) {
        int count = 0;
        top[count] = nums[0];
        int i = 1;
        for (; i < nums.length && count < 2; i++) {
            int j = 0;
            for (; j <= count; j++) {
                if (top[j] == nums[i]) {
                    break;
                }
            }
            if (j != count || top[j] != nums[i]) {
                count++;
                top[j] = nums[i];
            }
        }
        Arrays.sort(top);
        return count + 1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.thirdMax(new int[]{3, 2, 1}));
        System.out.println(solution.thirdMax(new int[]{2, 1}));
        System.out.println(solution.thirdMax(new int[]{1, 1, 2}));
        System.out.println(solution.thirdMax(new int[]{2, 2, 3, 1}));
        System.out.println(solution.thirdMax(new int[]{1, 1, 1}));
        System.out.println(solution.thirdMax(new int[]{1, 2, 2, 5, 3, 5}));
    }
}
