package ch06;

public class VariantParam {
	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program","jsp");
	//자료형 ... 변수=>가변사잍즈 매개변수, 변수가 배열참조 변수가 됨
	// 같은 자료형의 매개변수의 갯수에 관계없이 철
	//매개변수들이 배열로 저장됨
	}

	static void print(String ...n) {
		//n:가변형 매개변수(배열처리의 주소값)
		//타입 같아야함(다들 string)
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
		
	}
	
	
	
//	static void print(String a, String b, String c) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//	}
//
//	static void print(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//		
//	}
//
//	static void print(String a) {
//		System.out.println(a);
//	}
	
}
