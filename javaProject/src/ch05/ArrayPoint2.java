package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name [] = new String[2];
		int kor[]= {0,0};
		int eng[]= {0,0};
		int mat[]= {0,0};
		int tot[]= {0,0};
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		
		int[] score = new int[2];  
		
		for (int i=0; i<score.length; i++) {
		System.out.print("이름을 입력하세요 : ");
		name[i] = scan.next();
		System.out.print("국어점수 : ");
		kor[i] = scan.nextInt();
		System.out.print("영어점수 : ");
		eng[i] = scan.nextInt();
		System.out.print("수학점수 : ");
		mat[i] = scan.nextInt();
		}
		
		double[] avg = new double[2];
		double tot_avg = 0;
		for(int i=0; i<score.length; i++) {
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.0;
			tot_avg=tot_avg+avg[i];
		}
		
		scan.close();
		for(int i=0; i<score.length; i++) {
		System.out.println("이름 : "+name[i]);
		System.out.println("국어 : "+kor[i]);
		System.out.println("영어 : "+eng[i]);
		System.out.println("수학 : "+mat[i]);
		System.out.println("총점 : "+tot[i]);
		System.out.println("평균 : "+ String.format("%.1f", avg[i]));
		}
	System.out.println("=================");
	System.out.println("학급평균 : " + String.format("%.1f", tot_avg/2));
	}
}
