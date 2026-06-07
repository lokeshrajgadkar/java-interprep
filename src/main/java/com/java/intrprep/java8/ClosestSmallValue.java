package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClosestSmallValue {
    public static void main(String[] args) {
        // Find the closest element smaller than the given value?
        List<Integer> nums = Arrays.asList(12,5,7,23,46,8,67,52);
        int given = 23;

        Integer result = nums.stream()
                .sorted()
                .filter(n -> n < given)
                //.max(Comparator.comparing(Integer::valueOf)).orElse(0);
                .max(Comparator.naturalOrder()).orElse(0);

        System.out.println(result);

    }
}
