import java.util.*;

public class Pattern4 {
  public static void main(String[] args) {
    Scanner inr = new Scanner(System.in);
    int l = inr.nextInt();
    // Add the necessary code in the below space

    int UL0 = 0;
    int ll0 = 0;

    if (l % 2 != 0) {
      UL0 = (l / 2) + 1;
      ll0 = l - UL0;

      for (int p = 1; p <= UL0; p++) {

        for (int s = 1; s <= (UL0 - p); s++) {
          System.out.print(" ");
        }

        for (int j = 1; j <= p; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }

      int c = ll0;
      for (int p = 1; p <= ll0; p++) {

        for (int s = c; s < ll0; s++) {
          System.out.print(" ");
        }

        for (int q = 1; q - 1 <= ll0 - p; q++) {
          System.out.print(" *");
        }
        c--;
        System.out.println();
      }
    } else {
      System.out.print("Invalid line number");
    }

  }
}