package ch10;

public class OverloadEx {
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		OverloadEx o = new OverloadEx();
		o.putData("Hello");
		o.putData(10);
		o.putData(10.5);
	}
}
//오버로드는 데이터 타입이 다르다던가 차이점이 있을때
//오버라이딩은 완전히 같게