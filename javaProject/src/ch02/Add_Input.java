package ch02;

import java.util.Scanner;

public class Add_Input {
	//여기에 변수 있으면 전역변수
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x; //지역변수
		int y;
		int sum;
		
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		x = input.nextInt();//정수형으로 값을 받는다
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		sum = x + y;
		System.out.println(sum);
		
		input.close();//Scanner 객체 닫기		
	}

}
