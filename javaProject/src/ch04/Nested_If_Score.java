package ch04;

public class Nested_If_Score {
	public static void main(String[] args) {
		int score = 87;
		char grade = ' ';
		char lev = '0';
		
		if(score > 90) {
			grade = 'A';
			if(score > 97) {
				lev = '+';
			}else if(score < 94) {
				lev = '-';				
			}
		}else if(score > 80) {
			grade = 'B';
			if (score > 87) {
				lev = '+';
			}else if(score < 84) {
				lev = '-';		
			}
		}else {
			grade = 'F';		
		}
		System.out.println("당신의 점수는 "+score+"이고 등급은 "+grade + lev + " 입니다.");
	}
}
