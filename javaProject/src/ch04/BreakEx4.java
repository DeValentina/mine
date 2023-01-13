package ch04;

public class BreakEx4 {
	public static void main(String[] args) {
	
	int n=1;
	while(n<9) {
		if(n==8) break;
		System.out.println(n+" Hello World");
		n++;
		}
	System.out.println("n값이 8이며 while문 빠져나옴");
	}
}

