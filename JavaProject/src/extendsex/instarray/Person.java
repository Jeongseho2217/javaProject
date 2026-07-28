package extendsex.instarray;

import java.util.Scanner;

public class Person {
	static Scanner s = new Scanner(System.in);
	
	String name;
	int age, height, weight;
	
	public void input() {
		System.out.print("성명 입력 : ");
		name = s.next();
		System.out.print("나이 입력 : ");
		age = s.nextInt();
		System.out.print("키 입력(cm) : ");
		weight = s.nextInt();
		System.out.print("몸무게(kg) 입력 : ");
		height = s.nextInt();
	}
	
	public void output() {
		System.out.print(name + " ");
		System.out.print(age + "살 ");
		System.out.print(height + "cm ");
		System.out.print(weight + "kg");
		System.out.println();
	}
}
