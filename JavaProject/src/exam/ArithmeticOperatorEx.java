package exam;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ArithmeticOperatorEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor; int eng; int math;
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("국어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("국어 점수 입력 : ");
		math = sc.nextInt();
		
		int total = kor + eng + math;
		double average = total / 3.0;
		
		//소수점 이하 자리수 조절
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("==========");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + df.format(average));
		
		sc.close();
	}
}
