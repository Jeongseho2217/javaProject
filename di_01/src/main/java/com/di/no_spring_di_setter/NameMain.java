package com.di.no_spring_di_setter;

public class NameMain {

	public static void main(String[] args) {
		NameService serv = new NameService();
		NameController ctrl = new NameController();
		ctrl.setNameService(serv);
		ctrl.show("홍길동");
	}

}
