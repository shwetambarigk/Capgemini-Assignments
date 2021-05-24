package com.spring.jdbc;


import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDao {

	public Employee getdetail(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	public int findTotalEmployee() {
		
		String sql = "SELECT COUNT(*) FROM Employee";
		
		int count = getJdbcTemplate().queryForObject(sql, Integer.class);
		return count;
	}
	
	/*
	  private SimpleJdbcCall simpleJdbcCall;
	  public void setDataSource (DataSource dataSource) {
		  this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("read_employee");
	  }
	 
	 public Employee getEmployee(int employeeId){
	 SqlParameterSource in = new MapSqlParameterSource().addValue("in_emp_id", emp_id);
	 Map<String, Object> out = simpleJdbcCall.execute(in);
	 Employee employee = new Employee();
	 employee.setemp_id(emp_id);
	 employee.setemp_name((String)out.get("out_name");
	 return employee;
	 }
*/
}
