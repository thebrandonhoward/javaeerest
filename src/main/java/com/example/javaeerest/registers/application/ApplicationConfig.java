package com.example.javaeerest.registers.application;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.example.javaeerest.interactors.implementations.EmployeeServiceImpl;

@ApplicationPath( value = "services" )
public class ApplicationConfig
	extends Application
{
	@Override
	public Set<Class<?>> getClasses()
	{
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add( EmployeeServiceImpl.class );
		
		return resources;
	}
}
