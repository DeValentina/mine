package ch19;

import java.net.URL;

public class UrlInfo {
	public static void main(String[] args) {
		try {
			//new URL주소 url문자열을 url클래스 형식으로 변환
			URL url = new URL("https://www.hellodd.com/news/articleView.html?idxno=99239");
			System.out.println("프로토콜 : "+url.getProtocol());
			System.out.println("포트 : "+url.getPort());
			System.out.println("호스트 : "+url.getHost());
			System.out.println("파일 : "+url.getFile());
			System.out.println("기타 : "+url.toExternalForm());
			
		} catch (Exception e) {
		}
	}
}
