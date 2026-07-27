package extendsex.access1;

import extendsex.access.AAA;

public class CCC {
	
	public CCC()
	{
		AAA a = new AAA();
		
		a.field1 = 1;
		//a.field2 = 2; // default 접근 불가
		//a.field3 = 3; // private 접근 불가
	}
}
