package com.psagar3codes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.psagar3codes.beans.Student;
import com.psagar3codes.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
//		String fileLocation = "/com/psagar3codes/resources/applicationContext.xml";
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		Student std = (Student) context.getBean(Student.class);
		std.display();
	}

}
