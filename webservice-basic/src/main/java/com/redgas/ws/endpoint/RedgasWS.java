package com.redgas.ws.endpoint;

import java.util.List;

import com.redgas.ws.model.Product;


public interface RedgasWS {

	
	public List<Product> listProducts() throws RedGasException;
		
	public void addProduct(Product product);
	
	public void removeProducts(long id);
		
	
	
}
