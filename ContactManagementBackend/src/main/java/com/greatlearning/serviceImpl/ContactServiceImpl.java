package com.greatlearning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Contact;
import com.greatlearning.repository.ContactRepository;
import com.greatlearning.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	
	@Autowired
	private ContactRepository contactRepo;
	
	public List<Contact> getAllContacts() {
		return contactRepo.findAll();
	}

	
	public Contact addContact(Contact contact) {
		return contactRepo.save(contact);
	}


	@Override
	public Optional<Contact> getContactById(long id) {
		// TODO Auto-generated method stub
		return contactRepo.findById(id);
	}


	@Override
	public void deleteContact(long id) {
		// TODO Auto-generated method stub
//		Optional<Contact> check=contactRepo.findById(id);
		
			contactRepo.deleteById(id);
//			System.out.println("Contact with id "+id+" deleted successfully.");
	}


	@Override
	public Contact updateContact(Contact contact, long id) {
		// TODO Auto-generated method stub
		return contactRepo.save(contact);
	}

	
	
}
