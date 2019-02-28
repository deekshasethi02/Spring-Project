package com.example.pbapp.contactServiceImpl;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;

import com.example.pbapp.domain.Contact;
import com.example.pbapp.service.ContactService;

public class TestContactService_FindUserContact {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		ContactService contactServcie =ctx.getBean(ContactService.class);
		
		List<Contact> contacts = contactServcie.findUserContact(10, "a");
		for (Contact contact : contacts) {
			System.out.println("Name : " +contact.getName());
		}
		
		System.out.println("success! contact found");
	}
}
