package com.java.intrprep.dynamicpro;

import java.util.HashMap;

public class Fibonacci {

    private static int fib(int n){
        return fib(n, new HashMap<>());
    }

    private static int fib(int n, HashMap<Integer, Integer> memo){

        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        if (memo.containsKey(n)){
            return memo.get(n);
        }

        int result = fib(n-1, memo) +fib(n-2,memo);

        memo.put(n,result);
        return result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(fib(45)+" completed in "+ (System.currentTimeMillis() - start) + " time");
    }
}
