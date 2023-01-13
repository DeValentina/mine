package ch12;

public class StaticOuter2 {
	static int data=30;
	int data2=50; //non-static이면 메모리에 정보 올려야함
	static class StaticInner2 {
		void msg() {
			System.out.println("data is "+data);
			//static 멤버 사용가능
//			System.out.println("data is "+data2);
			//nonstatic 사용 불가능 static class 이기 때문		
		}
	}
	
	public static void main(String[] args) {
		//main도 결국엔 static
		StaticOuter2.StaticInner2 in = new StaticOuter2.StaticInner2();
		//객체 생성
		in.msg();
	}
}
