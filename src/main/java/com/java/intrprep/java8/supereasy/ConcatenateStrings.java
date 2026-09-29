package com.java.intrprep.java8.supereasy;

import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Developer");

        String result = list.stream()
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
