package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.Comparator;

public class NthSmallestElement {
    public static void main(String[] args) {
        // Find the nth smallest element in an array using java stream?
        int[] arr = {12,3,5,7,19,1,8};
        int n = 3;

        Arrays.stream(arr)
                .boxed()
                .sorted()
                .limit(n)
                .max(Comparator.naturalOrder()).ifPresent(System.out::println);

        Arrays.stream(arr)
                .sorted()
                .skip(n-1)
                .findFirst().ifPresent(System.out::println);
    }
}
