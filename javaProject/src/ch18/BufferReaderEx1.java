package ch18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//buffered계열(reader계열(stream))) 형태로 구성
		
		System.out.println("문자열 한줄을 입력하세요 : ");
		String line;
		
		try {
			line = br.readLine();//문자열
			System.out.println("입력한 문자열 : "+line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
