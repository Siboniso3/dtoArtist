package com.DTO_artist.dtoArtist;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping
@RestController
public class DtoArtistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtoArtistApplication.class, args);
	}
	@GetMapping("/")
	public String hello(){
		return "Hello world";
	}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
