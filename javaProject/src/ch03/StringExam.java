package ch03;

public class StringExam {
	public static void main(String[] args) {
		String str = "Hello " + "java";//문자열을 연결시킴
		System.out.println(str);
		str = 123 + "C";//숫자+문자열 => 문자열 숫자도 문자취급
		System.out.println(str);
		
		str +="Programmer";//str = str + programmer 연결시킴
		System.out.println(str);	
		//문자열이 누적된다!!
	}
}
