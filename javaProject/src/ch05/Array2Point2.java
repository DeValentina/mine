package ch05;

public class Array2Point2 {
	public static void main(String[] args) {
		//5행 3열(데이터)
		int[][]score = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
		System.out.println("변호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<score.length; i++) {
			int sum=0; //총점
			float avg=0.0f; //f 필수
			System.out.printf("%d\t", i+1); //번호출력
			for (int j=0; j<score[i].length; j++) {//바깥쪽 for 배열첨자 활용
				// 국영수 배열값 처리
				sum+= score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			avg = sum/(float)score[i].length; //평균계산
			
			//출력
			System.out.printf("%d\t %.1f%n", sum, avg);
		}//end outer for
	}
}
