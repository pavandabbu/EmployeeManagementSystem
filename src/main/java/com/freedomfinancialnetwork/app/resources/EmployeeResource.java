package com.freedomfinancialnetwork.app.resources;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.freedomfinancialnetwork.app.DAO.EmployeeDAO;
import com.freedomfinancialnetwork.app.model.Employee;

@Path("/profiles")
public class EmployeeResource {

	private EmployeeDAO em = new EmployeeDAO();
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Employee getEmployees(@PathParam("id") int id){
		
		Employee employee= null;
		
		try{
			
		 employee = em.getEmployeeById(id);
		}
		catch(Exception e){
			
		}
		return employee;
	}
	
	@POST
	@Path("/{id}/{name}")
	public String addProfile(@PathParam("id") int id, @PathParam("name") String name ) {
		try{
			
			return em.updateEmployee(id,name);
			}
			catch(Exception e){
				
			}
			return em.updateEmployee(id,name);
			
		}

	
	@PUT
	@Path("/{id}/{name}/{Gender}/{Dept_id}")
	public String updateEmployee(@PathParam("id") int id, @PathParam("name")String name,
				@PathParam("Gender") String Gender,@PathParam("Dept_id") int Dept_id) {
		
		return em.insertEmployee(id,name,Gender,Dept_id);
	}
	
	
	@DELETE
	@Path("/{id}")
	public void deleteEmployee(@PathParam("id") int id){
		
		em.deleteEmployee(id);
	}
	
}
	