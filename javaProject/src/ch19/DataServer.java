package ch19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataServer {
	public static void main(String[] args) throws Exception{
		//try~with
		try(ServerSocket ss = new ServerSocket(8000)) {
			System.out.println("서비스가 시작되었습니다.");
			while(true) {
				//accept : 클라이언트가 접속할 때까지 대기상태
				//접속하면 소켓 연결(논리적 회선 연결)
				Socket socket = ss.accept();
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
				//날짜포맷 yyyy년도 MM월 dd일 24시간 HH시 mm분 ss초
				String str= sdf.format(new Date());
				out.print(str);//클라이언트에게 데이터 전송
				socket.close();//소켓종료
			}
		}catch (Exception e) {
			
		}
	}
}
