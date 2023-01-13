package ch04;

import java.util.Scanner;

public class While_HakJum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double avg;
		int kor,eng,mat,tot;
		String result = "";
		String grade = "";
	
	
		System.out.println("전체 성적입력이 끝나면 마지막에 -1을 입력하세요.");
		System.out.print("아무 정수나 입력하세요 : " );
		int n = scan.nextInt();
		
		while(n != -1) {	
			System.out.print("국어 : ");
			kor = scan.nextInt();
			System.out.print("영어 : ");
			eng = scan.nextInt();
			System.out.print("수학 : ");
			mat = scan.nextInt();
			System.out.print("계속 하려면 아무 정수나 입력하세요 : " );
			n = scan.nextInt();
			tot = kor+eng+mat;
			avg = tot/3.0;

			if (avg >=90) {
			grade = "수";
			}else if(avg>=80) {
			grade = "우";
			}else if(avg>=70) {
			grade = "미";
			}else if(avg>=60) {
			grade = "양";
			}else {
			grade = "가";
			}
			result+=kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f",avg)+"\t"+grade+"\n";
		continue; }
		
		System.out.println("============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("--------------------------------------------");
		System.out.println(result);
		System.out.println("============================================");
		
		scan.close();
	}
}
