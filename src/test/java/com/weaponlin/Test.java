package com.weaponlin;

import com.weaponlin.utils.ArrayUtil;

public class Test {

    @org.junit.Test
    public void test() {
        int a = 1;
        int b = 1;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a + " " + b);
    }

    @org.junit.Test
    public void test1() {
        int[] arr = {1, 2};
        ArrayUtil.print(arr);
        arr[0] ^= arr[0];
        arr[0] ^= arr[0];
        arr[0] ^= arr[0];
        ArrayUtil.print(arr);
    }

    @org.junit.Test
    public void test2() {
        int a = 1;
        int b = 2;
        a ^= a;
        a ^= a;
        a ^= a;
        System.out.println(a + " " + b);
    }
}
