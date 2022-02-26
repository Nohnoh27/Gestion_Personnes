package com.GesPersonnes.Main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@EnableAutoConfiguration
@EntityScan("com.GesPersonnes.Entities")
@EnableJpaRepositories("com.GesPersonnes.Repository")
@ComponentScan("com.GesPersonnes.Metier")
@ComponentScan("com.GesPersonnes.MetierImplementation")
@ComponentScan("com.GesPersonnes.Controller")

public class GesPersonnes2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GesPersonnes2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
