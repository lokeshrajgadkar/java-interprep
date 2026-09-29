package com.java.intrprep.java8.supereasy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxNum {
    public static void main(String[] args) {
        List<Integer> list = List.of(8, 5, 3, 4, 2, 10, 7, 1, 9, 6);

        Optional<Integer> max = list.stream()
                .max(Comparator.naturalOrder());

        System.out.println(max);
    }
}
