package interfaceex.interfacemember;

public class MemberDTO {
	
	private String memId; //회원번호를 저장할  필드
	private String memPass; //회원 비번
	private String memName;
	private String memPhone;
	private String memAddress;
	
	public MemberDTO(String memId, String memPass, String memName ,String memPhone, String memAddress) {
		this.memId = memId; 
		this.memPass = memPass;
		this.memName = memName;
		this.memPhone = memPhone;
		this.memAddress = memAddress;
	}
	
	//getter/setter
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPass() {
		return memPass;
	}

	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemAddress() {
		return memAddress;
	}

	public void setMemAdress(String memAddress) {
		this.memAddress = memAddress;
	}
}
