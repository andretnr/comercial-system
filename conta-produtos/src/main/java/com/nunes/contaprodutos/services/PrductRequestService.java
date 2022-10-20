package com.nunes.contaprodutos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nunes.contaprodutos.entities.Product;
import com.nunes.contaprodutos.entities.ProductRequest;
import com.nunes.contaprodutos.feignclients.ProductFeignClient;

@Service
public class PrductRequestService {
	
	
	@Autowired
	private ProductFeignClient productFeignClient;

	public ProductRequest getEstoqueTotalValue(Long productId,int requestedQuantity) {
		
		Product product = productFeignClient.findById(productId).getBody();
		return new ProductRequest(product.getName(), product.getDescription(), product.getQuantity(), requestedQuantity, product.getPrice().toString());
		
	}
}
