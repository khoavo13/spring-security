package com.likelion.springsecurity;

import com.likelion.springsecurity.entity.User;
import com.likelion.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringsecurityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityApplication.class, args);
	}
	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception{
		User user = new User();
		user.setUsername("khoa");
		user.setPassword(passwordEncoder.encode("123"));
		userRepository.save(user);
		System.out.println(user);
	}
}
