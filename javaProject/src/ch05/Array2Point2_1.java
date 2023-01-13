package ch05;

public class Array2Point2_1 {
		public static void main(String[] args) {
			int[][] score;
			score = new int[5][3];
			score[0][0]= 100;
			score[0][1]= 100;
			score[0][2]= 100;
			score[1][0]= 89;
			score[1][1]= 76;
			score[1][2]= 92;
			score[2][0]= 88;
			score[2][1]= 69;
			score[2][2]= 72;
			score[3][0]= 45;
			score[3][1]= 60;
			score[3][2]= 59;
			score[4][0]= 96;
			score[4][1]= 92;
			score[4][2]= 89;
			
			System.out.println("변호\t국어\t영어\t수학\t총점\t평균");
			for(int i=0; i<score.length; i++) {
				int sum=0;
				float avg=0.0f; 
				System.out.printf("%d\t", i+1); 
				for (int j=0; j<score[i].length; j++) {
				
					sum+= score[i][j];
					System.out.printf("%d\t",score[i][j]);
				}
				avg = sum/(float)score[i].length; 
				
				
				System.out.printf("%d\t %.1f%n", sum, avg);
				
			}
		}
	}


