package com.nunes.contaprodutos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nunes.contaprodutos.entities.ProductRequest;
import com.nunes.contaprodutos.services.PrductRequestService;

@RestController
@RequestMapping(value = "/productrequest")
public class ProductRequestResource {
	
	@Autowired
	private PrductRequestService service;
	
	@GetMapping(value = "/{productId}/need/{requestedQuantity}")
	public ResponseEntity<ProductRequest> getTotalValue(@PathVariable Long productId, @PathVariable Integer requestedQuantity){
		ProductRequest product = service.getEstoqueTotalValue(productId, requestedQuantity);
		return ResponseEntity.ok(product);	
	}
}
