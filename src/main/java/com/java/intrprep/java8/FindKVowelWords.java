package com.java.intrprep.java8;

import java.util.Arrays;
import java.util.List;

public class FindKVowelWords {
    public static void main(String[] args) {

        //Find the words with “k” vowels in a given sentence
        List<String> arr = Arrays.asList("kite","crow","bike","kettle","skill","apple","nike","mike");

        List<String> result = arr.stream()
                .filter(a -> a.contains("k"))
                .toList();
        System.out.println(result);

    }
}
