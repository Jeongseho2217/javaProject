package exception.throwex;

public class AccountEx {

	public static void main(String[] args) {
		// 사용자 정의 예외를 포함하는 메소드 호출 예시
		Account account = new Account();
		
		//예금
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		//출금
		try {
			account.withdraw(30000);
		}
		catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			// 개발 도중 예외가 발생 시 예외 추적 하려면 printStackTrace()를 이용함
			System.out.println("예외 추적 내용 출력"); // 어디서 예외가 찍히는지 확인 가능
			e.printStackTrace();
		}
	}
}
