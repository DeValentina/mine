package ch04;

import java.util.Scanner;

public class ForPoint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kor,eng,mat,tot;
		double avg;
		String grade = "";
		String result = "";

		for(int i=1; i<=3; i++) {
			System.out.print("국어 : ");
			kor = scan.nextInt();
			System.out.print("영어 : ");
			eng = scan.nextInt();
			System.out.print("수학 : ");
			mat = scan.nextInt();

			tot = kor+eng+mat;
			avg=tot/3.0;
		
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
			result =kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f",avg)+"\t"+grade+"\n";
	
			}	
		System.out.println("================================================");
		System.out.println("국어\t수학\t영어\t총점\t평균\t등급");
		System.out.println("------------------------------------------------");
		System.out.println(result);
		System.out.println("================================================");
		scan.close();
		}	
		}

			
