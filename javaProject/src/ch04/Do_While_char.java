package ch04;

public class Do_While_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c ='a';
		do {
			System.out.println(c);
			c=(char)(c+1);//영문의 경우1을 더하면 다음 문자의 코드 값
		}while(c<='z');
	}

}
