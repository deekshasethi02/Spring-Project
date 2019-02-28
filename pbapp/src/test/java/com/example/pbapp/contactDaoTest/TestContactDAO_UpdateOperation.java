package com.example.pbapp.contactDaoTest;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.domain.Contact;

public class TestContactDAO_UpdateOperation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class); // spring root config
																									// has data source
																									// bean
		ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
		Contact contact = new Contact();
		contact.setId(2);
		contact.setName("deeksha sethi");
		contact.setAddress("indore");
		contact.setEmail("d@s");
		contact.setRemark("favourite contact");
		contact.setUpdated_at(new Date());

		contactDAO.update(contact);
		System.out.println("success! contact updated");
	}
}
