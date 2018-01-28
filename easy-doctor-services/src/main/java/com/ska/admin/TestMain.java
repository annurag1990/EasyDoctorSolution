package com.ska.admin;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ska.admin.entity.Address;
import com.ska.admin.entity.Registration;

public class TestMain {
	
	//TODO::
	public static void main(String[] args) throws JsonProcessingException {
		Registration reg = new Registration();
		Address add = new Address();
		Address add2 = new Address();
		
		reg.setContactNo("333");
		reg.setName("anurag");
		
		add.setAddress("delhi");
		add2.setAddress("varanasi");
		
		Set<Address> adds =new HashSet<>();
		adds.add(add);
		adds.add(add2);
		reg.setAddress(adds);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonInString = mapper.writeValueAsString(reg);
		
		System.out.println(jsonInString);
	}

}
