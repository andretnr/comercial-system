package com.nunes.listaprodutos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ListaProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaProdutosApplication.class, args);
	}

}
