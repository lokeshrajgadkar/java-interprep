package com.java.intrprep.java8.easy;

import java.util.List;

public class AllMatchExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        boolean result = list.stream().allMatch(n -> n > 0);
        System.out.println(result);
    }
}
