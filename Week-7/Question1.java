import java.util.*;

public class Question1 {
  public static void main(String[] args) {

    int k, numb = 0, sum = 0;
    Scanner sc = new Scanner(System.in);
    for (k = 0; k < 3; k++) {
      numb = sc.nextInt();

      sum = sum + numb;

    }

    System.out.println(sum);
  }
}