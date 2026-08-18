package datastructure.linkedlist;

public class LinkedList {
	private ListNode head;
	
	public LinkedList() {
		head=null;
	}
	
	//Node 삽입(마지막에 삽입)
	public void insertNode(String data) {
		// 새로운 노드 생성
		ListNode newNode = new ListNode(data); // data : data / link : null
		
		if (head == null) this.head=newNode;// head가 마지막일 경우 (list에 노드가 없는 경우)
		else { // list에 노드가 1개 이상 있는 경우 마지막 노드를 찾아서 연결
			ListNode tempNode = head; // 시작노드 주소인 head의 참조 주소를 임시변수에 저장
			while(tempNode.link != null) { // 마지막 노드를 찾을때까지 반복
				tempNode = tempNode.link;
			} // 마지막 노드를 찾았다면 link에 새로운 노드를 참조할 수 있도록 연결
			tempNode.link = newNode;
		}
	}
	
	//Node 삽입(중간에 삽입)
	// preNode -> preNode 다음 노드 주소가 newNode가 참조해야하는 주소
	public void insertNode(ListNode preNode, String data) {
		ListNode newNode = new ListNode(data);
		preNode.link = newNode; // preNode.link newNode 주소로 update된 상태에서
		newNode.link = preNode.link; // preNode.link를 newNode.link로 저장하면 나머지 리스트는 연결이 불가능
		preNode.link = newNode;
	}
	
	// 노드 삭제
	// 1. 중간 노드 삭제 (전달된 data와 값이 동일한 node 삭제)
	// 전달된 data와 값이 동일한 node중 첫번째 node 삭제
	
	public void deleteNode(String data) {
		ListNode preNode = head; // head 참조하는 첫번째 노드의 주소
		ListNode tempNode = head.link; // 첫번째 노드의 link 필드의 값이 두번째 node
		
		if (data.equals(preNode.getData())) { // 찾는 데이터가 첫번째 노드에서 찾아지는 경우
			head = preNode;
			preNode.link=null;
		} else { // 두번째 노드부터 data가 찾아질 때까지 노드를 이동해가며 확인
			while(tempNode != null) {
				if (data.equals(tempNode.getData())) { // 데이터가 일치하는 node를 찾은 경우
					if(tempNode.link == null) { // 마지막 노드에서 데이터가 일치한 경우
						preNode.link = null; // preNode는 tempNode 이전 노드
					} else { // 찾은 노드가 마지막 노드가 아니면
						// preNode : 삭제 노드의 이전 노드, tempNode : 삭제 노드
						preNode.link = tempNode;
						tempNode.link = null;
					}
					break;
				} else { // 데이터가 일치하지 않은 경우
					preNode = tempNode;
					tempNode = tempNode.link;
				}
			}
		}
	}
	
	// 마지막 노드 삭제(data 상관 없이 무조건 마지막 노드 삭제)
	public void deleteNode() {
		ListNode preNode; // 마지막 이전 노드
		ListNode tempNode; // 마지막 노드
		
		if(head == null) return; // 노드가 없음
		if(head.link == null) head = null;// 노드가 한개인 경우
		else {
			preNode = head;
			tempNode = head.link;
			
			while(tempNode.link != null) {
				preNode = tempNode;
				tempNode = tempNode.link;
			} //반복이 종료되면 마지막노드는 tempNode가 참조 마지막 이전 노드는 preNode가 참조
			// preNode.link를 null로 만들어 tempNode가 참조하는 연결 끊기
			preNode.link = null;
		}// 두개이상인 경우 마지막 노드 찾기
	}
	
	// Node 검색 : data를 전달하여 해당 data가 linkedList에 있는지 확인 후 있으면 해당 노드의 참조를 반환
	public ListNode searchNode(String data) {
		ListNode tempNode = this.head; // 첫번째 노드 할당
		
		while(tempNode != null) { // 다음 노드가 있는 동안 반복
			if(data.equals(tempNode.getData())) return tempNode;//data 탐색되면
			else {
				tempNode = tempNode.link; // 다음 노드로 이동
			}
		}
		return tempNode; // 안찾아지면 최종 temp 반환(null)
	}
	
	public void printList() { // 연결 리스트의 모든 노드의 data 출력
		ListNode tempNode = this.head;
		
		// head부터 시작하여 마지막 노드까지 순회하면서 출력
		while(tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.link;
		}
		System.out.println();
	}
	
	// reverse : 연결 리스트를 역순으로 재배치(원본이 변경됨)
	public void reverseList() {
		ListNode nextNode = head; //head가 참조하는 첫번째 node 할당
		ListNode currentNode = null;
		ListNode preNode = null;
		
		while(nextNode != null) {
			preNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.link;
			currentNode.link = preNode;
		}
		head = currentNode; // 반복문을 벗어나면 currentNode는 마지막 node를 참조
	}
}
