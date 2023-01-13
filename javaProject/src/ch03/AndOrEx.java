package ch03;

public class AndOrEx {
	public static void main(String[] args) {
		int a =7;
		//논리연산자
		System.out.println(a > 5 && a < 0); 
		//true && false  하나라도 f면 f
		System.out.println(a > 5 || a < 0);
		//t || f 하나라도 t면  t
	}
}
