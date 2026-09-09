package com.di.spring_di_xml.setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context2.xml");
		
		NameController controller = context.getBean("nameController", NameController.class);
		// NameController bean은 setter 통해 객체 주입이 진행됨 -> setter 호출은 context(컨테이너)가 진행
		controller.show("이몽룡");
		context.close();
	}
}