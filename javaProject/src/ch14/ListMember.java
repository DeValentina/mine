package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//Arraylist<클래스객체> - <object>대신 만들어놓은 
		//member객체를 제너릭하면 member에서 쓰이는 모든 자료형 처리 준비 가능
		List<Member> list = new ArrayList<>();
		
		Member m1=new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02=1234-5678");
		m1.setEmail("kim@naver.com");
		
		//1)방법
		//객체 자료를 arraylist에 담는 방법
		list.add(m1); //Arraylist에 member객체를 1개 추가
		System.out.println(list.size());
		
		
		//2)방법
		Member m2=new Member("hong", "1234", "홍길동", "010-1234-5678", "hong@nate.com");
		list.add(m2);//Arraylist에 member객체를 또 1개추가
		System.out.println(list.size());
		
		//3)방법
		list.add(new Member("choi", null, null, null, null));
		System.out.println(list.size());
		
		System.out.println("이름\t아이디\t비번\t전화\t이메일");
		for(int i=0; i<list.size(); i++) {
			Member m=list.get(i);//여기서 m은 arraylist의 각 데이터를 가리킬 임시 참조변수
		}
		
	}
}
