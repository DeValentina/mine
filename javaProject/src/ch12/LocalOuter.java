package ch12;

public class LocalOuter {
	private int data=30;
	void display() {//nonstatic > 객체 생성으로 접근필요
		class LocalInner {
			void msg() {
				System.out.println(data);
			}
		}//end inner class
		LocalInner li=new LocalInner();
		li.msg(); // 접근?
		
	}//end display() - Method
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
		
	}
}
