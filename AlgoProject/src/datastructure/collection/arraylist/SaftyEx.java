package datastructure.collection.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SaftyEx {
	public static void main(String[] args) throws InterruptedException {
		// ArrayList에 값을 insert작업을 스레드를 이용해서 병렬로 동시에 진행
		// 목표 : 1000개의 값을 arrayList에 스레드 이용하여 저장
	
		List<Integer> list = new ArrayList<Integer>();
		int threadCount = 1000;
		
		// 미리 32개의 스레드를 가진 스레드 풀 생성 - 스레드를 요청하여 할당 전 thread를 할당
		// 스레드 풀에 할당 스레드가 없으면 대기
		
		ExecutorService executorService = Executors.newFixedThreadPool(32);
		
		for (int i = 0; i < threadCount; i++) {
			final int value = i; // i값이 배열리스트에 저장됨
			executorService.submit(() -> {
				list.add(value);
			}); // 스레드 풀에 작업을 할당, 작업 진행 상태 추적 제어 가능한 ExecutorService 객체 Future 반환
		} // 여러개의 스레드가 동시에 한 인덱스를 참조할 때 쓰기 연산 진행하면 시간차로 인해 먼저 쓴 내용이 다음 스레드에 의해 지워질 수 있음
	
		executorService.shutdown(); // 새로운 작업 제출을 스레드 풀이 거부하고 기존작업은 모두 마치고 스레드 풀 종료
		executorService.awaitTermination(5, TimeUnit.SECONDS); // 셧다운 후에도 실행중인 작업이 지정한 시간동안 스레드를 대기시킴
	
		// 결과 출력
		System.out.println("목표 크기 : " + threadCount);
		System.out.println("실제 리스트 크기 : " + list.size());
		
		// arraylist는 스레드 환경에서 안전하지 않기 때문에 arraylist를 직접 사용하면 안됨
	}
}
