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
				} else { // 데이터가 일치하지 않은 경우
					preNode = tempNode;
					tempNode = tempNode.link;
				}
			}
		}
	}
}
