package ch13;

public class AutoBox2 {
	public static void main(String[] args) {
		int num1=30;
		int num2;
		int num3;
		
		//클래스자료형(객체)
		Integer i1;//객체참조변수(주소값 저장), 아직은 선언만 했기때문에 i1은 null상태
		Integer i2 = new Integer(40);//auto boxing(기본자료형을 객체로 박스 처리)
		Integer i3 = new Integer(50);
		i1 = num1;
		num2 = i2;//auto unboxing(객체 안에 들어있는 값을 풀어서 기본타입으로 바꾸었기 때문에 저장가능)
		num3 = i3;
		System.out.println("기본자료형 변수 : "+num1+", 객체자료형 : "+i1);
		System.out.println("기본자료형 변수 : "+num2+", 객체자료형 : "+i2);
		System.out.println("기본자료형 변수 : "+num3+", 객체자료형 : "+i3);

		
	}
}
