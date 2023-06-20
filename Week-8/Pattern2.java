import java.util.*;

public class Pattern2 {
  public static void main(String[] args) {
    Scanner inr = new Scanner(System.in);
    int l = inr.nextInt();

    int rt, b;
    int space = l - 1;

    for (rt = 0; rt < l; rt++) {

      for (b = 0; b < space; b++) {
        System.out.print(" ");
      }
      for (b = 0; b <= rt; b++) {
        System.out.print("* ");
      }

      System.out.print("\n");
      space--;
    }
  }
}