package encryption.sec01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemberJoin {
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
