package api.arrays;

public class Member implements Comparable<Member>{

	String name;
	
	Member(String name) {
		this.name = name;
	}
	
	//compareTo() 리턴값
	// - 오름차순일때 자신이 매개값보다 낮을 경우 음수 높을 경우 양수 같으면 0 반환
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}

}
