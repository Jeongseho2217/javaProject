package extendsex.override;

public class Computer2 extends Calculator{
	// 개발자의 실수로 오타가 남 : 메서드 이름이 달라짐
	// 부모 클래스 areaCircle(), 자식 클래스 areaCircel() 두개가 생성됨
	// 이를 방지하기 위해 @Override가 필요 (에러를 출력해줌, 개발자의 실수를 줄일 수 있음)
	@Override
	double areaCircel(double r) {
		System.out.println("Computer2 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
