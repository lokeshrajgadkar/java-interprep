package com.java.intrprep.java8;

import java.util.Arrays;

public class GetLastElemFromArray {
    public static void main(String[] args) {
        int[] nums = {4,6,11,61,31,66,93};

        //How do you get the last element of an array?
        Integer result = Arrays.stream(nums)
                .boxed()
                .reduce((a, b) -> b)
                .orElse(0);

        System.out.println(result);
    }
}
