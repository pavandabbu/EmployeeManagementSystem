package com.freedomfinancialnetwork.app.DAO;

import com.freedomfinancialnetwork.app.model.Employee;

public interface EmployeeInterfaceDAO {

	Employee getEmployeeById(int id);
	
	public String updateEmployee(int id,String name);
	
	public String insertEmployee(int id,String name, String Gender, int Dept_id);
	
	public String deleteEmployee(int id);
}
