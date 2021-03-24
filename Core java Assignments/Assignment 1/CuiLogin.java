package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String Username="Shweta", Password="Sk1234";
        Scanner input= new Scanner(System.in);
        int i=0;
        while(++i<=3){
            System.out.println("Login here....");
            System.out.println("Enter Your Name: ");
            String Username1= input.nextLine();
            System.out.println("Enter Your Password: ");
            String Password1= input.nextLine();
            if(Username1.equals(Username) && Password1.equals(Password)){
                System.out.println("Welcome.!!");
                break;
            }
            if(!Username1.equals(Username) )
                System.out.println("You have entered incorrect User Name!");
            if(!Password1.equals(Password))
                System.out.println("You have entered incorrect Password!");

            if(i==3)
                System.out.println("Contact Admin!");
        }



    }
}
