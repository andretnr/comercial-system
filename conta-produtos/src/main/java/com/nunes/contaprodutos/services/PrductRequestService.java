package com.nunes.contaprodutos.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nunes.contaprodutos.entities.Product;
import com.nunes.contaprodutos.entities.ProductRequest;

@Service
public class PrductRequestService {
	
	@Value("${lista-produtos.host}")
	private String pdHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public ProductRequest getEstoqueTotalValue(Long productId,int requestedQuantity) {
		
		Map<String, String> uri = new HashMap();
		uri.put("id", String.valueOf(productId));
		Product product = restTemplate.getForObject(pdHost + "/products/{id}", Product.class, uri);
		
		return new ProductRequest(product.getName(), product.getDescription(), product.getQuantity(), requestedQuantity, product.getPrice().toString());
		
	}
}
