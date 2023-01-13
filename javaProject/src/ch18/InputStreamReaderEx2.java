package ch18;

import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx2 {
	public static void main(String[] args) {
		int var = 0;
		
		Reader input = new InputStreamReader(System.in);
		System.out.println("입력하세요 : ");
		try {
			while(true) {
				var = input.read();
				if(var == 13) break; //엔터키가 들어오면 조욜
				System.out.println(var+"==>"+(char)var);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
