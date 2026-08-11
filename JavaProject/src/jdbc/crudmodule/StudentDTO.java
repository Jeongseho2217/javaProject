package jdbc.crudmodule;

import java.util.Date;

// 데이터를 전달

public class StudentDTO {
	// ORM 사용시 테이블 속성명과 표현 클래스의 필드명은 일치시키는 것이 좋음
	private String stdNo, stdName, stdAddress, dptNo;
	private int stdYear;
	private Date stdBirth;
	
	public StudentDTO(String stdNo, String stdName, int stdYear, String stdAddress, Date stdBirth, String dptNo) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdYear = stdYear;
		this.stdAddress = stdAddress;
		this.stdBirth = stdBirth;
		this.dptNo = dptNo;
	}
	
	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	public String getDptNo() {
		return dptNo;
	}

	public void setDptNo(String dptNo) {
		this.dptNo = dptNo;
	}

	public int getStdYear() {
		return stdYear;
	}

	public void setStdYear(int stdYear) {
		this.stdYear = stdYear;
	}

	public Date getStdBirth() {
		return stdBirth;
	}

	public void setStdBirth(Date stdBirth) {
		this.stdBirth = stdBirth;
	}
}
