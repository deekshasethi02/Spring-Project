package com.example.pbapp.contactServiceImpl;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.domain.User;
import com.example.pbapp.service.ContactService;

public class TestContactService_DeleteOperationById {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		ContactService contactService=ctx.getBean(ContactService.class);
		contactService.delete(1);
		System.out.println("success! contact deleted");
	}
}
