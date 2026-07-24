package exam;

public class Reservation {

	String airName;
	String rName;
	String startLoc;
	String endLoc;
	int price;
	String seatNum;
	
	public Reservation(String aN, String rN, String sL, String eL, int p, String sN) {
		
		this.airName = aN;
		this.rName = rN;
		this.startLoc = sL;
		this.endLoc = eL;
		this.price = p;
		this.seatNum = sN;
		
	}
	
	void showRsvInfo() {
		System.out.println("**항공권 예약 정보**");
		System.out.println("항공기 : " + airName);
		System.out.println("예약자 : " + rName);
		System.out.println("출발지 : " + startLoc);
		System.out.println("도착지 : " + endLoc);
		System.out.println("금액 : " + price);
		System.out.println("좌석번호 : " + seatNum);
	}
}
