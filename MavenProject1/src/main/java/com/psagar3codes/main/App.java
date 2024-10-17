package com.psagar3codes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psagar3codes.beans.Student;

public class App {
	
	public static void main(String[] args) {
		
		String file_location = "/com/psagar3codes/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(file_location);
		
		Student student = context.getBean(Student.class);
		student.display();
	
	}
}
