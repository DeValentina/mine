package ch05;

public class ArrayIf {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		if (arr !=null) { 
		//주소값 잃어버리는 경우, arr이 주소변지가 null아닌 조건 하
			for (int i=0; i<10; i++) {
			System.out.print(arr[i]);
			}
		}
	}
}
