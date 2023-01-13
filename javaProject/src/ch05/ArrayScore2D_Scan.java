package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num,sum = 0;
		float avg=0.0f; 
		
		System.out.print("학생수를 입력하세요 : ");
		num = scan.nextInt();
		int[][] score = new int[num][3];
		
		System.out.println("국, 영, 수 점수를 각각 입력하세요. ");
		
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"번 학생의 점수 : ");
			for(int j=0; j<score[i].length; j++) {
			score[i][j]=scan.nextInt();
			}
		}scan.close();
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		
		for(int i=0; i<score.length; i++) {
			System.out.printf("%d\t", i+1); 
			for(int j=0; j<score[i].length; j++) {
			sum += score[i][j];		
			System.out.printf("%d\t",score[i][j]);
			}
			avg = sum/(float)score[i].length;
		
			String grade = "";
			if (avg >= 90) {
				grade = "A";
			}else if (avg >= 80) {
				grade = "B";
			}else if (avg >= 70) {
				grade = "C";
			}else if (avg >= 60) {
				grade = "D";
			}else 				 {
				grade = "F";
			
			}
			System.out.printf("%d\t%.1f\t%s\n", sum, avg, grade);
		}
	}
}
