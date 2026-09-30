package com.java.intrprep.java8.easy;

import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithComma {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "apple", "hat", "CAT", "seA", "PiN", "Arrow", "Comet");

        String result = list.stream()
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println(result);
    }
}
