package ch05;

public class ArrayTest2 {
	public static void main(String[] args) {
		int sum=0;
		float average = 0f; //float는 f 추가 필수
		int[] score = {100,88,100,100,90};
		for(int i=0; i<score.length; i++) {
			sum += score[i];//sum = sum+score[i]
		}
		average = sum/(float)score.length;// 계산결과를 float으로 
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}
