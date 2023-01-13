package ch12;

class Outer{
	class InstanceInner {
		int a=100;
	}
	static class StaticInner{
		int a=200;//nonstatic은 반드시 생성 후 참조변수, 멤버변수
		static int b=300;
	}
	void MyMethod() {
		class LocalInner{
			//메소드 안에 class
			//메소드 안에서 모든 걸 다 해결/처리해야함
			int a=400;
		}//static inner class
		LocalInner i = new LocalInner();
		System.out.println("i.a : "+i.a);
	}//메소드
}

public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner i = oc.new InstanceInner();
		//객체 생성 > 중요* 순서
		
		System.out.println("i.a : "+i.a);
		System.out.println("Outer.StaticInner.b : "+Outer.StaticInner.b);
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a :"+si.a);
	
		oc.MyMethod();
	}
}
