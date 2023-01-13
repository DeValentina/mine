package ch02;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		//nt num = in.nextInt();
		num = in.nextInt();
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		// 3항 연산자 왼쪽부터 1항? 2항(true) 3항(false)
		in.close();
	}

}
