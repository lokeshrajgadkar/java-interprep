package com.java.intrprep.hashMapsPrep;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("101","Nick");
        hashMap.put("102","Raya");
        hashMap.put("103","Kiyo");
        hashMap.put("104","Yuji");

        System.out.println(hashMap);
    }
}
