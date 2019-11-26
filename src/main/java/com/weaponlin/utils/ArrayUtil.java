package com.weaponlin.utils;

import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class ArrayUtil {

    public void print(int[] array) {
        Arrays.stream(array).forEach(e -> {
            System.out.print(e + ", ");
        });
        System.out.println();
    }
}
