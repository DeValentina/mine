package ch16;

public class SingleThread {
	void print() {
		//현재 실행중인 스레드(currentThread)의 이름
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	//main도 스레드였다
	public static void main(String[] args) {
		SingleThread t = new SingleThread();
		t.print();
		t.print();
	}
}
