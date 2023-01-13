package ch20;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상");
		int num = sc.nextInt();
		
		int sum =0;
		if(num >= 0 ) {
			int i = 1;
			while (i <=num) {
			sum += i;
		}
		System.out.println("1부터"+num+"까지의 합은"+num);
	} else {
		System.out.println("1이상 아닙니다.");
	}	
	}
}	


