package com.example.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa.entities.Person;
import com.example.jpa.repository.PersonDao;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	private PersonDao  personDao; 

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		List<Person> pesons = (List<Person>) personDao.findAll();
		pesons.stream().forEach(person -> System.out.println( person ) );
		
	}



}
