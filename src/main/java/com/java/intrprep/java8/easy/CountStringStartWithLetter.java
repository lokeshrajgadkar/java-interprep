package com.java.intrprep.java8.easy;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountStringStartWithLetter {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "apple", "hat", "CAT", "seA", "PiN", "Arrow", "Comet");

        Long result = list.stream()
                .filter(w -> w.toLowerCase().startsWith("s"))
                .count();
        System.out.println(result);

    }
}
