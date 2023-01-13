package ch06;

public class CallEx {
	//method의 위치는 메인() 위 아래 상관없음
	public static void test(int b) {
		//리턴 없는 것
		System.out.println("test method 호출");
		System.out.println(b);
	}
	//집임 > 항상 돌아와야함
	public static void main(String[] args) {
		System.out.println("시작");
		int a = 10;
		test(a);
		test2(a);
		System.out.println("끝");
	}
	public static void test2(int a) {
		System.out.println(a);
	}
}
