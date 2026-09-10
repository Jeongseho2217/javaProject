package com.spring_aop.xml2;

public class Circle {
	private static double PI = 3.14;
	private int halfLength;
	public int getHalfLength() {
		return halfLength;
	}
	public void setWidth(int halfLength) {
		this.halfLength = halfLength;
	}
	
	public void showResult() {
		System.out.println("원의 면적 : " + (halfLength ^ 2) * PI);
		System.out.println("원의 둘레 : " + ((2 * halfLength) * PI));
	}
}
