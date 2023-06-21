import java.util.Scanner;

public class Question91 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine(); // Read as string, e.g., 5+6
    int i = 0;
    int j = 0;
    double ans = 0;

    char pattern60[] = input.toCharArray();

    for (int ab = 0; ab < pattern60.length; ab++) {
      if (pattern60[ab] == '+') {
        i = Integer.parseInt(input.substring(0, ab));
        j = Integer.parseInt(input.substring(ab + 1, pattern60.length));
        ans = (double) i + j;
      } else if (pattern60[ab] == '-') {
        i = Integer.parseInt(input.substring(0, ab));
        j = Integer.parseInt(input.substring(ab + 1, pattern60.length));
        ans = (double) i - j;
      } else if (pattern60[ab] == '/') {
        i = Integer.parseInt(input.substring(0, ab));
        j = Integer.parseInt(input.substring(ab + 1, pattern60.length));
        ans = (double) i / j;
      } else if (pattern60[ab] == '*') {
        i = Integer.parseInt(input.substring(0, ab));
        j = Integer.parseInt(input.substring(ab + 1, pattern60.length));
        ans = (double) i * j;
      }
    }

    System.out.print(input + " = " + Math.round(ans));

  }
}