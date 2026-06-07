package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestWord {
    public static void main(String[] args) {
        String str = "Where do you live";
        //Find the longest word in the string?
        String result = Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length)).orElse("NA");
        System.out.println(result);
    }
}
