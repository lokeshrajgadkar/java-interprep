package com.java.intrprep.java8.easy;

import java.util.List;

public class AnyMatchString {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "apple", "hat", "CAT", "seA", "PiN", "Arrow", "Comet");

        boolean result = list.stream()
                .anyMatch(n -> n.toLowerCase().startsWith("a"));

        System.out.println(result);
    }
}
