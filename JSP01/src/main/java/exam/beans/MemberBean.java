package exam.beans;

public class MemberBean {
	private String uid;
	private String pw;
	private String name;
	private String email;
	
	public MemberBean() {
		
	}
	
	public MemberBean(String uid, String pw, String name, String email) {
		this.uid = uid;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
