package com.java.intrprep.java8.easy;

import java.util.List;

public class FindDistinctNums {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 2, 1, 6, 3, 5, 1, 3, 7, 9, 7);

        List<Integer> result = list.stream()
                .distinct()
                .toList();

        System.out.println(result);
    }
}
