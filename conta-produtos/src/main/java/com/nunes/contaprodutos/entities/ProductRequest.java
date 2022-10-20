package com.nunes.contaprodutos.entities;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;



public class ProductRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String description;
	private int quantity;
	private int requestedQuantity;
	private String unityPrice;
	
	
	public ProductRequest() {
	}


	public ProductRequest(String name, String description, int quantity, int requestedQuantity, String unityPrice) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.requestedQuantity = requestedQuantity;
		this.unityPrice = unityPrice;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setRequestedQuantity(int requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}
	
	public int getRequestedQuantity() {
		return requestedQuantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getUnityPrice() {
		Double priceNum = Double.parseDouble(unityPrice);		
		return currencyConvert(priceNum);
	}


	public void setPrice(String unityPrice) {
		this.unityPrice = unityPrice;
	}
	
	public String getTotalValue() {
		Double vTotal = requestedQuantity * Double.parseDouble(unityPrice);
		return currencyConvert(vTotal);
	}
	
	public String currencyConvert(double value) {
		Locale localeBR = new Locale( "pt", "BR" );  
		NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);
		return dinheiroBR.format(value);
	}
}
