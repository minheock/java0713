package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.management.Query;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class jdbcUpdate {
	public static void main(String[] args) {
		// db와 연결
		Connection connection = null;
		// SQL 명령
		PreparedStatement ps = null;
		// 쿼리실행 결과
		ResultSet rs = null;
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("등록 실패");
			System.exit(0);
		} // 포트 디비명
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "java";
		String db_pw = "oracle";
		try {// 접속
			connection = DriverManager.getConnection(url, db_id, db_pw);// close를 안시켜주면 셀렉트만 쓸땐 괜찮지만
																		// 무한루프 문제가 생길수 있음
			System.out.println("커넥션 성공");
			StringBuffer query = new StringBuffer();
			query.append("UPDATE tb_user");
			query.append(" SET user_nm = ?"); //문자가 붙어서 나오기때문에 띄어쓰기 중요.
			query.append(" WHERE user_id = ?");		
			ps = connection.prepareStatement(query.toString());
			int idx = 1;
			ps.setString(idx++, "팽준");
			ps.setString(idx++, "lee001");
			int cnt = ps.executeUpdate(); // 쿼리문 실행 cnt <-- insert 건수 리턴
			if (cnt > 0) {
				System.out.println(cnt + "행이 삽입 되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("커넥션 오류 계정정보를 확인하세요");
		} finally {
			// connection 객체를 꼭 닫아야함.
			// 안닫으면 계속 쌓여서 에러 발생
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
