package classInfo;

public class Constructor {
	int x;
	int y;
	
//	public Constructor() { } // 자동으로 이걸 포함
//	객체 생성 시 new Constructor(); 이용
	
} // 생성자가 없음 >> 컴파일러가 기본 생성자(매개 변수가 없음)를 포함 시켜줌

class Constructor1 {
	int x;
	int y;
	
	// 객체 생성 시 new Constructor1(); 이용
	public Constructor1() { // 매개변수가 없는 명시적 생성자. 이미 개발자가 만든 생성자가 있으므로 컴파일러는 생성자를 포함하지 않음
		x=100;
		y=200;
	} // 생성자가 있으므로 이 생성자를 이용
}
class Constructor2 {
	int x;
	int y;
	
	// 객체 생성 시 new Constructor2(a, b); 이용 / new Constructor2() - 사용 불가
	public Constructor2(int a, int b) { // 매개변수가 있는 명시적 생성자. 이 역시 개발자가 만든 생성자가 있으므로 컴파일러는 생성자를 포함하지 않음
		x=a;
		y=b;
	} // 생성자가 있으므로 이 생성자를 이용
}

class Constructor3 {
	int x;
	int y;
	
	// 객체 생성 시 new Constructor3(a, b); new Constructor3(); - 둘다 사용 가능
	public Constructor3() { // 오버 로딩
		x=10;
		y=20;
	}
	public Constructor3(int a, int b) { // 매개변수가 있는 명시적 생성자. 이 역시 개발자가 만든 생성자가 있으므로 컴파일러는 생성자를 포함하지 않음
		x=a;
		y=b;
	} // 생성자가 있으므로 이 생성자를 이용
}
