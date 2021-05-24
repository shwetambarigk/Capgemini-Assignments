package com.spring.jdbc;

public class Employee {

	private int emp_id;
	private String emp_name;
	private int age;
	private String designation;
	private int dept_code;
	private String manger;
	public Employee() {
		
	}
	public Employee(int emp_id, String emp_name, int age, String designation, int dept_code, String manger) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
		this.designation = designation;
		this.dept_code = dept_code;
		this.manger = manger;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getDept_code() {
		return dept_code;
	}
	public void setDept_code(int dept_code) {
		this.dept_code = dept_code;
	}
	public String getManger() {
		return manger;
	}
	public void setManger(String manger) {
		this.manger = manger;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", age=" + age + ", designation=" + designation
				+ ", dept_code=" + dept_code + ", manger=" + manger + "]";
	}
	
	
}
