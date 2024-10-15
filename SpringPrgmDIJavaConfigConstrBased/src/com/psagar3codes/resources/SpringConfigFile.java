package com.psagar3codes.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psagar3codes.beans.Address;
import com.psagar3codes.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address getAddObj() {	
		Address add = new Address(123,"Gudhe",424106);
		return add;
	}
	
	@Bean
	public Student getStudentObj() {
		Student std = new Student(333,"S Patil",getAddObj());
		return std;
	}

}
