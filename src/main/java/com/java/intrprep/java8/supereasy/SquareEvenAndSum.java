package com.java.intrprep.java8.supereasy;

import java.util.List;
import java.util.Optional;

public class SquareEvenAndSum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer result = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println(result);
    }
}
