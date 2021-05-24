package com.spring.jdbc;




import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Employee emp=new  Employee();
	      emp.setEmp_id(rs.getInt(1));
	      emp.setEmp_name(rs.getString(2));
	      emp.setAge(rs.getInt(3));
	      emp.setDesignation(rs.getString(4));
	      emp.setDept_code(rs.getInt(5));
	      emp.setManger(rs.getString(6));
		return emp;
	}
	
	/* using simple insert */
	/*private SimpleInsert simpleJdbcInsert;
	 * public void setDataSource(DataSource dataSource){
	 * this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName(Employee);}
	 * public void insert(Employee employee)
	 * {
	 * Map<String, Object> parameters = new HashMap<String, Object>(6); 
	 * parameters.put("emp_id", employee.getEmp_Id());
	 * parameters.put("emp_name", employee.getemp_name());
	 * parameters.put("age", employee.getage());
	 * parameters.put("designation", employee.getdesignation());
	 * parameters.put("dept_code", employee.getdept_code());
	 * parameters.put("manager", employee.getmanager());
	 * }
	 */
	
	 
}
