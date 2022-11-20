package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.entity.Contact;


public interface ContactService {

	public List<Contact> getAllContacts();
	public Contact addContact(Contact contact);
	Optional<Contact> getContactById(long id);
	public Contact updateContact(Contact contact,long id);
	void deleteContact(long id);
}
