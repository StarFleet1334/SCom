package com.system.folder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class MAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MAuthenticationApplication.class, args);
	}

}
