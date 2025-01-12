package com.nareshit.spring.notification.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/emailService")
public class EmailServiceApplication {

	@GetMapping("/send")
	public String sendEmail() {
		return "Email service called....Sending Emaill to Customer";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
