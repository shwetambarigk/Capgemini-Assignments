package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank= new Current();
        System.out.println(bank.cash());
    }
}
abstract class Bank{
    String name;
    abstract String cash();
}

class Current extends Bank{
    String cash(){
        return "cash credit";
    }
}

class Saving extends Bank{
    String cash(){
        return "Fix Deposite";
    }
}