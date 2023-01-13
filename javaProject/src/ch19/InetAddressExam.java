package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;
//네트워크 관련 객체는.net.으로 구성
public class InetAddressExam {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("google.com");
			System.out.println(address); //호스트이름과 ip주소값
			System.out.println(address.getHostName());//호스트이름(도메인 이름)
			System.out.println(address.getHostAddress());//ip주소값만 얻기
		} catch (UnknownHostException e) {//예외 사항 발생
			
			e.printStackTrace();
		}
		
	}
}
