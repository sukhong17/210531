package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.JDBCUtil;
import vo.BoardVO;
import vo.UserVO;

public class BoardDAO {

	
	
	private Connection con = null;
    private PreparedStatement ps = null;
 
    
    public void write(BoardVO vo) {
       String sql = "insert into mvc2board(id, title, content) values (?,?,?)";
       try {
          con = JDBCUtil.getConnection();
          ps = con.prepareStatement(sql);
          ps.setNString(1, vo.getId());
          ps.setNString(2, vo.getTitle());
          ps.setNString(3, vo.getContent());
          ps.executeUpdate();
       } catch (Exception e) {
          e.printStackTrace();
       } finally {
          JDBCUtil.close(con, ps, null);
       }
    }
}
