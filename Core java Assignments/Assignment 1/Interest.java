package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter Principal:");
        double principal= input.nextDouble();

        System.out.print("Enter rate:");
        double rate= input.nextDouble();

        System.out.print("Enter Time:");
        double time= input.nextDouble();

        System.out.print("Enter Number:");
        int num= input.nextInt();

        double interest = (principal * time * rate) / 100;
        System.out.println("Simple Intrest: " + interest);

        double cinterest = principal * (Math.pow((1 + rate/100), (time * num))) - principal;
        System.out.println("Compound Interest:" + cinterest);

    }
}