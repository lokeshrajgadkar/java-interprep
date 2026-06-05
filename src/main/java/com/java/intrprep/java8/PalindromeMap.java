package com.java.intrprep.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromeMap {

    //Q.1 Convert a list of string into a map where each string
    // is the key and the value is a Boolean indicating if the string is a palindrome?

    public static void main(String[] args) {
        List<String> str = Arrays.asList("level","apple","radar","banana","madam");

        Map<String, Boolean> result = str.stream()
                .collect(Collectors.toMap(Function.identity(),
                        st -> st.contentEquals(new StringBuffer(st).reverse()))
                );

        System.out.println(result);
    }
}
