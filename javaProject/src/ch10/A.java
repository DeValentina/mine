package ch10;

public class A {
	String name = "kim";
	//non static member > A class 멤버
	static int n = 20;
	//static member 
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		//main 도 static member
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		
		A aa = new A();
		System.out.println(name);
		
	}

}
