package com.java.intrprep.java8.supereasy;

import java.util.List;

public class ConvertToSquare {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 5, 4, 3, 6, 9, 8, 7);

        List<Integer> result = list.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(result);
    }
}
