package jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import jdbc.DB;

public class MemberInsert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn = DB.oraConn();
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디 : ");
			String userid=scan.next();
			System.out.println("비밀번호: ");
			String passwd=scan.next();
			System.out.println("이름 : ");
			String name=scan.next();
			scan.close();
			String sql="insert into member (userid, password, name) "
					+ "(?,?,?)";
			pstmt = conn.prepareStatement(sql);//변수를 파라미터
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			pstmt.setString(3, name);//3번째 물음표에 대한 값
			pstmt.executeUpdate();//insert,delete,update문
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
	
		}finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
}
}
