package jdbc.crudmodule;

import java.util.ArrayList;

public interface IStudentDAO {
	public void insertStudent(StudentDTO dto); // 학생의 모든 정보를 받아 명단에 추가
	
	public ArrayList<StudentDTO> getAllStudent(); // 전체 학생 리스트 반환
	
	public StudentDTO detailStudent(String stdNo); // 한명 검색이므로 기본 키만 필요
	
	public void updateStudent(StudentDTO dto); //정보 변경이므로 학생의 모든 정보 필요
	
	public void deleteStudent(String stdNo); // 삭제이므로 기본키만 받기
	
	public ArrayList<StudentDTO> searchStudentDept(String dptName); // 학과명 받고 학생 리스트 반환
}
