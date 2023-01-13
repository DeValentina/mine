package ch05;

import java.util.Scanner;

public class ArrayScanScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int tot=0;
		double avg=0;
		
		
		System.out.print("성적처리할 학생 수를 입력하세요 : ");	
		num = scan.nextInt();
		int[] score = new int[num];
		
		for(int i=0; i<score.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			score[i]=scan.nextInt();
		}
		for(int i=0; i<score.length; i++) {
		tot += score[i];
		}
				
		System.out.println("총점은 "+tot+"입니다.");
		System.out.print("평균성적은 "+tot/score.length+"입니다.");
	}
}
