package com.java.intrprep.java8.easy;

import java.util.Comparator;
import java.util.List;

public class SortDesc {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = list.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .toList();

        System.out.println(result);
    }
}
