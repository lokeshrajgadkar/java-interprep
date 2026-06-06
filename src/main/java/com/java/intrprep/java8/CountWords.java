package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {

        //Count occurrence of each word in the given sentence?
        String str = "To be or not to be that is the question";
        Map<String, Long> result = Arrays.stream(str.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);


    }
}
