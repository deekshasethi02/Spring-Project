package com.example.pbapp.contactServiceImpl;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.exception.ContactAlreadyExistsException;
import com.example.pbapp.service.ContactService;

public class TestContactServiceImpl_SaveOperation {

	public static void main(String[] args) throws ContactAlreadyExistsException {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		ContactService contactService = ctx.getBean(ContactService.class);
		Contact contact = new Contact();
		contact.setUserId(10);
		contact.setName("deeksha");
		contact.setPhone("234");
		contact.setGroupName("family");
		contactService.save(contact);
		System.out.println("contact added!");
		
	}

}
