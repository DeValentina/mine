package ch04;

import java.util.Scanner;

public class While_Point2 {
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		//Scanner 뒤에 들어가는 scanner ~ 어쩌구 이거 변수라서 암거나 넣어도 됨
		System.out.println("국어 영어 수학 점수를 각각 입력하고 마지막에 -1을 입력하세요");
		int n = scan.nextInt();
		while(n != -1) {//-1이 입력되면 while문 벗어남
			sum+= n;
			count ++;
			n = scan.nextInt();//-1입력용
		}
		if (count ==0) //한줄 짜리는 {(중괄호) 생략 가능
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.printf("총점은 %d 이고 평균은 %.1f 입니다.",sum, (double)sum/count);		
		}
		scan.close();
	}	
}
