package com.di.no_spring_no_di;

public class NameMain {

	public static void main(String[] args) {
		NameService serv = new NameService();
		serv.showName("");
		NameController ctrl = new NameController();
		ctrl.show("홍길동");
	}

}
