package exam.constructor_ex1;

public class CarAutomobile {

	public static void main(String[] args) {
		
		Automobile Am = new Automobile("01가 1234", "아반떼", "현대", 2022, "자동");
		
		System.out.println("차량 번호 : " + Am.carNo);
		System.out.println("차종 : " + Am.carName);
		System.out.println("제조사 : " + Am.carMaker);
		System.out.println("연식 : " + Am.carYear);
		System.out.println("기어변속 : " + Am.autoManual);
	}

}
