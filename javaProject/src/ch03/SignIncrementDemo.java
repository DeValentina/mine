package ch03;

public class SignIncrementDemo {
	public static void main(String[] args) {
		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne은 " + plusOne + "입니다.");
		System.out.println("minusOne은 " + minusOne + "입니다.");
		int x = 1, y = 1;
		System.out.println("x = " + x + ", ++x = " + ++x); //+는 연결
		System.out.println("y = " + y + ", y++ = " + y++);
		System.out.println("x = " + x + ", y = " + y); 
		//후위 증가감 연산자 일때는 다음줄에 연산반영
	}
}
