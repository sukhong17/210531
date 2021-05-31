package util;

import java.sql.Connection;

public class Test {

   public static void main(String[] args) {
            System.out.println("Connection test");
            Connection con = JDBCUtil.getConnection();
            System.out.println(con + "con");
            JDBCUtil.close(con, null, null);
   }

}