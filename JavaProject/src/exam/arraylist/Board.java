package exam.arraylist;

public class Board {
	private String subject;
	private String contents;
	private String wirter;
	
	public Board(String subject, String contents, String wirter) {
		this.subject = subject;
		this.contents = contents;
		this.wirter = wirter;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWirter() {
		return wirter;
	}
	public void setWirter(String wirter) {
		this.wirter = wirter;
	}
	
	@Override
	public String toString() {
		return subject + "과목은 " + contents + "라는 내용을 가진 " + wirter + "이 만든 과목입니다.";
	}
}
