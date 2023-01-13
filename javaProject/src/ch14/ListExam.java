package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {
//		ArrayList<Object> list = new ArrayList<>();
		//대신에 다형성(아래)
		List<Object> list = new ArrayList<>();
		//실무용 코드 - 다형성
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(2,4); // (인덱스, 추가할 값)
		list.remove(0);
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
	}
}
