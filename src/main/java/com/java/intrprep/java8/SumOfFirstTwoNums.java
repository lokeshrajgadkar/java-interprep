package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.Optional;

public class SumOfFirstTwoNums {
    public static void main(String[] args) {

        //Find the sum of the first two numbers from the given list?
        int[] nums = {4,5,7,3,2};

        Optional<Integer> result = Arrays.stream(nums)
                .boxed()
                .limit(2)
                .reduce(Integer::sum);

        System.out.println(result);
    }
}
