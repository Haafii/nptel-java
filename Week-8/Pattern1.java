import java.util.*;

public class Pattern1 {
  public static void main(String[] args) {
    Scanner inr = new Scanner(System.in);
    int n = inr.nextInt();

    int F = 0, SUM = 0;
    for (int p = 1; p <= n; ++p, F = 0) {
      for (int space = 1; space <= n - p; ++space) {
        System.out.print("  ");
      }
      while (F != 2 * p - 1) {
        System.out.print("* ");
        SUM += 1;
        ++F;
      }
      System.out.println();
    }
    System.out.print(SUM);
  }
}