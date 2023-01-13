package ch16;

public class MyThread_Im_Use {
	public static void main(String[] args) {
		
		MyThread_Im t1 = new MyThread_Im();
		
		Thread my1= new Thread(t1, "스레드1");
		Thread my2= new Thread(t1, "스레드2");
		
		my1.setPriority(Thread.MIN_PRIORITY);
		my2.setPriority(Thread.MAX_PRIORITY);
		
		//t1.run하면 main인 싱글스레드가 돌아간다
		my1.start();
		my2.start();

	}
}