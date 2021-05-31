package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    public List<BoardVO> boardList() {
    	List<BoardVO> list = new ArrayList<BoardVO>();
    	String sql = "select * from mvc2board order by bno desc";
    	ResultSet rs = null;
    	try {
            con = JDBCUtil.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            	BoardVO vo = new BoardVO();
            	vo.setBno(rs.getInt("bno"));
            	vo.setContent(rs.getNString("content"));
            	vo.setId(rs.getNString("id"));
            	vo.setTitle(rs.getNString("title"));
            	vo.setWriteDate(rs.getTimestamp("writeDate"));
            	
            	list.add(vo);
            	//list.get(0) = vo  ... list.get(10) = vo..
            }

    	} catch (Exception e) {
            e.printStackTrace();
         } finally {
            
			JDBCUtil.close(con, ps, rs);
         }
    	return list;
    }
    
    public BoardVO boardRead(int bno) {
        String sql = "select * from mvc2board where bno=?";
        
        ResultSet rs = null;
        BoardVO vo= new BoardVO();
        try {
           con = JDBCUtil.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, bno);
           rs = ps.executeQuery();
           while(rs.next()) {
        	   vo.setBno(rs.getInt("bno"));
        	   vo.setId(rs.getNString("id"));
        	   vo.setTitle(rs.getNString("title"));
        	   vo.setContent(rs.getNString("content"));
           }
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
           JDBCUtil.close(con, ps, rs);
        }
        return vo;
    }
    
    
}
