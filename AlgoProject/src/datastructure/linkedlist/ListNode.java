package datastructure.linkedlist;

public class ListNode {
	// |데이터|링크| -> ..
	private String data; // 데이터가 들어갈 필드
	public ListNode link; // 링크는 ListNode 타입을 참조하여야 함.
	
	public ListNode() {
		this.data = null;
		this.link = null;
	}
	
	public ListNode(String data) {
		this.data = data;
		this.link = null;
	}
	
	public ListNode(String data, ListNode link) {
		this.data = data;
		this.link = link;
	}
	
	public String getData() {
		return this.data;
	}
}
