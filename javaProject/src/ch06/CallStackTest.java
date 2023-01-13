package ch06;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod(); //호출
		
	}

	public static void firstMethod() {
		// (public)생략하고 static void 가능
		secondMethod();
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
