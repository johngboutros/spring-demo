package com.johngboutros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		((AbstractApplicationContext) context).registerShutdownHook();

		// HELLO WORLD!
		System.out.println();
		System.out.println("====== HELLO WORLD! ======");
		HelloWorld healloWorld = (HelloWorld) context.getBean("helloWorld");
		healloWorld.getMessage();
		
		// SINGLETON BEAN
		System.out.println();
		System.out.println("====== BEAN SCOPES: SINGLETON BEAN ======");
		SingletonBean singletonBeanA = (SingletonBean) context.getBean("singletonBean");
		singletonBeanA.setMessage("I'm object A");
		singletonBeanA.getMessage();
		SingletonBean singletonBeanB = (SingletonBean) context.getBean("singletonBean");
		singletonBeanB.getMessage();
		
		// PROTOTYPE BEAN
		System.out.println();
		System.out.println("====== BEAN SCOPES: PROTOTYPE BEAN ======");
		PrototypeBean prototypeBeanA = (PrototypeBean) context.getBean("prototypeBean");
		prototypeBeanA.setMessage("I'm object A");
		prototypeBeanA.getMessage();
		PrototypeBean prototypeBeanB = (PrototypeBean) context.getBean("prototypeBean");
		prototypeBeanB.getMessage();
		
		// InitializingBean, DisposableBean
		System.out.println();
		System.out.println("====== BEAN LIFECYCLE: Implementing InitializingBean, DisposableBean ======");
		InitializingBeanExample initializingBean = (InitializingBeanExample) context.getBean("initializingBeanExample");
		initializingBean.setMessage("initializingBean");
		initializingBean.getMessage();
		
		// InitByXmlBeanExample
		System.out.println();
		System.out.println("====== BEAN LIFECYCLE: Init & Destroy By Xml ======");
		InitByXmlBeanExample initByXmlBean = (InitByXmlBeanExample) context.getBean("initByXmlBeanExample");
		initByXmlBean.setMessage("initByXmlBean");
		initByXmlBean.getMessage();
		
		
		System.out.println();
		System.out.println("====== END MAIN ======");
		
		

	}
}
