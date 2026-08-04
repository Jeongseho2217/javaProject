package collection.hashmap;

public class Student {
	private String strNo;
	private String strName;
	
	public Student(String strNo, String strName) {
		this.strNo = strNo;
		this.strName = strName;
	}

	public String getStrNo() {
		return strNo;
	}

	public void setStrNo(String strNo) {
		this.strNo = strNo;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}
	
	// 동등객체인지 판단하기 위한 매서드 재정의
	@Override
	public int hashCode() {
		return strNo.hashCode() + strName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		//Student 객체인지 확인
		if(obj instanceof Student) {
			// obj의 필드와 현재 객체의 필드 값이 모두 동일한지 확인
			Student student = (Student)obj;
			return (strNo.equals(student.strNo)) && (strName.equals(student.strName));
		} else {
			return false;
		}
	}
}
