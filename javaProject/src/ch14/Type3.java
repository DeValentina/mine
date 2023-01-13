package ch14;

public class Type3<T>{ //<T>or<A> 자료형이 미정인 상태
//<> 제너릭 기호
	T t; //멤버변수, 변수도 자료형 미정
	public Type3() {//만약 생성자처리 하고자 > <T>빼고!
	
	}
	public Type3(T a) {//생성자 매개변수를 쓴다면 타입은 위에서 정한 T로 처리
		t=a;
	}
	public void setT(T t) {//메소드도 생성자 매개변수처리와 같다.
		this.t = t; //지역=멤버일때
		
	}
	public T getT() {
		return t; //정해지지 않은 데이터 타입
	}
	public static void main(String[] args) {
		//인스턴스를 생성할때 자료형을 결정함
		//=generic(일반화) 
		Type3<String> t = new Type3<String>();
		t.setT("Hello");
		System.out.println(t.getT());
		Type3<Integer> t2= new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3= new Type3<Double>(200.5);
		//생성자 매개변수 활용
		System.out.println(t3.getT());
		
		//<>자료형을 주지 않고 일반적 방법으로 처리시 실행은 됨=<>없이
		//내부적으로 모두 Object처리됨>메모리낭비 심함
		Type3 t4 = Type3();
		t4.setT(100.5);
		System.out.println(t4.getT());
		t4.setT("Java");
		System.out.println(t4.getT());
//		Type3<>
	}
}