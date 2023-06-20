import java.io.*;

public class Question2 {
  public static void main(String args[]) {
    try {
      InputStreamReader xyz = new InputStreamReader(System.in);
      BufferedReader bc = new BufferedReader(xyz);
      String number = bc.readLine();
      int noo = Integer.parseInt(number);
      System.out.print(noo * noo);
    } catch (Exception e) {
      System.out.print("Please enter valid data");
    }

  }
}