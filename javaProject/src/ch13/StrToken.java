package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str="kim,20,180,55,서울,학생";
		
		String[] items=str.split(",");
		//콤마 기준으로 데이터 분리
		for(String s : items) {
			System.out.println(s);
		}
//		StringTokenizer는 string 객체의 split()등의 메소드들보다 더 다양한 메소드 제공
		StringTokenizer st = new StringTokenizer(str, ",");
		int cnt = st.countTokens(); //토근의 개수
		System.out.println("토큰의 갯수 : "+cnt);
		while (st.hasMoreTokens()) {
		//객체 안 토큰이 하나라도 존재하면 true 아님 false
			System.out.println(st.nextToken());//개체 안에 토큰하나를 가져와 반환
			
		}
		
	}
}
