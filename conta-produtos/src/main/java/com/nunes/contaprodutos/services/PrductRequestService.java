package com.nunes.contaprodutos.services;

import org.springframework.stereotype.Service;

import com.nunes.contaprodutos.entities.ProductRequest;

@Service
public class PrductRequestService {

	public ProductRequest getEstoqueTotalValue(Long productId,int requestedQuantity) {
		return new ProductRequest("Lápis", "preto", 10, requestedQuantity, "0.5");
		
	}
}
