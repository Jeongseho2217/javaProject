package exception.trycatch;

public class CatchOrderEx {
	public static void main(String[] args) {
		// catch부분이 여러번 있을 때 catch 순서에 따라 상위 클래스가
		// 먼저 나타나면 해당 catch 실행하고 나머지 catch는 점프
		// 상위 클래스 처리가 하위 클래스 처리 catch가 상위 클래스 처리 catch보다 먼저 나옴 반대일 경우 하위 클래스는 쓸모없어짐
		
		// 그래서 최상위 예외처리 클래스 Exception은 default처럼 가장 마지막에 두는게 좋음
		try {
			//String data1 = args[0];
			//String data2 = args[1];
			String data1 = "abc"; String data2 = "2";
			
			System.out.println(Integer.parseInt("a100")); // NumberFormatException
			System.out.println("args[0]:" + data1);
			System.out.println("args[1]:" + data2);
			
		} catch (ArrayIndexOutOfBoundsException e) { //예외처리 클래스중 최고봉
			System.out.println("실행 매개값 수 부족");
		} catch (Exception e) { // Exception 아래두면 어떤 예외던지 상위 클래스가 처리해버리므로 쓸모가 없어짐
			System.out.println("실행에 문제 발생");
		} finally {
			System.out.println("다시 실행");
		}
		
		// 위처럼 두개 이상의 exception을 처리하기 위해 catch를 여러번 구성하거나
		// 아래처럼 한개의 catch에 여러개의 exception 대입 가능 or로
		try {
			//String data1 = args[0];
			//String data2 = args[1];
			String data1 = "abc"; String data2 = "2";
			
			System.out.println(Integer.parseInt("a100")); // NumberFormatException
			System.out.println("args[0]:" + data1);
			System.out.println("args[1]:" + data2);
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("예외 발생");
		} catch (Exception e) { //예외처리 클래스중 최고봉
			System.out.println("실행에 문제 발생");
		} finally {
			System.out.println("다시 실행");
		}
	}
}
