package ch10;

public class PolyEx {
	public static void main(String[] args) {
	int a=10;
	double b=20.1;
	char c='A';
	String d="hello";
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	//최상위클래스인 Object는 모든 타입 다룰 수 있음
	//그대로 사용하면 프로그램 무거워짐, 속도 저하
	//한개의 자료형으로 다양한 형태의 자료형을 처리할 수 이는 능력을 다형성라고 함
	
	Object o=21;
	System.out.println(o);
	
	}
}
