package ch18;

import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;//printstream객체을 부모타입인 outputstream받아 처리
		//outputstream 1byte처리 스트림이다. 한글x
		try {
			os.write(97);//a
			os.write(98);//b
			os.write(99);//c
			os.flush();//flush메소드를 써야 출력까지 됨
		} catch (Exception e) {
		}
	}
}
