package com.company;

import java.util.HashSet;
import java.util.Iterator;
public class Main {
    public static void main(String args[]){
        HashSet<String> f=new HashSet();  // Implementing HashSet
        f.add("Mango");    //Adding elements
        f.add("Tree");
        f.add("Zoo");
        f.add("Bird");
        f.add("Elephant");
        Iterator<String> i=f.iterator();  // Traversing objects
        while(i.hasNext())  // Return true if the Scanner has another token input
        {
            System.out.println(i.next()); // printing elements
        }
    }
}  