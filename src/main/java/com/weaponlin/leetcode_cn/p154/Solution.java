package com.weaponlin.leetcode_cn.p154;

public class Solution {

    public int findMin(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        if (nums[nums.length - 1] >= nums[0]) {
            return nums[0];
        }
        return doFindMin(0, nums.length - 1, nums);
    }

    private int doFindMin(int start, int end, int[] nums) {
        if (start < end) {
            int mid = (start + end) / 2;
            if (nums[0] >= nums[mid]) {
                mid = moveMidToLeft(nums, start, mid);
                return doFindMin(start, mid - 1, nums);
            } else {
                mid = moveMidToRight(nums, end, mid);
                return doFindMin(mid + 1, end, nums);
            }
        } else {
            if (start < nums.length - 1 && nums[start] > nums[start + 1]) {
                return nums[start + 1];
            } else {
                return nums[start];
            }
        }
    }

    private int moveMidToLeft(int[] nums, int start, int mid) {
        while (mid >= start && nums[mid] == nums[mid - 1]) {
            mid--;
        }
        return mid;
    }

    private int moveMidToRight(int[] nums, int end, int mid) {
        while (mid <= end && nums[mid] == nums[mid + 1]) {
            mid++;
        }
        return mid;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(solution.findMin(nums));

        nums = new int[]{2, 2, 2, 0, 1};
        System.out.println(solution.findMin(nums));

        nums = new int[]{2, 2, 2, 0, 1, 2, 2};
        System.out.println(solution.findMin(nums));
    }
}
