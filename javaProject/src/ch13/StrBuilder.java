package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//string불변 
		//stringbuilder가변
		
//		StringBuffer str1= new StringBuffer();//초기버전용
		StringBuilder str1 = new StringBuilder();
		//StringBuilder는 일반객체이기 때문에 String과는 달리 new해서 사용해야함
		str1.append("java"); //append()는 문자열 내용 추가, 메모리 절약
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp");
		//0~3인덱스 내용을 변경(java> jsp)
		//참고로 replace()메소드는 주로 string객체의 replace()를 많이 쓴다
		System.out.println(str1);
		String str2=str1.substring(3);	//인덱스 3~끝까지
		System.out.println(str1);
		System.out.println(str2);
		
		String str3=str1.toString();
		//string을 stringbuilder로 바꾸기 위해선 toSTring 사용
		System.out.println("StringBuilder(str1) > String(str3)에 저장 :"+str3	);
		
		//string을 stringbuilder에 저장할때
		str1 = new StringBuilder(str3);
		System.out.println("String(str3) > StringBuilder(str1)에 저장 :"+str1	);
		
	}	
}
