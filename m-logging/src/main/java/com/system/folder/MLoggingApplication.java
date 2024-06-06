package com.system.folder;

import com.system.folder.ksqldb.KsqlDbClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MLoggingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MLoggingApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
