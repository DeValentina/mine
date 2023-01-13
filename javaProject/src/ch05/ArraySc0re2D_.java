package ch05;

import java.util.Scanner;

public class ArraySc0re2D_ {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요 : ");
		num = sc.nextInt();
		int[][] score = new int[num][3];
		
		System.out.println("국, 영, 수 점수를 각각 입력하세요 : ");
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"번 학생의 점수 : ");
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = sc.nextInt();
			}
		} sc.close();
		
		System.out.println("\n번호\t국어\t영어\t수학\t총점\t 평균\t등급");
		for(int i=0; i<score.length; i++) {
			int sum=0;
			double avg=0.0;
			System.out.printf("%d\t",i+1);
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			avg = sum/score[i].length;
			if(avg>90) {
				System.out.println(sum+"\t"+avg+"\t"+" A ");
			}else if(avg>80){
				System.out.println(sum+"\t"+avg+"\t"+" B ");
			}else if(avg>70){
				System.out.println(sum+"\t"+avg+"\t"+" C ");
			}else if(avg>60){
				System.out.println(sum+"\t"+avg+"\t"+" D ");
			}else{
				System.out.println(sum+"\t"+avg+"\t"+" F ");
			}
		
		}
	}
}
	

