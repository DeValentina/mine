package ch04;

public class For_For {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {//5번 반복(outer for문)
			for(int j=1; j<=5; j++) {//중첩for문(inner for문)
				//중첩for문에서는 변수 다르게 사용 
				System.out.print("*");
			}//inner for
			System.out.println();//줄바꿈
		}//outer for
	}//end main():프로그램 종료
}
