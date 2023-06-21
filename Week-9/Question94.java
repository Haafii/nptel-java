import java.util.Scanner;

public class Question94 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char originalp[][] = new char[5][5];

    char reflectionn[][] = new char[5][5];

    for (int linez = 0; linez < 5; linez++) {
      String input = sc.nextLine();
      char seq[] = input.toCharArray();
      if (seq.length == 5) {
        for (int i = 0; i < 5; i++) {
          originalp[linez][i] = seq[i];
        }
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        reflectionn[i][j] = originalp[i][4 - j];
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(reflectionn[i][j]);
      }
      System.out.println();
    }
  } // The main() method ends here
} // The main class end