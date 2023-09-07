package com.ejercicios.ejercicio4;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.ejercicios.ejercicio1.JdscFeGcSpringRestEr082023Application;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JdscFeGcSpringRestEr082023Application.class);
	}

}