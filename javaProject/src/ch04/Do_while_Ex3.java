package ch04;

public class Do_while_Ex3 {
	public static void main(String[] args) {
		int i=1;
		int num=100;
		int sum=0;
		do {
			sum = sum + 1;
			i++;
		}while (i<=num);
		System.out.println("1~"+num+"까지의 합계 : "+sum);
	}
}
