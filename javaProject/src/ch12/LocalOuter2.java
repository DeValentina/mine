package ch12;

public class LocalOuter2 {
	private int data=20;
	void display() {
		class LocalInner2 {
			int value =50;
			void msg() {//호출을 해줘야만 기능할 수 있음
				System.out.println(value);
				System.out.println(data);
				//inner class는 외부 클래스의 private 변수
			}
		}
		LocalInner2 li= new LocalInner2();
		li.msg(); //호출
		
	}
	
	public static void main(String[] args) {
		LocalOuter2 lo =new LocalOuter2();
		lo.display();
		
	}
}
