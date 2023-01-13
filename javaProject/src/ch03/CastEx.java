package ch03;

public class CastEx {
	//자료형변환
	public static void main(String[] args) {
		float f =1.6f; //항상 끝에 f넣기, 4바이트
		System.out.println(f);
		
		f = 100;//자동형변환 정수 100을 자동으로 float형 실수로 바꿈 100.0
		System.out.println(f);
		
		f= 100.5F;
		int i = (int)f;//f는 실수형 i는 정수형 => 강제형변환, 명시적변환
		System.out.println(i); //값 손실 우려있음
	}

}
