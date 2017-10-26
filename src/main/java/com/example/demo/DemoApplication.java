package com.example.demo;

import com.example.demo.Service.AtletaService;
import com.example.demo.Service.MedallaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DemoApplication.class, args);

		AtletaService atletaService =context.getBean(AtletaService.class);

		MedallaService medallaService =context.getBean(MedallaService.class);

		atletaService.testAtleta();
		medallaService.testMedalla();
	}

}
