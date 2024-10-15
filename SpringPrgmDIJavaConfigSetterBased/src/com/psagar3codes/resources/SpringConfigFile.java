package com.psagar3codes.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psagar3codes.beans.Address;
import com.psagar3codes.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address getAddObj() {
		
		Address add = new Address();
		
		add.setHouseNo(356);
		add.setCity("Jalgaon");
		add.setPinCode(424107);
		
		return add;
	}
	
	@Bean
	public Student getStudentObj() {
		Student std = new Student();
		
		std.setRollNo(33);
		std.setName("Pachode");
		std.setAddress(getAddObj());
		
		return std;
	}

}
