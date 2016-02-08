package com.example.javaeerest.interactors.implementations;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.javaeerest.collaborators.boundaries.EmployeeService;
import com.example.javaeerest.collaborators.entities.Employee;

@Path( "/" )
public class EmployeeServiceImpl
	implements EmployeeService
{
	@Inject
	private Employee employee;
	
	@Path( "/employee" )
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	@Override
	public Employee getEmployee()
	{
		return employee;
	}
}
