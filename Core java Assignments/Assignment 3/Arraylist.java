package com.company;

import java.util.ArrayList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Mango");
        aList.add("Lemon");
        aList.add("Banana");
        aList.add("Grapes");
        aList.add("Nuts");
        ListIterator<String> li = aList.listIterator();
        while (li.hasNext()) {
            li.next();
        }
        System.out.println("The ArrayList elements in the reverse direction are: ");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}