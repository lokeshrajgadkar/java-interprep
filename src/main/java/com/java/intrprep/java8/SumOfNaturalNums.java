package com.java.intrprep.java8;

import java.util.stream.IntStream;

public class SumOfNaturalNums {

    //Q2 How do you find the sum of first 10 natural numbers?
    //Q2 How do you find the sum of first 10 even numbers?
    //Q2 How do you find the sum of first 10 odd numbers?
    public static void main(String[] args) {
        int natualSum = IntStream.rangeClosed(1, 10)
                .sum();
        System.out.println("natualSum: "+natualSum);

        int evenSum = IntStream.rangeClosed(2, 20)
                .filter(e -> e%2==0)
                .sum();
        System.out.println("evenSum: "+evenSum);

        int oddSum = IntStream.rangeClosed(1, 20)
                .filter(e -> e%2==1)
                .sum();
        System.out.println("oddSum: "+oddSum);
    }
}
