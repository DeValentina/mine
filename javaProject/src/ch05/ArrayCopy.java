package ch05;

import java.util.Arrays;

import javax.management.BadStringOperationException;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] list= {10,20,30,40,50};
		System.out.println(list);
		//배열복사 방법 2가지
		//얕은 복사 : 배열의 주소값 공유해서 복사
		int [] numbers = list;
		System.out.println(numbers);
		for(int i=0; i<numbers.length; i++ ) {
			System.out.println(numbers[i]);
		}
		
		//깊은 복사 : 새 배열을 만들어서 데이터 자체만 복사
		int[] list_copy=Arrays.copyOf(list, list.length);
		System.out.println(list_copy);
		for(int value : list_copy) {
			System.out.println(value);
		}
	}
}
