package com.weaponlin.leetcode_cn.p392;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        if (s == null) {
            return true;
        }
        if (s.equals(t)) {
            return true;
        }

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int si = 0, ti = 0;
        while (si < chars.length && ti < chart.length) {
            char cs = chars[si++];
            while (ti < chart.length && cs != chart[ti++]) {
            }
        }

        if (si < chars.length) {
            return false;
        } else if (ti < chart.length ) {
            return true;
        } else {
            return chars[si - 1] == chart[ti - 1];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("asf", "aaaffssss"));
        System.out.println(solution.isSubsequence("abc", "ahbgdc"));
        System.out.println(solution.isSubsequence("axc", "ahbgdc"));
    }
}
