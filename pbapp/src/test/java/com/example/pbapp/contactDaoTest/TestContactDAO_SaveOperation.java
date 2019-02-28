package com.example.pbapp.contactDaoTest;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.Contact;

public class TestContactDAO_SaveOperation {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		ContactDAO contactDAO =ctx.getBean(ContactDAO.class);
		Contact contact = new Contact();
		contact.setUserId(5);
		contact.setName("deeskha");
		contact.setPhone("2345645");
		contact.setGroupName("family");
		
		
		
		contactDAO.save(contact);
		System.out.println("success! data inserted");
	}
}
