package com.weaponlin.leetcode_cn.p657;

public class Solution657 {

    public static void main(String[] args) {
        Solution657 s = new Solution657();
        System.out.println(s.judgeCircle("UD"));
    }

    public boolean judgeCircle(String moves) {
        if (moves == null || moves.isEmpty()) {
            return true;
        }
        // R（右），L（左），U（上）和 D（下）
        int x = 0, y = 0;
        for (int i = 0, j = moves.length(); i < j; i++) {
            if ('R' == moves.charAt(i)) {
                x++;
            } else if ('L' == moves.charAt(i)) {
                x--;
            } else if ('U' == moves.charAt(i)) {
                y++;
            } else if ('D' == moves.charAt(i)) {
                y--;
            } else {
                return false;
            }
        }
        return x == 0 && y == 0;
    }
}
