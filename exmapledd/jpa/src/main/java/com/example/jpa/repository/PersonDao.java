package com.example.jpa.repository;

import com.example.jpa.entities.Person;

import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person,Long>{
  

}

