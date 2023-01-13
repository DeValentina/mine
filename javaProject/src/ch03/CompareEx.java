package ch03;

public class CompareEx {
	public static void main(String[] args) {
		int a = 65;
		char c = 'A'; //char 단문자일때 꼭 '소따옴표' > 자바는 엄격해요
		System.out.println(a == c); //비교연산자 좌변 = 우변 같는가?
		//아스키값으로 판단
		System.out.println(a = c); //대입연산자
		System.out.println(c != 65);//not Equal
		
				
		
	}
}
