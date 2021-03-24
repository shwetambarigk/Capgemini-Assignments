package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

         Scanner input= new Scanner(System.in);

         System.out.print("Enter A1 subject marks:");
         int A1= input.nextInt();

         System.out.print("Enter A2 subjects marks:");
         int A2= input.nextInt();

         System.out.print("Enter A3 subject marks");
         int A3= input.nextInt();

         if(A1>60 && A2>60 && A3>60){
             System.out.println("Exam status is: Passed.");
         }
         else if (((A1>60 && A2>60) || A3>60)){
             System.out.println("Exam status is: Promoted.");
         }
         else
             System.out.println("Failed!");
    }
}