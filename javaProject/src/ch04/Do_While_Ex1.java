package ch04;

public class Do_While_Ex1 {
	public static void main(String[] args) {
		int i=1; //초기식
		do {//먼저 실행
			System.out.print(i);
			i++; //증감식
		}while(i<=10); //조건식 (나중에 검사, ;반드시 찍기)
	}
}
