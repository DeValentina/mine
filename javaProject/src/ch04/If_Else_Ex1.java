package ch04;

public class If_Else_Ex1 {
	public static void main(String[] args) {
		int score = 90;
		String result = "";
		if( score >= 60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println(result);
	}

}
