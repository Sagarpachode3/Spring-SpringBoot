package com.psagar3codes.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psagar3codes.beans.Address;
import com.psagar3codes.beans.Student;
import com.psagar3codes.beans.Subjects;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address getAddObj1() {
		Address add = new Address();
		add.setHouseNo(452);
		add.setCity("Jalgaon");
		add.setPinCode(424106);
		return add;
	}

	@Bean
	public Address getAddObj2() {
		Address add = new Address();
		add.setHouseNo(42);
		add.setCity("Bhadgaon");
		add.setPinCode(424107);
		return add;
	}

	@Bean
	public Subjects getSubObj() {
		Subjects sub = new Subjects();

		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JavaScript");
		list.add("SpringBoot");

		sub.setSub(list);
		return sub;
	}

	@Bean
	public Student getStudentObj() {
		Student std = new Student();
		std.setRollNo(33);
		;
		std.setName("Pachode");
		return std;
	}

}
