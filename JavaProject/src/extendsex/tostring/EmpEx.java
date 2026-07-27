package extendsex.tostring;

public class EmpEx {
	public static void main(String[] args) {
		Employee emp1 = new Employee("1234", "홍길동", "마케팅");
		Employee emp2 = new Employee("2345", "이몽룡", "영업부");
		
		//객체 참조 변수 값 출력 - toString 자동 출력
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp1.toString());
		
		// Employee를 상속받은 Manager 클래스 객체 인스턴스 생성
		Manager mg = new Manager("1234", "홍길동", "마케팅", "대리");
		
		System.out.println(mg); // toString 자동 호출
	}
}
