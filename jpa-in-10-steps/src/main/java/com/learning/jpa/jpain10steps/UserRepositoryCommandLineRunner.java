package com.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.jpain10steps.entity.User;
import com.learning.jpa.jpain10steps.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log =
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	  public void run(String... arg0)throws Exception {
		  User user =new User("Jill","Admin");
		  userRepository.save(user);
		  log.info("New User is created :"+ user);
		    
	  }
}
