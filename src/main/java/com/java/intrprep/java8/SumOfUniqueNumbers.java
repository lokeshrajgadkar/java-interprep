package com.java.intrprep.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOfUniqueNumbers {
    public static void main(String[] args) {

        //Find the sum of the unique numbers from a given list?
        int[] nums = {4,5,7,3,4,2,5,4,8,5,7,10,9};

//         List<Integer> result =Arrays.stream(nums)
//                .boxed()
//                .distinct()
//                .toList();

        Optional<Integer> result = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .reduce(Integer::sum);
//                .toList();
        System.out.println(result);
    }
}
