import java.util.*;

public class Pattern3 {
  public static void main(String[] args) {
    Scanner inr = new Scanner(System.in);
    int n = inr.nextInt();

    int zx = 1, sum = 0;
    for (int c = 1; c <= n; ++c, zx = 1) {
      for (int space = 1; space <= n - c; ++space) {
        System.out.print("  ");
      }
      while (zx <= 2 * c - 1) {
        System.out.print(zx + " ");
        sum = sum + zx;
        ++zx;
      }
      System.out.println();
    }
    System.out.println(sum);
  }
}