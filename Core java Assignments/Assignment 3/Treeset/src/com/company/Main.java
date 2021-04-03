package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Person> p=new TreeSet<Person>();
        Person s1=new Person(10,50,"shweta");
        Person s2=new Person(15,80,"sakshi");
        Person s3=new Person(20,40,"priya");
        Person s4=new Person(30,90,"aarti");

        p.add(s1);
        p.add(s2);
        p.add(s3);
        p.add(s4);
        for (Person person : p) {
            p.display();
    }
}
