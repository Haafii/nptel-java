import java.net.*;

public class Question2 {
  public static void main(String[] args) {
    try {
      URL myfUrl = new URL("http://www.Nptel.com/java-tutorial");
      System.out.println("Protocol: " + myfUrl.getProtocol());
      System.out.print("Host Name: " + myfUrl.getHost());

    } catch (Exception e) {
      System.out.print(e);
    }
  }
}
