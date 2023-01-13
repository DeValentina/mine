package ch12;

public class MemberOuter {
	static int num=1;
	static String name="홍길동";
	static String email="hong@gmail.com";
	
	static class TestInner{
		int getNum() {
			return num;
		}
		String getName() {
			return name;
		}
		String getEmail() {
			return email;
		}
	}
		public static void main(String[] args) {
			MemberOuter.TestInner in=new MemberOuter.TestInner();
			System.out.println("고객번호 : "+in.getNum());
			System.out.println("이름 : "+in.getName());
			System.out.println("이메일 : "+in.getEmail());
		}
}
