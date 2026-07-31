package exception.classcast;

public class ClassCastExcept {

	public static void main(String[] args) {
		// 상속 관계에 있는 두 클래스
		Child child = new Child();
		Child2 child2;
		
		Parent parent;
		
		parent = child;
		
		//Parent 클래스를 Child 클래스와 Child2클래스가 상속
		child2 = (Child2)parent; //ClassCastException: class exception.classcast.Child cannot be cast to class exception.classcast.Child2
		// 강제 형변환 불가
	}
}
