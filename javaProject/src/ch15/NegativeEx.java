package ch15;

public class NegativeEx {
	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[3]=20; //배열인덱스는 0~2
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			int arr[] = new int[-10];
			//배열의 크기로 음수를 제시할 때 발생되는 예외 negativearray~
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
