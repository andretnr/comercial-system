package com.nunes.contaprodutos.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nunes.contaprodutos.entities.Product;

@Component
@FeignClient(name = "lista-produtos", url = "localhost:8080", path = "/products")
public interface ProductFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Product> findById(@PathVariable Long id);
}
