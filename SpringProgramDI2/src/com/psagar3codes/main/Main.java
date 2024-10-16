package com.psagar3codes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psagar3codes.beans.Student;

public class Main {

	public static void main(String[] args) {
		String fileLocation = "/com/psagar3codes/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(fileLocation);

		Student std = (Student) context.getBean("stdId");
		std.display();
	}

}
