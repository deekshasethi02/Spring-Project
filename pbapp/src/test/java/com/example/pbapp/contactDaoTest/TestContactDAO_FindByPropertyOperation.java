package com.example.pbapp.contactDaoTest;



import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.domain.User;

public class TestContactDAO_FindByPropertyOperation {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		ContactDAO contactDAO =ctx.getBean(ContactDAO.class);

		
		List<Contact> contacts = contactDAO.findByProperty("phone","23456");
		for (Contact contact : contacts) {
			System.out.println("name :" +contact.getName());
		}
		
		System.out.println("success!");
		
	}
}
