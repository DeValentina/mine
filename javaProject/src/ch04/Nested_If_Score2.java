package ch04;

import java.util.Scanner;

public class Nested_If_Score2 {
	public static void main(String[] args) {
		int score;
		char grade= ' ';
		char lev = '0';
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Java 점수 : ");
		score = scan.nextInt();
		scan.close();
		
		if(score >= 90) {
			grade = 'A';
			if(score> 95) {
				lev = '+';

			}
		}else {
			grade = 'F';
		}
		
		System.out.println("당신의 점수는 "+score+"이고 "+"등급은 "+grade+lev+"입니다.");
	}
}
