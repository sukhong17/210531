package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;
import vo.UserVO;

public class UserDAO {
	
	private Connection con = null;
    private PreparedStatement ps = null;
 
    
    public void register(UserVO vo) {
       String sql = "insert into register(id, name, password, tel, level, email) values (?,?,?,?,?,?)";
       try {
    	   System.out.println("sql");
          con = JDBCUtil.getConnection();
          ps = con.prepareStatement(sql);
          ps.setNString(1, vo.getId());
          ps.setNString(2, vo.getName());
          ps.setNString(3, vo.getPassword());
          ps.setNString(4, vo.getTel());
          ps.setInt(5, vo.getLevel());
          ps.setNString(6, vo.getEmail());
          ps.executeUpdate();
       } catch (Exception e) {
          e.printStackTrace();
       } finally {
          JDBCUtil.close(con, ps, null);
       }
    }
    
    public UserVO login(String id, String password) {
    	
    	UserVO vo = null;
    	
    	String sql = "select * from register where id=? and password=?";
    	
    	ResultSet rs = null;
    	
    	try {
            con = JDBCUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setNString(1, id);
            ps.setNString(2, password);
            
            rs=ps.executeQuery();
            
            while(rs.next()) {
            	vo = new UserVO();
            	vo.setId(rs.getNString("id"));
            	vo.setName(rs.getNString("name"));
            	vo.setPassword(rs.getNString("password"));
            }
    	}catch (Exception e) {
            e.printStackTrace();
        } finally {
           JDBCUtil.close(con, ps, rs);
        }
    	return vo;
    }

}
