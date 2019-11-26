package com.weaponlin.leetcode_cn.p739;

public class Solution {

    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length <= 1) {
            return new int[]{0};
        }
        int[] r = new int[T.length];
        for (int i = 0; i < T.length - 1; i++) {
            r[i] = find(i + 1, T, T[i]);
        }
        return r;
    }

    private int find(int start, int[] a, int num) {
        int i = start;
        for (; i < a.length; i++) {
            if (a[i] > num) {
                break;
            }
        }
        if (i < a.length) {
            return i - start + 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for (int a : array) {
            System.out.println(a);
        }

    }
}
