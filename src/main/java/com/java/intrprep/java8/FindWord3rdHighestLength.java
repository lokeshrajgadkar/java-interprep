package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindWord3rdHighestLength {
    public static void main(String[] args) {
        //Find the word with third highest length?
        List<String> arr = Arrays.asList("apple","ok","out","bike","hat","sky","changed","chromium");

        String result = arr.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(2)
                        .findFirst().orElse("NaN");

        System.out.println(result);

    }
}
