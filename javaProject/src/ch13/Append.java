package ch13;

public class Append {
	public static void main(String[] args) {
		String a="hello";
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		a=a+"java"; //새로운 주소값으로 복사된 것
		//그러면 hello는 메모리 어딘가에서 떠돌아다니는 중
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		StringBuilder b = new StringBuilder("hello");
		System.out.println(System.identityHashCode(b));
		b.append("java");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		//주소값 그대로 유지됨
	}
}
