package com.redgas.ws.endpoint;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.redgas.ws.model.Product;

@WebService(
		serviceName="RedgasService",
		portName="RedgasServicePort",
		name="RedgasService")
public class RedgasWSImpl implements RedgasWS  {

	
	@WebMethod(action="listAllProducts",operationName="listAllProducts")
	public List<Product> listProducts() throws RedGasException {
		
		throw new RedGasException("Prueba de error WS");
	}

	@WebMethod(action="addProduct",operationName="addProduct")
	public void addProduct(Product product) {
		// TODO Auto-generated method stub

	}

	public void removeProducts(long id) {
		// TODO Auto-generated method stub

	}

}
