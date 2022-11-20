package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{

}
