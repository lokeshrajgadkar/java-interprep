package com.java.intrprep.java8.easy;

import java.util.List;

public class ConvertToUppercase {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "apple", "hat", "CAT", "seA", "PiN", "Arrow", "Comet");

        List<String> result = list.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(result);
    }
}
