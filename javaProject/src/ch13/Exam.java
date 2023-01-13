package ch13;

public class Exam {
	public static void main(String[] args) {
		String a="hello";//string pool영역에 저장
		System.out.println(System.identityHashCode(a));
		//주소
		//내용 자체를 메모리에 올림
		String b="hello";
		System.out.println(System.identityHashCode(b));
		//같은 내용이라면 같은 주소에 저장됨, 다른변수를 사용하더라도
		System.out.println(a==b);//주소값이 같냐?
		
		String c = new String("hello"); //대문자로 시작하면 객체
		//정상 > Heap메모리 영역에 저장
		//객체 자체를 메모리에 올림
		System.out.println(System.identityHashCode(c));
		String d = new String("hello");
		System.out.println(System.identityHashCode(d));
		System.out.println(c==d);
		System.out.println(c.equals(d));//내용이 같냐?
		
	}
}
