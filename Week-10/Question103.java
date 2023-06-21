import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class Question103 {
  public static void main(String args[]) {
    try {
      Connection conn = null;
      Statement stmt = null;
      String DB_URL456 = "jdbc:sqlite:/tempfs/db";
      System.setProperty("org.sqlite.tmpdir", "/tempfs");
      conn = DriverManager.getConnection(DB_URL456);
      conn.close();
      System.out.print(conn.isClosed());
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
