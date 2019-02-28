package com.example.pbapp.contactDaoTest;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.domain.Contact;

public class TestContactDAO_FindContactOperationById {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		ContactDAO contactDAO =ctx.getBean(ContactDAO.class);
		Contact  contact = contactDAO.findById(1);
		System.out.println("success! contact found");
		System.out.println("name : "+contact.getName());
	}
}
