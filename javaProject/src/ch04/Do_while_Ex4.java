package ch04;

import java.util.Scanner;

public class Do_while_Ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.print("올바른 월을 입력하세요 [1-12] : ");
			month = input.nextInt();
		}while (month <1 || month > 12); //or 표시임!
		input.close();
		System.out.println("사용자가 입력한 월은 "+month+"입니다. ");
	}
}
