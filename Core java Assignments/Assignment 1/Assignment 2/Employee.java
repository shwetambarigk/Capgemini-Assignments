package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee= new Manager();
        System.out.println(employee.type());
    }
}
abstract class Employee{
      String name;
      abstract String type();
}

class Manager extends Employee{
    String type(){
        return "Manager has Incentive.!";
    }
}

class Labour extends Employee{
    String type(){
        return "Labour has Over Time!";
    }
}
