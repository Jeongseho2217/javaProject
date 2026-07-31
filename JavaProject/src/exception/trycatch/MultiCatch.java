package exception.trycatch;

public class MultiCatch {

	public static void main(String[] args) {
		// try - catch 블럭에서 여러개의 catch 블럭을 구성할 수 있음
		int[] arr = {1, 2, 3};
		
		try {
			
			System.out.println(arr[2]); // 예외 발생
			System.out.println(Integer.parseInt("a100")); // 예외 발생되면 아래 남아있는 try 문장 실행되지 않는다.
			System.out.println(arr[2]); // 오류 없는 코드 위에서 예외 나면 건너뛰어짐
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
			
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
			
		} finally {
			System.out.println("다시 실행");
		}
	}

}
