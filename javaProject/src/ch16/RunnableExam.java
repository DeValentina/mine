package ch16;

public class RunnableExam implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		
		}
		
	}//end run()
	
	public static void main(String[] args) {
		RunnableExam e1 = new RunnableExam();
		
		//Runnable 쓸떄는 thread를 별도로 생성해서 써야한다
		//new thread (스레드 구현객체, 스레드이름)
		//자바는 단일 상속만을 하기 떄문에 다른 객체와 함께 상속받아 ㅡ레드를 구현하려면
		//implements runnable로 처리
		Thread t1= new Thread(e1, "스레드1");
		Thread t2= new Thread(e1, "스레드2");
		
		//t1.run하면 main인 싱글스레드가 돌아간다
		t1.run();//run호출
		t2.run();
	}
	

}
