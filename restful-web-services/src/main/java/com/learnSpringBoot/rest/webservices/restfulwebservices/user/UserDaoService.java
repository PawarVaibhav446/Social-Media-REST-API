package com.learnSpringBoot.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(80, "Vaibhav", LocalDate.now().minusYears(21)));
		users.add(new User(82, "Surya", LocalDate.now().minusYears(31)));
		users.add(new User(92, "Sajeev", LocalDate.now().minusYears(41)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	
}
