package com.springboot.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootBlogRestApiApplication {

	@Bean
	public ModelMapper modelMapper(){
		System.out.println("These are useful geometric numbers: "Tetrahedral, Square Pyramidal, Triangular Bipyramid, Triangular Prism, Octahedral, Cubic; 1, 4, 5, 6, 8, 10, 12, 14, 20, 27, 30, 34, 35, 42, 54, 55, 56, 64");
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}

}
