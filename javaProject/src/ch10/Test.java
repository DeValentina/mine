package ch10;

public class Test {
	static int a;
	//static member
	int b;
	//nonstatic member
	void print() {
		//nonstatic member
		//non메소드에서는 static, non static 모두 쓸 수 있다.
		System.out.println(a);
		//a는 이미 메모리에 올라와 있기 때문에 문제 없음
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		System.out.println(a);
		Test t = new Test()
		
		//new을 해야만 non인 b를 쓸 수 있다.
		t=null;
		//객체의 주소값을 지워버림
		//System.out.println(t.b);
		System.out.println(Math.PI);
		
		
	}
}
