package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//inputstream : 1바이트 단위로 읽음
//inputstreamreader : 문자 단위 (2바이트)로 읽음
public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		InputStream is = System.in; //1byte처리 스트림
		InputStreamReader isr = new InputStreamReader(is);//2byte
//		new InputStreamReader(inputstream) 처리해야ㅑ함
		System.out.println("한글자를 입력하세요 : ");
		try {
			int code = isr.read(); //글자의 코드값
			System.out.println("code : "+code);
			char ch = (char) code;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
