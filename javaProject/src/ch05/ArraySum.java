package ch05;

public class ArraySum {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50}; //실무형
		int sum=0; //배열의 합계를 저장할 변수
		
		//for(int i=0; i<5; i++) {
		for(int i=0; i<num.length; i++) {
		//length 속성 쓰면 배열 데이터의 변화가 있더라도 즉각적 대응 가능
			sum = sum+ num[i];
		}
		System.out.println("합계 : " + sum);
	}
}
