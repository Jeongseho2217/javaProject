package encryption.sec05;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// 키 스트레칭 진행할 때마다 salt를 생성 -> 로그인 시 동일 절차 진행하기 위해 salt 저장 -> 저장 비용이 높아지게 됨
// 하나의 salt로 키 스트레칭 진행
public class MemberJoinKeySalt {
	
	private static final int SALT_SIZE=16;
	
	//Salt 값 생성
	public static String getSALT() throws Exception {
		SecureRandom rnd = new SecureRandom();
		byte[] temp = new byte[SALT_SIZE];
		rnd.nextBytes(temp);
		
		return bytesToHex(temp);
	}
	
	
	public static String sha256(String msg, String salt) throws Exception{
		msg = msg + salt;
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
			
			String salt = getSALT();
			for(int i=0; i<10; i++) { //키 스트레칭 및 암호화
				memPass = sha256(memPass, salt);
				System.out.println(memPass);
			}
			
			String sql = "insert into member values(?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memID);
			pstmt.setString(2, memPass); // 바인딩되는 패스워드 sha256+ 키스트레칭
			pstmt.setString(3, memName);
			pstmt.setString(4, memEmail);
			pstmt.setString(5, memJoinDate);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
