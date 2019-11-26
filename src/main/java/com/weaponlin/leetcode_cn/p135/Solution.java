package com.weaponlin.leetcode_cn.p135;

public class Solution {
    public int candy(int[] ratings) {
        if (ratings == null) {
            return 0;
        }
        if (ratings.length == 1) {
            return 1;
        }

        int curCandies = 1;
        int[] result = new int[ratings.length];
        result[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                result[i] = ++curCandies;
            } else if (ratings[i] == ratings[i - 1]) {
                curCandies = 1;
                result[i] = curCandies;
            } else {
                curCandies = 1;
                result[i] = curCandies;
                for (int j = i; j > 0; j--) {
                    if (ratings[j - 1] > ratings[j] && result[j - 1] == result[j]) {
                        result[j - 1] = result[j - 1] + 1;
                    } else {
                        break;
                    }
                }
            }
        }

        int sumCandies = 0;
        for (int i = 0; i < result.length; i++) {
            sumCandies += result[i];
        }
        return sumCandies;
    }

    /**
     * better code
     */
    public int candy2(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return -1;
        }
        int[] L = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            L[i] = 1;
        }
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]
                    && L[i] <= L[i - 1]) {
                L[i] = L[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]
                    && L[i] <= L[i + 1]) {
                L[i] = L[i + 1] + 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < L.length; i++) {
            sum += L[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.candy(new int[]{1, 0, 2}));
        System.out.println(solution.candy(new int[]{1, 2, 2}));
        System.out.println(solution.candy(new int[]{2, 1, 2, 1, 0}));
        System.out.println(solution.candy(new int[]{1, 2, 3, 1, 0}));
    }
}
