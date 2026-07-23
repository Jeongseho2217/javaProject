package ref;

public class EnumMethodEx {

	public static void main(String[] args) {
		// 열거 객체 메소드 확인
		Week today = Week.SUNDAY;
		String name = today.name(); //열거 객체가 저장하고 있는 문자열 리턴
		System.out.println(name);
		
		int ord = today.ordinal(); // 에넘의 인덱스를 반환
		System.out.println(ord);
		
		//compareTo() : 애넘의 매개값과 비교
		//반환값이 음수 : 순번이 빠름 / 양수 : 순번이 느림
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		System.out.println(day1.compareTo(day2)); // Day1이 -2 두칸 빠르단 거임
		System.out.println(day2.compareTo(day1)); // Day2가 2 두칸 느리다는 거임
		
		Week weekDay = Week.valueOf("SUNDAY"); // 매개값과 동일한 문자열을 가지는 열거 객체를 리턴
		weekDay = Week.valueOf("SUNDAY1"); // 열거 객체를 못 찾으면 에러뜸
		System.out.println(weekDay);
	}

}
