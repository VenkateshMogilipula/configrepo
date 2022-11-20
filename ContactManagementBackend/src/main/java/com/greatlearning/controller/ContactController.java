package com.greatlearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Contact;
import com.greatlearning.service.ContactService;

@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins="*")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/getcontacts")
	public List<Contact> getAllContacts(){
		return contactService.getAllContacts();
	}
	
	@PostMapping("/addcontact")
	public List<Contact> addContact(@RequestBody Contact contact){
		contactService.addContact(contact);
		return contactService.getAllContacts();
	}
	
//	@GetMapping("/{id}")
//	public Optional<Contact> getById(@PathVariable("id") long id) {
//		return contactService.getContactById(id);
//	}
	
	@GetMapping("/getcontact")
	public Optional<Contact> getById(@RequestParam(name="id") long id) {
		return contactService.getContactById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Contact> deleteContact(@PathVariable("id")long id) {
		contactService.deleteContact(id);
		return contactService.getAllContacts();
	}
	
	@PutMapping("/updatecontact/{id}")
	public Contact update(@RequestBody Contact contact,@PathVariable("id") long id) {
		contact.setId(id);
		return contactService.addContact(contact);
	}
}
