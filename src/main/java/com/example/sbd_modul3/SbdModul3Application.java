package com.example.sbd_modul3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
public class SbdModul3Application {

	public static void main(String[] args) {
		SpringApplication.run(SbdModul3Application.class, args);
	}

}
