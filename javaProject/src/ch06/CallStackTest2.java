package ch06;

public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[]arg)이 시작되었음.");
		firstMethod();//호출 > firstmethod로 감
		System.out.println("main(String[]arg)이 끝났음.");
		
	}

	static void firstMethod() {
		System.out.println("firstMethod()가 시작되었음.");
		secondMethod();//호출
	}

	static void secondMethod() {
		System.out.println("secondMethod()가 시작되었음.");
		System.out.println("secondMethod()가 끝났음.");
	}
}
