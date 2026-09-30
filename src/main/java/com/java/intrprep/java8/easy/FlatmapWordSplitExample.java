package com.java.intrprep.java8.easy;

import java.util.Arrays;
import java.util.List;

public class FlatmapWordSplitExample {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello world", "Java streams are powerful");

        List<String> result = sentences.stream()
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(result);
    }
}
