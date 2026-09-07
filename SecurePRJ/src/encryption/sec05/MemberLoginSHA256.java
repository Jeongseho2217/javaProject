package encryption.sec05;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemberLoginSHA256 {
// 로그인 시 salt값은 DB에 저장되어 있는 상태
// 회원정보와 동일 테이블에 저장되어 있으면 취약한 정보 저장
// 로그인 시엔 해시 기능 메소드만 필요 (개발자는 스트래칭 수 알고 있음)
	public static String sha256(String password, String salt) throws Exception { // 스트레칭도 동시 실행되도록 구성
		// 비밀번호 해싱
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		for (int i=0; i<10; i++) {
			password = password + salt;
			md.update(password.getBytes());
			password = bytesToHex(md.digest()); // byte형 배열 반환 -> 문자열로 변환 후 반복 재사용
		}
		return password;
	}
	// byte 형 배열 문자열로 변경 결합 (16진수로 변경 후 결합) -> 16진수로 변경하는 이유는 표현되는
	public static String bytesToHex(byte[] bytes) {
		StringBuilder builder = new StringBuilder();
		
		for(byte b : bytes) {
			builder.append(String.format("%02x", b));
		}
		
		return builder.toString();
	}
	
	public static void main(String[] args) {
		// 비밀번호 해싱

		DBConnect dbCon = new DBConnect();
		Connection con = dbCon.getConnection();
		PreparedStatement pstmt = null;
		
		ResultSet rs = null; 
		
		Scanner sc = new Scanner(System.in);
		String dbPwd = null;
		String dbSalt = null;
		
		
		try {
			System.out.print("ID 입력 : ");
			String memID = sc.nextLine();
			System.out.print("비밀번호 입력 : ");
			String memPass = sc.nextLine();
			
			// 회원 아이디는 기본키로 설정되어 유일
			// 패스워드와의 매칭은 salt가 필요
			// id에 매칭되는 회원 정보를 select 한 후 salt 값을 활용 비밀번호 해시값을 계산한 후 db 비밀번호와 매칭 테스트
			
			String sql = "select * from where memID = '" + memID + "'";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//회원가입시 중복 아이디는 허용하지 않음
			// 위 쿼리의 결과는 레코드가 1개거나 아니면 없거나
			if(rs.next()) { 
				dbPwd = rs.getString(2);
				dbSalt = rs.getString(6);
				String hasPass = sha256(memPass, dbSalt);
				if(dbPwd.equals(hasPass)) System.out.println("로그인 성공");
				else System.out.println("로그인 실패(비번 틀림)");
			}
			else System.out.println("로그인 실패(id 없음)");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
