package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	public static void main(String[] args) {
//		Set<String> hs = new HashSet<>();
		Set<String> hs = new TreeSet<>();
		//treeset 정렬까지는 O
		//입력과정 중에 set은 중복값 허용X
		
		//set은 중복값 허용하지 않음
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea");//중복값은 처리X
		System.out.println(hs);
		for(String str : hs) {
			System.out.println(str);
		}//iterator처리를 위한 클래스
		System.out.println("================");
		Iterator<String> it =hs.iterator();
		while (it.hasNext()) {//다음 요소가 있으면 true
			System.out.println(it.next());
			//다음요소를 꺼냄
		}
	}
}
