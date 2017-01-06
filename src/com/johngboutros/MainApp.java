package com.johngboutros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		// HELLO WORLD!
		System.out.println();
		System.out.println("====== HELLO WORLD! ======");
		HelloWorld healloWorld = (HelloWorld) context.getBean("helloWorld");
		healloWorld.getMessage();
		
		// SINGLETON BEAN
		System.out.println();
		System.out.println("====== SINGLETON BEAN ======");
		SingletonBean singletonBeanA = (SingletonBean) context.getBean("singletonBean");
		singletonBeanA.setMessage("I'm object A");
		singletonBeanA.getMessage();
		SingletonBean singletonBeanB = (SingletonBean) context.getBean("singletonBean");
		singletonBeanB.getMessage();
		
		// PROTOTYPE BEAN
		System.out.println();
		System.out.println("====== PROTOTYPE BEAN ======");
		PrototypeBean prototypeBeanA = (PrototypeBean) context.getBean("prototypeBean");
		prototypeBeanA.setMessage("I'm object A");
		prototypeBeanA.getMessage();
		PrototypeBean prototypeBeanB = (PrototypeBean) context.getBean("prototypeBean");
		prototypeBeanB.getMessage();
	}
}
