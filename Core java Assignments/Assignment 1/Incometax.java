package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter CTC: ");
        long CTC= input.nextLong();

        if(CTC>0 && CTC<180001){
            System.out.println("Tax Ammount For Slab A: Nil");
        }
        else if(CTC>181001 && CTC<300001){
            System.out.println("Tax Amount for Slab B: 10%");
        }
        else if(CTC>300001 && CTC<500000){
            System.out.println("Tax Amount for Slab C: 20%");
        }
        else if(CTC>500001 && CTC<1000000){
            System.out.println("Tax Amount for Slab D: 30%");

        }
        else
            System.out.println("Invalid Record!");


    }
}