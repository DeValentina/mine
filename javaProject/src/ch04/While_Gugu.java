package ch04;

import java.util.Scanner;

public class While_Gugu {
		public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int dan;
		
		System.out.print("구구단 중에서 싶은 단을 입력하세요 : ");
		dan=scan.nextInt();
		

		int j=1;
		while(dan<=9) {
			while(j<=9) {
				System.out.println(dan+" x "+j+" = "+(dan*j));
				j++;
			}
		}
	}
}


