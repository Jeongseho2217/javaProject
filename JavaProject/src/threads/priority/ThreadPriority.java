package threads.priority;

public class ThreadPriority {
	public static void main(String[] args) {
		// 다중 스레드 우선순위 예시 - 10번 thread는 우선순위 높게 나머지는 낮게 설정
		for (int i = 1; i<=10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if (i!=10) thread.setPriority(Thread.MIN_PRIORITY);
			else thread.setPriority(Thread.MAX_PRIORITY);
			thread.start();
		}
	}
}
