package com.company;
import java.util.*;
public class HashMapE {

    public static void main(String[] args) {
        // write your code here
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("7-3-1999", "Ram");
        map.put("2-4-1998", "Vinay");
        map.put("3-5-1997", "Govind");
        map.put("4-2-1999", "Seeta");

        System.out.println("Hashmap Contains.....");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}