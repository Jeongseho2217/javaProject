package com.di.no_spring_di_constructor;

public class NameMain {

	public static void main(String[] args) {
		NameService serv = new NameService();
		NameController ctrl = new NameController(serv);
		ctrl.show("홍길동");
	}

}
