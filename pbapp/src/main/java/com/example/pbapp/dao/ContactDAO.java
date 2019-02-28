package com.example.pbapp.dao;

import java.util.List;

import com.example.pbapp.domain.Contact;

/**
 * This ContactDAO is used to perform CRUD operations related to contact
 * @author deeksha.sethi
 *
 */

public interface ContactDAO {
	
	public void save(Contact contact);

	public void update(Contact contact);

	public void delete(Integer contactId);

	public void delete(Contact contact);

	public Contact findById(Integer contactId);

	public List<Contact> findAll();

	public List<Contact> findByProperty(String propertyName, Object propertyValue);

}
