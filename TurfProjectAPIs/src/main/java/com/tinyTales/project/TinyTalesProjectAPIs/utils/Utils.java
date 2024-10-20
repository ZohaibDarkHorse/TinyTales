package com.tinyTales.project.TinyTalesProjectAPIs.utils;

import org.springframework.stereotype.Component;

import com.tinyTales.project.TinyTalesProjectAPIs.model.Fault;

@Component
public class Utils {

	public Fault createBadRequestFault(String Description,int number,String type){
		
		Fault oFault = new Fault();
		oFault.setDescription(Description);
		oFault.setNumber(number);
		oFault.setType(type);
		
		return oFault;
		
	}
	
}
