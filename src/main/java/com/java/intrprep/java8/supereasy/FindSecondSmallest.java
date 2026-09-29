package com.java.intrprep.java8.supereasy;

import java.util.List;

public class FindSecondSmallest {
    public static void main(String[] args) {
        List<Integer> list = List.of(8, 5, 3, 4, 2, 10, 7, 1, 9, 6);

        Integer result = list.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(result);

    }
}
