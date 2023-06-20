import java.util.*;

public class Question5 {
  public static void main(String[] args) {
    try {
      String s1 = "NPTELJAVA";
      Scanner inr = new Scanner(System.in);
      int n = inr.nextInt();
      char c = 'a';
      byte[] beee = s1.getBytes();

      byte B1 = (byte) c;
      beee[n] = B1;
      System.out.print(new String(beee));
    }

    catch (Exception e) {
      System.out.println("exception occur");
    }
  }
}