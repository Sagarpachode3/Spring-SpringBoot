package com.psagar3codes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.psagar3codes.resources.SpringConfigFile;

public class App {
	
	public static void main(String[] args) {
		
//		String name="Sagar";
//		int rollNo=70;
//		float percentage = 89.27f;
		
		String name="Rakesh";
		int rollNo=33;
		float percentage = 85.83f;
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		JdbcTemplate bean = context.getBean(JdbcTemplate.class);
		
		String insert_query = "INSERT INTO Students values (?,?,?)";
//		int update = bean.update(insert_query,name,rollNo,percentage);
		int update = bean.update(insert_query,rollNo,name,percentage);
		
		if (update >0) {
			System.out.println("Data inserted Successfully.");
		}else {
			System.out.println("Data is not inserted !");
		}
	}
}
