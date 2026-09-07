package encryption.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemberLogin {

	public static void main(String[] args) {
		DBConnect dbCon = new DBConnect();
		Connection con = dbCon.getConnection();
		PreparedStatement pstmt = null;
		
		ResultSet rs = null; 
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("ID 입력 : ");
			String memID = sc.nextLine();
			System.out.print("비밀번호 입력 : ");
			String memPass = MemberJoinMD5.md5(sc.nextLine());
			System.out.println(memPass);
			// 사용자가 입력한 비밀번호를 md5 함수를 통해 해시값으로 변경 후 쿼리에 활용되도록 수정
			String sql = "select * from where memID = '" + memID + "'" + "and memPWD = '" + memPass +"'";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//회원가입을 진행할 때 해시알고리즘으로 비밀번호를 암호화 했음
			// 로글인 진행시에는 로그인시 입력된 비밀번호를 회원가입 시 사용했던 동일한 알고리즘으로 해시값을 구성해서 
			// 저장된 비밀번호와 매칭해야 댐
			if(rs.next()) System.out.println("로그인 되었습니다."); //웹에서는 로그인 자격증명(세션)을 구성하고 쿠키를 통해 자격증명을 클라에게 전달(세션id)
			else System.out.println("로그인 실패");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
