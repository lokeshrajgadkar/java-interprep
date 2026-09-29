package com.java.intrprep.java8.easy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountStringStartWithLetter {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "apple", "hat", "CAT", "seA", "PiN", "Arrow", "Comet");

        Map<Boolean, Long> result = list.stream()
                .collect(Collectors.groupingBy(
                        w -> w.startsWith("h"),
                        Collectors.counting()
                ));
        System.out.println(result);

    }
}
