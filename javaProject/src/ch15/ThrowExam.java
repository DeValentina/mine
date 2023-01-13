package ch15;

public class ThrowExam {
	//throw:예외 직접 발생시킴
	//테스트용 외에는 거의 쓸 일 없음
	static void test(int n) {
		if( n==0 ) {
			throw new NullPointerException();
			//throw new 예외클래스: 특정한 조건에 인위적 예외 발생시킴
		}
	}
	public static void main(String[] args) {
		test(0);
		
	}
}
