package com.freedomfinancialnetwork.app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.freedomfinancialnetwork.app.model.Employee;

public class EmployeeDAO extends EmployeeBaseDAO implements EmployeeInterfaceDAO{
		
		public Employee getEmployeeById(int id){
				
				Employee employee = null;
				
				try{	
					Connection connection = getConnection();
					String query = "select * from pavan.employee where emp_id=?";
					
					PreparedStatement preparedStatement = connection.prepareStatement(query);
					
					preparedStatement.setInt(1,id);
					
					ResultSet resultSet = preparedStatement.executeQuery();
					
					if (resultSet.next()){
					
						employee = new Employee();
						employee.setId(resultSet.getInt("emp_id"));
						employee.setName(resultSet.getString("name"));
						employee.setGender(resultSet.getString("Gender"));
						employee.setDept_id(resultSet.getInt("Dept_id"));
						
					}
					
				}catch(Exception e){
					e.printStackTrace();
				}
			
				return employee;
			}
		
		public String updateEmployee(int id,String name){
			
	    	try{
	    		Connection connection = getConnection();
				String updatequery = "UPDATE pavan.employee set Name=? where emp_id=?";
				
				PreparedStatement preparedStatement = connection.prepareStatement(updatequery);
				preparedStatement.setString(1, name);
				preparedStatement.setInt(2,id);
				preparedStatement.executeUpdate();
					
			}catch(Exception e){
				e.printStackTrace();
			}
	    	return "Employee details sucessfully updated";
		}
        
		
	    public String insertEmployee(int id,String name, String Gender, int Dept_id){
			
			try{	
				Connection connection = getConnection();
			System.out.println("emp_id:"+id);
			System.out.println("Name:"+name);
			System.out.println("Gender:"+Gender);
			System.out.println("Dept_id:"+Dept_id);	
			
			String query = "INSERT INTO pavan.employee(emp_id,Name,Gender,Dept_id)VALUES(?,?,?,?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2,name);
			preparedStatement.setString(3,Gender);
			preparedStatement.setInt(4,Dept_id);	
			preparedStatement.executeUpdate();
				
			}catch(Exception e){
				e.printStackTrace();
			}
	    	return "Employee details sucessfully inserted in a table";
	    }

	    public String deleteEmployee(int id){
			
			try{
				Connection connection = getConnection();
                String query = "DELETE from pavan.employee where emp_id=?" ;
                
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1,id);
				preparedStatement.executeUpdate();
		
			}catch(Exception e){
				e.printStackTrace();
			}
			return "Employee details sucesfully deleted";					
	    }

}


