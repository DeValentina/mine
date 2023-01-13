package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderWhile {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		int c;
		
		try {
			System.out.print("내용을 입력하세요 : ");
			c = isr.read();
			
			while (c != 13) {//엔터키(13)를 입력할 때까지 반복
				System.out.println(c+"==>"+(char)c);
				c = System.in.read();
				
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
