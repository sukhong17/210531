package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
   
   public static Connection getConnection() {
      // TODO Auto-generated method stub
      Connection con = null;
      
      Properties p = new Properties();
      
      try {
         
      p.load(new FileInputStream("C:/minjava/dbinfo.txt"));
      
      String driver = p.getProperty("_driver");
      String url = p.getProperty("_url");
      String user = p.getProperty("_user");
      String pw = p.getProperty("_pw");
      
      Class.forName(driver);
      
      con = DriverManager.getConnection(url, user, pw);
      
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch(IOException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      return con;
   }
   
   public static void close(Connection con, PreparedStatement psmt, ResultSet rs) {
      
      try {
         if(con != null) con.close();
         if(psmt != null) psmt.close();
         if(rs != null) rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
   }
}