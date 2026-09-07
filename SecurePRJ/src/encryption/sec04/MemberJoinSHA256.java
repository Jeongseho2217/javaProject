package encryption.sec04;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemberJoinSHA256 {
	
	public static String sha256(String msg) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes());
		md.digest();
		return bytesToHex(md.digest());
	}
	
	public static String bytesToHex(byte[] bytes) {
		StringBuilder builder = new StringBuilder();
		
		for(byte b : bytes) {
			builder.append(String.format("%02x", b));
		}
		
		return builder.toString();
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
			String memPass = sc.nextLine();
			System.out.print("이름 입력 : ");
			String memName = sc.nextLine();
			System.out.print("e-mail 입력 : ");
			String memEmail = sc.nextLine();
			
			LocalDate now = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			String memJoinDate = now.format(formatter);
			String sql = "insert into member values(?,?,?,?,?)";
		} catch(Exception e) {
			
		}

	}

}
