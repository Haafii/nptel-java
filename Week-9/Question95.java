import java.util.Scanner;

public class Question95 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char original00[][] = new char[5][5];

    for (int line7 = 0; line7 < 5; line7++) {
      String input = sc.nextLine();
      char seq[] = input.toCharArray();
      if (seq.length == 5) {
        for (int i = 0; i < 5; i++) {
          if (seq[i] == '0' || seq[i] == '1') {
            original00[line7][i] = seq[i];
            if (line7 == 4 && i == 4)
              flipflop(original00);
          } else {
            System.out.print("Only 0 and 1 supported.");
            break;
          }
        }
      } else {
        System.out.print("Invalid length");
        break;
      }

    }
  }

  static void flipflop(char[][] flip) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (flip[i][j] == '1')
          flip[i][j] = '0';
        else
          flip[i][j] = '1';
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(flip[i][j]);
      }
      System.out.println();
    }
  } // The main() ends here
} // The main class ends here