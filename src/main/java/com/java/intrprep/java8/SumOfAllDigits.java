package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int num = 12345;

        Optional<Integer> s = Arrays.stream(String.valueOf(num).split(""))
                .map(Integer::parseInt)
                .reduce(Integer::sum);
        System.out.println(s);
    }
}

