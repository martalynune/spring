package com.example.app;

import com.example.app.services.PaisesService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MyappApplication implements CommandLineRunner {


	PaisesService paisesService;
	public MyappApplication(PaisesService paisesService) {
		this.paisesService = paisesService;
	}

	public static void main (String[]args){
		SpringApplication.run(com.example.app.MyappApplication.class,args);

	}
	@Override
	public void run(String... args) throws Exception{
		paisesService.cargarPaisesDesdeFichero();
	}


}
