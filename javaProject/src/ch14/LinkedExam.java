package ch14;

import java.util.LinkedList;

public class LinkedExam {
	public static void main(String[] args) {
		//큐구조 : FIFO
		String[] fruits = {"사과", "배", "포도", "딸기", "수박"};
		LinkedList<String> list = new LinkedList<>();
		for(String str : fruits) {
			list.offer(str); //큐구조 자료 입력 offer
		}
		String str="";
		while((str=(String)list.poll()) !=null) {
		//poll()는 자료형이 미정(E)이기 때문에 (String)처럼 자료형 적어주어야 한다
		//poll()한값을 str에 대입, str은 boolean 아니기 때문에 전체로 묶어야 함
			System.out.println(str + "삭제되었습니다.");
			
		}
		
	}
}
