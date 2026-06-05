package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args){
        //How to find the duplicate elements in a given integers list in the java using Stream functions?
        int[] arr = {3,6,2,6,8,5,3,5,7,9,4,3,2,1};

        //This one is not correct answer coz its removing the number & its duplicate completely->
        Set<Integer> result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() <= 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println("This one is not correct answer coz its removing the number & its duplicate completely: "+result);

        //This one is correct answer->
        List<Integer> result2 = Arrays.stream(arr)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("This one is correct answer & its preserving the order too -> "+result2);

    }
}
