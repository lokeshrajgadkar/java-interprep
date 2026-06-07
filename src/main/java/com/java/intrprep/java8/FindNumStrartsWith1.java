package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.List;

public class FindNumStrartsWith1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(7,14,81,36,102,18,201);

        //Q15 Find all the numbers starting with 1 from the list using streams?
        List<Integer> result = nums.stream()
                .filter(n -> String.valueOf(n).startsWith("1"))
                .toList();

        System.out.println(result);
    }
}
