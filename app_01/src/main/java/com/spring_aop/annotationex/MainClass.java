package com.spring_aop.annotationex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring_aop.xml2.Circle;
import com.spring_aop.xml2.Evaluation;

public class MainClass {
	public static void main(String[] args) {
		// 스프링 컨테이너(context) 객체 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config2-2.xml");
		
		// 핵심 기능1
		Circle circle = context.getBean("circle", Circle.class);
		circle.showResult();
		
		// 핵심 기능2
		Evaluation eva = context.getBean("evaluation", Evaluation.class);
		eva.showResult();
		
		context.close();
	}
}
