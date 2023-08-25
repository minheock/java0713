package ch14_jdbc_conn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_conn.model.BbsVO;
import ch14_jdbc_conn.model.UserVO;

// DB 에 사용되는 부분을 작성
public class UserDao {
	private static UserDao instance = new UserDao();
	public static UserDao getInstance() {
		return instance;
	}
	
	// 회원 조회 로그인 관련
	public UserVO loginUser(Connection conn, String id) throws SQLException {
		UserVO userVO = new UserVO();
		StringBuffer query = new StringBuffer();
		query.append(" SELECT user_id");
		query.append("     ,  user_nm");
		query.append("     ,  user_pw");
		query.append("     ,  user_mileage");
		query.append(" FROM tb_user");
		query.append(" WHERE user_id =?");
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setString(1,id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			userVO.setUserId(rs.getString("user_id"));
			userVO.setUserNm(rs.getString("user_nm"));
			userVO.setUserPw(rs.getString("user_pw"));
			userVO.setUserMileage(rs.getInt("user_mileage"));
		}
		if(ps != null)ps.close();
		if(rs != null)ps.close();
		return userVO;
	}
	// 회원가입 (INSERT)
	public int insertUser(Connection conn, UserVO user) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO tb_user (user_id, user_nm, user_pw, create_dt)");
		query.append(" VALUES (?,?,?, SYSDATE)");
		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		ps.setString(idx++, user.getUserId());
		ps.setString(idx++, user.getUserPw());
		ps.setString(idx++, user.getUserNm());
		int cnt = ps.executeUpdate();
		if(ps!=null)ps.close();
		return cnt;
	}
	
	
	// 전체 게시글 목록 조회
	public ArrayList<BbsVO> bbsList(Connection conn) throws SQLException{
		
		ArrayList<BbsVO> bbsList = new ArrayList<BbsVO>();
		StringBuffer query = new StringBuffer();
		
		query.append(" SELECT ROWNUM as rnum ");
		query.append("      ,  count(*) OVER() as all_cnt ");
		query.append("      ,  a.bbs_no as bbs_no ");
		query.append("      ,  a.bbs_title as bbs_title ");
		query.append("      ,  a.author_id as author_id ");
		query.append("      ,  a.update_dt as update_dt ");
		query.append("  from ( ");
		query.append("  SELECT bbs_no ");
		query.append("      ,  bbs_title ");
		query.append("      ,  author_id ");
		query.append("      ,  TO_CHAR(update_dt, 'YYMMDD HH24:MI:SS') AS update_dt ");
		query.append("  FROM bbs ");
		query.append("  WHERE parent_no IS NULL ");
		query.append("  ORDER BY update_dt DESC ");
		query.append("  )a ");
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			BbsVO tem = new BbsVO();
			tem.setBbsNo(rs.getInt("bbs_no"));
	//		tem.setParentNo(rs.getInt("parent_no"));
	//		tem.setBbsContent(rs.getString("bbs_content"));
			tem.setBbsTitle(rs.getString("bbs_title"));
			tem.setAuthorId(rs.getString("author_id"));
	//		tem.setCreate_dt(rs.getString("create_dt"));
			tem.setUpdate_dt(rs.getString("update_dt"));
			bbsList.add(tem);
		}
		if(ps != null)ps.close();
		if(rs != null)ps.close();
		return bbsList;
	}
	
	
}

