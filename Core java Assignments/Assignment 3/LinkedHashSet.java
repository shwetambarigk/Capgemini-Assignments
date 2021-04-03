package com.company;


import java.util.Iterator;
import java.util.LinkedHashSet;
public class Main
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        lhs.add(6);
        System.out.println("The output of LinkedHashSet is :");
        System.out.println(lhs);

    }

}