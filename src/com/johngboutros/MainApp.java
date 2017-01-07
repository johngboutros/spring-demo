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
		
		// BEAN SCOPES: SINGLETON BEAN
		System.out.println();
		System.out.println("====== BEAN SCOPES: SINGLETON BEAN ======");
		SingletonBean singletonBeanA = (SingletonBean) context.getBean("singletonBean");
		singletonBeanA.setMessage("I'm object A");
		singletonBeanA.getMessage();
		SingletonBean singletonBeanB = (SingletonBean) context.getBean("singletonBean");
		singletonBeanB.getMessage();
		
		// BEAN SCOPES: PROTOTYPE BEAN
		System.out.println();
		System.out.println("====== BEAN SCOPES: PROTOTYPE BEAN ======");
		PrototypeBean prototypeBeanA = (PrototypeBean) context.getBean("prototypeBean");
		prototypeBeanA.setMessage("I'm object A");
		prototypeBeanA.getMessage();
		PrototypeBean prototypeBeanB = (PrototypeBean) context.getBean("prototypeBean");
		prototypeBeanB.getMessage();
		
		// BEAN LIFECYCLE: Implementing InitializingBean, DisposableBean
		System.out.println();
		System.out.println("====== BEAN LIFECYCLE: Implementing InitializingBean, DisposableBean ======");
		InitializingBeanExample initializingBean = (InitializingBeanExample) context.getBean("initializingBeanExample");
		initializingBean.setMessage("initializingBean");
		initializingBean.getMessage();
		
		// BEAN LIFECYCLE: Init & Destroy By Xml
		System.out.println();
		System.out.println("====== BEAN LIFECYCLE: Init & Destroy By Xml ======");
		InitByXmlBeanExample initByXmlBean = (InitByXmlBeanExample) context.getBean("initByXmlBeanExample");
		initByXmlBean.setMessage("initByXmlBean");
		initByXmlBean.getMessage();

		// Bean Definition Inheritance
		System.out.println();
		System.out.println("====== Bean Definition Inheritance ======");
		HelloWorldParent helloWorldParent = (HelloWorldParent) context.getBean("helloWorldParent");
		helloWorldParent.getMessage1();
		helloWorldParent.getMessage2();
		HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
		helloIndia.getMessage1();
		helloIndia.getMessage2();
		helloIndia.getMessage3();
		
		// Spring Dependency Injection
		System.out.println();
		System.out.println("====== Spring Dependency Injection ======");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
		te.print();
		te.formatFont();

		System.out.println();
		System.out.println("====== END MAIN ======");
	}
}
