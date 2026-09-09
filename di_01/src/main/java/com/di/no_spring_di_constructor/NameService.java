package com.di.no_spring_di_constructor;

public class NameService {
	public String showName(String name) {
		System.out.println("NameService showName()메소드");
		System.out.println("제 이름은 " + name + "입니다.");
		return name;
	}
}
