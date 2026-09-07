package encryption.sec02;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemberJoinMD5 {
	public static String md5(String message) {
		String encData = "";
		try {
		// getInstance("암호화 알고리즘") 해당 알고리즘 반환
		MessageDigest md = MessageDigest.getInstance("MD5");
		//알고리즘 활용 해시값을 반환받으려면 문자열이 아닌 byte타입의 배열로 전달을 해야 함
		byte[] bytes = message.getBytes();
		md.update(bytes); //md4 인스턴스에 해시로 변환할 byte 배열이 전달됨
		byte[] digest = md.digest(); //뱐환된 해시값이 byte 배열에 저장되어 있음 -> 비밀번호는 문자열이어야 하므로 문자열로 변환
		for(int i=0; i<digest.length; i++) {
			encData += Integer.toHexString(digest[i] & 0xff); //16진수 변환 후 문자열로 변환 표현되는 비밀번호 범위 0-f까지 
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return encData;
	}
	
	//취약한 패스워드 저장 1 : plain text 그대로 저장
	public static void main(String[] args) {
		DBConnect dbCon = new DBConnect();
		Connection con = dbCon.getConnection();
		
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("ID 입력 : ");
			String memID = sc.nextLine();
			System.out.print("비밀번호 입력 : ");
			String memPass = md5(sc.nextLine());
			System.out.print("이름 입력 : ");
			String memName = sc.nextLine();
			System.out.print("e-mail 입력 : ");
			String memEmail = sc.nextLine();
			
			LocalDate now = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			String memJoinDate = now.format(formatter);
			String sql = "insert into member values(?,?,?,?,?)";
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
