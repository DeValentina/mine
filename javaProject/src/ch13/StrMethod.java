package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1="java";
		str1 += " programming"; //str1=str1+" programming";
		//문자열을 만들고 str1은 새로운 문자열의 주소값을 가리키게 됨
		System.out.println(str1.length());//문자열의 길이
		//string은 char를 배열화 시킨 것> length 사용가능
		String str2=str1.concat(" programming"); //()문자열 연결시킴
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));//n번째문자(인덱스)리턴
		System.out.println(str2.indexOf("z"));
		//내용이 없으면 -1을 리턴(중요)**
		System.out.println(str2.substring(0,4));//substring(start,end-1) => (0,3)까지 추출
		System.out.println(str2.substring(5));//5~끝까지
		System.out.println(str2.replace("java", "jsp"));//java>jsp
		System.out.println(str2);
		str2=str2.replace("java", "jsp");//주소값 달라지는 것
		System.out.println(str2);
		
		String str3="357198598942";
		System.out.println(str3.substring(5,9));
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
		
	}
}
