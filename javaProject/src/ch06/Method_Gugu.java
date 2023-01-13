package ch06;

import java.util.Scanner;

public class Method_Gugu {
	public static void main(String[] args) {
		int dan;
		
		System.out.print("단을 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		gugu(dan); //문자(문자) : 항상 메서드
		sc.close();
	}

	public static void gugu(int dan) { //매개변수, 타입 맞춰주기
		// TODO Auto-generated method stub
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
			
		}
	}
}
