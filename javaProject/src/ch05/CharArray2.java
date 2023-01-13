package ch05;

public class CharArray2 {
	public static void main(String[] args) {
		char[] ch;
		ch = new char[4];
		System.out.println(ch);
		ch[0]='J';
		ch[1]='a';
		ch[2]='v';
		ch[3]='a';

		
		for (int i=0; i<ch.length; i++) {
			System.out.println(i+"번째 문자"+ch[i]);
		}
	
	}

}

