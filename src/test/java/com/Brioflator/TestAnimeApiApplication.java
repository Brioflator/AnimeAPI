package com.Brioflator;

import org.springframework.boot.SpringApplication;

public class TestAnimeApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(AnimeApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
