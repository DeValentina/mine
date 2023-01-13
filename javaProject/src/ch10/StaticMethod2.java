package ch10;

public class StaticMethod2 {
	static int num=10;//사번
	static String name = "홍길동";
	String email= "hong@gmail.com";
	String hp="010-1234-5678";
	String addr="서울 강남구 역삼동";
	
	
	public static void printA() {
		System.out.println("==== printA() ====");
		System.out.println(num);
		System.out.println(name);
		StaticMethod2 s = new StaticMethod2();
		System.out.println(s.email);
		System.out.println(s.hp);
		System.out.println(s.addr);
		
		
	}
	public void printB() {
		System.out.println("==== printB() ====");
		System.out.println(num);
		System.out.println(name);
		System.out.println(email);
		System.out.println(hp);
		System.out.println(addr);
	}
	
	public static void main(String[] args) {
		printA();
		StaticMethod2 a = new StaticMethod2();
		a.printB();
	
	}
}
