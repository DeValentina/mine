package ch13;

public class Replace {
	public static void main(String[] args) {
		String a="java program";
		System.out.println(a.replace("a", "A"));
		
		a=a.replace("a", "A");
		//내용을 아예 바꾸는 것 X
		//복사하는 것
		System.out.println(a);
	}
}
