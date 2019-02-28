package com.example.pbapp.service;

import java.util.List;

import com.example.pbapp.domain.Contact;
import com.example.pbapp.exception.ContactAlreadyExistsException;

public interface ContactService {
	
	/**
	 * This method adds the contact
	 * @param contact to be saved
	 * @throws ContactAlreadyExistsException 
	 */
	public void save(Contact contact) throws ContactAlreadyExistsException;
	/**
	 * This method updates the contact
	 * @param contact to be updated
	 */
	public void update(Contact contact);
	/**
	 * This method deletes the Contact
	 * @param contactId of contact to be deleted
	 */
	public void delete(Integer contactId);
	/**
	 * This method deletes all those contacts records whose id is specified.
	 * @param contactIds to be deleted
	 */
	public void delete(Integer[] contactIds);
	/**
	 * This method returns all user contacts (User who is logged in)
	 * @param userId of logged in user
	 * @return List<Contact> contact list of loggedin user
	 */
	public List<Contact> findUserContact(Integer userId);
	/**
	 * This method returns all user contacts based on specified search criteria (User who is logged in)
	 * @param userId of logged in user
	 * @param txt search criteria
	 * @return
	 */
	public List<Contact> findUserContact(Integer userId,String txt);

}
