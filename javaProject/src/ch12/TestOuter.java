package ch12;

public class TestOuter {
	private int data = 30;
	class Inner{
		//내부 클래스
		void msg() {
			System.out.println("data is "+data);
			//외부클래스의 private 변수도 쓸 수 있다
		}
	}
	public static void main(String[] args) {
		TestOuter obj = new TestOuter();
		TestOuter.Inner in = obj.new Inner();
		//내부 객체 생성
		//외부.내부 내부의 참조 변수 = 외부 생성자 이름()
		in.msg();
	}

}
