package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	public static Connection oraConn() {
		Connection conn=null;
		try {
			FileInputStream fis = new FileInputStream("C:\\driver\\oracle.prop");
			//key & value를 세트로 저장
			Properties prop = new Properties();
			prop.load(fis);
			String url = prop.getProperty("url");
			String id=prop.getProperty("id");
			String password=prop.getProperty("password");
			//DB접속
			conn = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
		}
		
		return conn;//누가 호출해야 의미가 있다
	}
}