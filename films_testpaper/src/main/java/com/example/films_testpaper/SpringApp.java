package com.example.films_testpaper;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class SpringApp {

	public static void main(String[] args) {
		Application.launch(FilmApp.class, args);
	}

}
