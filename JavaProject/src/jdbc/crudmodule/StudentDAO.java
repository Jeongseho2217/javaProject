package jdbc.crudmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

//DBMS와 통신
public class StudentDAO implements IStudentDAO{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StudentDTO std = null;
	ArrayList<StudentDTO> stdList = null;
	
	//생성자에서 DB연결
	public StudentDAO() {
		con = DBConn.getConnection();
	}
	
	@Override
	public void insertStudent(StudentDTO dto) { // dto안에 저장될 학생 정보가 들어옴
		try {
			String sql = "insert into student values(?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getStdNo());
			pstmt.setString(2, dto.getStdName());
			pstmt.setInt(3, dto.getStdYear());
			pstmt.setString(4, dto.getStdAddress());
			pstmt.setDate(5, new java.sql.Date(dto.getStdBirth().getTime()));
			pstmt.setString(6, dto.getDptNo());
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) System.out.println("학생 등록 성공!");
			else System.out.println("학생 등록 실패..");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt);
		}
	}

	@Override
	public ArrayList<StudentDTO> getAllStudent() {
		stdList = new ArrayList<StudentDTO>();
		try {
			String sql = "select * from STUDENT order by stdNo";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String stdNo = rs.getString(1);
				String stdName = rs.getString(2);
				int stdYear = rs.getInt(3);
				String stdAddress = rs.getString(4);
				Date stdBirth = rs.getDate(5);
				String dptNo = rs.getString(6);
				
				std = new StudentDTO(stdNo, stdName, stdYear, stdAddress, stdBirth, dptNo);
				stdList.add(std); // 데이터셋 리스트에 추가
			}
			
		} catch(SQLException e) {
			System.out.println("전체 학생 정보 조회 오류 발생");
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt, rs);
		}
		return stdList;
	}

	@Override
	public StudentDTO detailStudent(String stdNo) {
		try {
			String sql = "select * from STUDENT where stdNo=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, stdNo);
			rs = pstmt.executeQuery();
			
			if (rs.next()) { // 한개 레코드 반환
				stdNo = rs.getString(1);
				String stdName = rs.getString(2);
				int stdYear = rs.getInt(3);
				String stdAddress = rs.getString(4);
				Date stdBirth = rs.getDate(5);
				String dptNo = rs.getString(6);
				
				std = new StudentDTO(stdNo, stdName, stdYear, stdAddress, stdBirth, dptNo);
			} else {
				std=null;
			}
			
		} catch(SQLException e) {
			System.out.println("단일 학생 정보 조회 오류 발생");
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt, rs);
		}
		return std;
	}

	@Override
	public void updateStudent(StudentDTO dto) {
		try { // 학생 한명의 정보를 수정 진행(기본키 제외)
			String sql = "update student set stdName=?, stdYear=?, stdAddress=?, stdBirth=?, dptNo=? where stdNo=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getStdName());
			pstmt.setInt(2, dto.getStdYear());
			pstmt.setString(3, dto.getStdAddress());
			pstmt.setDate(4, new java.sql.Date(dto.getStdBirth().getTime()));
			pstmt.setString(5, dto.getDptNo());
			pstmt.setString(6, dto.getStdNo());
			
			pstmt.executeUpdate();
			System.out.println("학생 정보 수정 성공!");
			
		} catch (Exception e) {
			System.out.println("학생 정보 수정 실패..");
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt);
		}
	}

	@Override
	public void deleteStudent(String stdNo) {
		// 학생 한명의 정보를 삭제
		try {
			String sql = "delete student where stdNo=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, stdNo);
			
			pstmt.executeUpdate();
			
			System.out.println(stdNo + " - 학생 정보 삭제 성공!");
			
		} catch (Exception e) {
			System.out.println("학생 정보 삭제 실패..");
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt);
		}	
	}

	@Override
	public ArrayList<StudentDTO> searchStudentDept(String dptName) {
		stdList = new ArrayList<StudentDTO>();
		try {
			String sql = "select * from STUDENT where dptNo = (select dptNo from departMent where dptName = ?)"; // 서브쿼리
			String sql1 = "select * from STUDENT S, DEPARTMENT D where S.dptNo = D.dptNo and dptName=?"; // 조인
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dptName);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String stdNo = rs.getString(1);
				String stdName = rs.getString(2);
				int stdYear = rs.getInt(3);
				String stdAddress = rs.getString(4);
				Date stdBirth = rs.getDate(5);
				String dptNo = rs.getString(6);
				std = new StudentDTO(stdNo, stdName, stdYear, stdAddress, stdBirth, dptNo);
				stdList.add(std);
			}
			
		} catch(SQLException e) {
			System.out.println("학과 학생 정보 조회 오류 발생");
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt, rs);
		}
		return stdList;
	}
}
