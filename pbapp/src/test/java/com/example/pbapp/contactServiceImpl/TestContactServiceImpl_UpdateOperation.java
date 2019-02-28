package com.example.pbapp.contactServiceImpl;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;

import com.example.pbapp.domain.Contact;
import com.example.pbapp.service.ContactService;

public class TestContactServiceImpl_UpdateOperation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class); // spring root config has data source bean
		
		ContactService contactService=ctx.getBean(ContactService.class);
		Contact contact  = new Contact();
		contact.setId(1);
		contact.setName("deeksha sethi");
		contact.setAddress("indore");
		contact.setEmail("d@s");
		contact.setRemark("favourite contact");
		contact.setUpdated_at(new Date());

		contactService.update(contact);
		System.out.println("success! contact updated");
	}
}
