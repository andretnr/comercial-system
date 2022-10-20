package com.nunes.contaprodutos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ContaProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContaProdutosApplication.class, args);
	}

}
