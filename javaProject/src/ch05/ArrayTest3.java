package ch05;

public class ArrayTest3 {
	public static void main(String[] args) {
		int [] numbers = {10,20,30};
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		//for~each문(향상된 for)
		for(int value : numbers) { 
			System.out.println(value);
			
		}
	}
}
