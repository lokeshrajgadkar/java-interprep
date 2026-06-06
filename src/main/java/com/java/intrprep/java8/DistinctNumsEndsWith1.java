package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctNumsEndsWith1 {
    public static void main(String[] args) {

        // Print Distinct Numbers which end with “1” in Ascending order?
        int[] nums = {4,6,11,61,31,11,6,66,93,71,31};
        Optional<Integer> result = Arrays.stream(nums)
                .boxed()
                .distinct()
                .filter(n -> n % 10 == 1)
                .reduce(Integer::sum);

        System.out.println(result);
    }
}
