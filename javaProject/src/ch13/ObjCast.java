package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a=10;
		Object obj=20;//좌:부 우:자
//		a=obj; 에러> obj:object타입 a:int타입 > 비교대상이 안됨
		System.out.println(a);
		
		Object[] obj2= {100,100.5,true,"hello",'A'};
		//사실은 각 데이터가 Object객체(integer,double,boolean등...)가 내부적으로 변환
		//>auto boxing처리
		//그래서 메모리 낭비가 심하다. 이렇게 쓰는 일은 없다. 
		// 대신 컬렉션처리(ArrayList등)으로 단점 보완
		
		for(Object o : obj2) {
			System.out.println(o);//오토언박싱
		}
	}
}
