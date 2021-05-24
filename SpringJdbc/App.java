package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.EmployeeDao;
import com.spring.jdbc.Employee;
public class App 
{
    public static void main( String[] args )
   
    {
        System.out.println( "Program Started!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       //  EmployeeDao emp= context.getBean("EmployeeDao",EmployeeDao.class);
       // Employee e1=new Employee();
        
        
        //question 1
        /*e1.setEmp_id(3135);
        e1.setName("Brian Osborne");
        e1.setAge(34);
        e1.setDesignation("Business Development Manager");
        e1.setDept_code(343);
        e1.setManager("Winifreed Griffith");
        int result=emp.insert(e1);
        System.out.println("employee added!"+reslt);
        */
        
        /*//qusetion 2
        List<Employee> list = emp.getAlldetails();
        for(Employee e:list) {
        	System.out.println(e);
        
        */
        
          EmployeeDao emp = context.getBean("e1",EmployeeDao.class);
       
        //question5
        //EmployeeDao emp=(EmployeeDao) context.getBean("EmployeeDao",EmployeeDao.class);
        Employee e1=emp.getdetail(1); 
        System.out.println("employee"+e1);
        
        /* question 7
         * EmployeeDao employeeDao =(EmployeeDao) context.getBean("employeeDao");
         * int count = employeeDao.findTotalEmployee();
         * System.out.println("count" + count);
         */
         
        
        /*question 8*/
        /*EmployeeDao employeeDao =(EmployeeDao) context.getBean("employeeDao");
         * Employee employee = new Employee(3135, "Georgia Garraway", 43, "PHP developer", 763, "Jake Mathews");
         * employeeDao.insert(employee);
         * System.out.println("Employee result inserted successfully.");
         */
        
        /*question 9
         * Employee employee = employeeDao.getEmployee(3);
         * Sstem.out.println(employee);
         *  
         *  */
        }
       
    }
