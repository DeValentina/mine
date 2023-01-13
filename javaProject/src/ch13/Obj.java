package ch13;

public class Obj {//extends Object 생략되어 있음
	public static void main(String[] args) {
		Obj e1 = new Obj();
		System.out.println(e1.getClass());
		//클래스 정보
		System.out.println(e1); //주소값
		System.out.println(e1.toString());//"ch13.Obj@515f550a"문자열로 처리된 것
		
	}
}
