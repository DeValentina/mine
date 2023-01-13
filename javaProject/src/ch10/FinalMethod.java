package ch10;

class A2 {
	void print() {
		//메소드에 final 부이면 상속관계에 있어 오버라이딩 불가능
		System.out.println("a");
	}
}
class B2 extends A2{
//	 @override
//	void print() {
//		System.out.println("b");
//	}
}


public class FinalMethod {
	public static void main(String[] args) {
	B2 b = new B2();
	b.print();
	}
}
