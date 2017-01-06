package com.johngboutros;


public class InitByXmlBeanExample {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void destroy()  {
		System.out.println("Your Message : " + message + " [destroy() called!]");
	}

	public void init() {
		System.out.println("Your Message : " + message + " [init() called!]");		
	}
}
