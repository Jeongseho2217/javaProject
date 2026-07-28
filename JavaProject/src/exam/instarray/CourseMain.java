package exam.instarray;

public class CourseMain {
	public static void main(String[] args) {
		Course[] c = new Course[3]; //래퍼런스 배열
		
		System.out.println("****과목 정보 입력****");
		for(int i=0; i < c.length; i++) {
			c[i] = new Course(); //객체를 생성 후 배열 원소가 참조
			c[i].input();
		}
		System.out.println("\n****과목 정보 출력****");
		for(int i=0; i < c.length; i++) {
			c[i].output();
		}
	}
}
