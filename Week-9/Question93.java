import java.util.Scanner;

public class Question93 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char matrix402[][] = new char[5][5];

    for (int LL = 0; LL < 5; LL++) {
      String input = sc.nextLine();
      char seq[] = input.toCharArray();
      if (seq.length == 5) {
        for (int i = 0; i < 5; i++) {
          matrix402[LL][i] = seq[i];
        }
      } else {
        System.out.print("Wrong Input!");
        System.exit(0);
      }
    }

    char tran[][] = new char[5][5];
    String outer[] = { "00", "10", "20", "30",
        "40", "41", "42", "43",
        "44", "34", "24", "14",
        "04", "03", "02", "01" };

    String inner[] = { "11", "21", "31", "32",
        "33", "23", "13", "12" };

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {

        for (int k = 0; k < outer.length; k++) {
          char indices[] = outer[k].toCharArray();
          int a = Integer.parseInt(String.valueOf(indices[0]));
          int b = Integer.parseInt(String.valueOf(indices[1]));
          if (a == i && b == j) {
            if (k == 15) {
              k = 1;
            } else if (k == 14) {
              k = 0;
            } else {
              k += 2;
            }
            indices = outer[k].toCharArray();
            a = Integer.parseInt(String.valueOf(indices[0]));
            b = Integer.parseInt(String.valueOf(indices[1]));
            tran[a][b] = matrix402[i][j];
            break;
          }
        }

        for (int k = 0; k < inner.length; k++) {
          char indices[] = inner[k].toCharArray();
          int a = Integer.parseInt(String.valueOf(indices[0]));
          int b = Integer.parseInt(String.valueOf(indices[1]));
          if (a == i && b == j) {
            if (k == 7) {
              k = 0;
            } else {
              k += 1;
            }
            indices = inner[k].toCharArray();
            a = Integer.parseInt(String.valueOf(indices[0]));
            b = Integer.parseInt(String.valueOf(indices[1]));
            tran[a][b] = matrix402[i][j];
            break;
          }
        }

        tran[2][2] = matrix402[2][2];
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(tran[i][j]);
      }
      System.out.println();
    }

  } // The main() method ends here
} // The main class ends here