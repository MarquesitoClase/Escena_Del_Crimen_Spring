package com.pryect1.EscenaDelCrimen;

import com.pryect1.EscenaDelCrimen.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EscenaDelCrimenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscenaDelCrimenApplication.class, args);
	}


	@Bean
	public CommandLineRunner innitData(MovieRepository mR){
		mR.add
	}
}
