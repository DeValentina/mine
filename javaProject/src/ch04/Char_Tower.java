package ch04;

public class Char_Tower {
	public static void main(String[] args) {
		int i,j;
		char a=65; //65는 아스키값으로 'A' 그외엔 불가농
		for (i=1; i<5; i++) {
			for (j=1; j<=1; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
	}
}
