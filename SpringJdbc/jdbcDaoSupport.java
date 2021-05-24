package com.spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class jdbcDaoSupport extends JdbcDaoSupport implements EmployeeDao {

	private   JdbcTemplate jdbctemplate;

	public int insert(Employee employee) {
		  String query="insert into emp(emp_id,name,age,designation,dept_code,manager) values(?,?,?,?,?,?)";
	       int i = this.jdbctemplate.update(query,employee.getEmp_id(),employee.getEmp_name(),employee.getAge(),employee.getDesignation(),employee.getDept_code(),employee.getManger());
		return i;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public List<Employee> getAlldetails() {
		// select multiple student
		String query="select * from emp";
	List<Employee>	emp= this.jdbctemplate.query(query,new RowMapperImpl());
		return emp;
	}
	
	
  //for printing using bean poroeprty rowmapper
	public Employee getdetail(int empid) {
		String sql="SELECT * FROM emp WHERE emp_id=?";
		Employee emp=(Employee) getJdbctemplate().queryForObject(sql,new Object[] {empid},new BeanPropertyRowMapper(Employee.class));
		return emp;
	}
	
}
