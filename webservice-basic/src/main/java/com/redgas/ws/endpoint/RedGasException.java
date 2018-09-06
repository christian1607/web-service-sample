package com.redgas.ws.endpoint;

public class RedGasException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String mensaje;

	
	
	

	public RedGasException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}





	public String getMensaje() {
		return mensaje;
	}



	
	
	
	
}
