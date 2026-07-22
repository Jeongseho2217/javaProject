package loop;

public class break1 {

	public static void main(String[] args) {
		// 반복 진행 중 특정 조건 만족시 반복 종료
		int i = 0;
		
		while(true) {
			i += 3;
			if (i >= 100) {
				break;
			}
			System.out.println(i);
		}
		// 종료 시키고자 하는 반복문에 라벨 붙이기
		Outer:for (char upper='A'; upper<='Z'; upper++) {
			for (char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outer; // 가장 가까운 반복문을 종료
					// break LabelName : LabelName을 중단시킴
				}
			}
		}
		
		// break 조건 여러번 사용도 가능
				Outer:for (char upper='A'; upper<='Z'; upper++) {
					for (char lower='a'; lower<='z'; lower++) {
						System.out.println(upper + "-" + lower);
						if(lower == 'g') {
							break; // g가 뜨면 안쪽 반복문 종료
						}
						
						if(upper == 'K') {
							break Outer; // K가 뜨면 전체 반복문 종료
						}
					}
				}
	}

}
