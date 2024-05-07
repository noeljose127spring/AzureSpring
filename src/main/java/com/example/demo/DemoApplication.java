package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private PersonRepo personRepo;
	@PostMapping("/addPerson")
	public Person addperson(@RequestBody Person person)
	{
		return personRepo.save(person);
	}

	@GetMapping("/getData")
	public List<Person> getPerson()
	{
		return personRepo.findAll();
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
