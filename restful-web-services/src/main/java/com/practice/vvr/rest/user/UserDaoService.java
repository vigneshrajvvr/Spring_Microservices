package com.practice.vvr.rest.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Adam", LocalDate.now().minusYears(25)));
		users.add(new User(3, "Adam", LocalDate.now().minusYears(20)));
	}
	
	public List<User> findAll() {
		return users;
	}

}
