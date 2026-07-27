package extendsex.access1;

public class DDD extends extendsex.access.AAA{
	public DDD() {
		field1 = 10; // public
		// field2 = 10; // default // 2, 3은 패키지가 다르므로 다 컷
		// field3 = 10; // private
		field4 = 10; // protected // 패키지가 달라도 상속을 받으면 접근 가능
	}
}
