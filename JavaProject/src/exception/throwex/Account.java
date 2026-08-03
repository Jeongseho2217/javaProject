package exception.throwex;
// 예외가 발생 할 수 있는 메소드 포함
public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금 시 예외 발생할 수 있으므로(출금액이 더 많을때) 사용자 정의 예외
	// 떠넘기기
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			// 명시적 예외 발생 시킴 : 예외에 해당하는 클래스 인스턴스 생성하면서 생성자 호출 throw
			throw new BalanceInsufficientException("잔고 부족 : " + (money-balance) + "원 모자람");
		} // 예외를 발생시킬 경우
		balance -= money; 
	}
}
