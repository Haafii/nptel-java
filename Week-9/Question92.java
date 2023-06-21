import java.util.Scanner;

public class Question92 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char mypattern[] = input.toCharArray();
    int f = 0;

    for (int ip = 0; ip < mypattern.length; ip++) {
      mypattern[ip] = gui_map(mypattern[ip]);
    }

    double operand1 = 0.0;
    String o1 = "";
    double operand2 = 0.0;
    String o2 = "";
    double ans = 0.0;

    outerloop: for (int i = 0; i < mypattern.length; i++) {
      int r = 0;
      if (mypattern[i] == '+' || mypattern[i] == '-' || mypattern[i] == '/' || mypattern[i] == 'X'
          || mypattern[i] == '=') {
        for (int j = 0; j < i; j++) {
          o1 += Character.toString(mypattern[j]);
        }
        operand1 = Double.parseDouble(o1);
        for (int k = i + 1; k < mypattern.length; k++) {
          if (mypattern[k] == '=') {
            f = 1;
            operand2 = Double.parseDouble(o2);
            if (mypattern[i] == '+') {
              ans = operand1 + operand2;
            } else if (mypattern[i] == '-') {
              ans = operand1 - operand2;
            } else if (mypattern[i] == '/') {
              ans = operand1 / operand2;
            } else if (mypattern[i] == 'X') {
              ans = operand1 * operand2;
            }
            break outerloop;
          } else {
            o2 += Character.toString(mypattern[k]);
          }
        }
      }
    }

    if (f == 1)
      System.out.print(ans);
  }// The main() method ends here.

  // A method that takes a character as input and returns the corresponding GUI
  // character
  static char gui_map(char in) {
    char out = 'N';// N = Null/Empty
    char gm[][] = { { 'a', '.' }, { 'b', '0' }, { 'c', '=' }, { 'd', '+' }, { 'e', '1' }, { 'f', '2' }, { 'g', '3' },
        { 'h', '-' }, { 'i', '4' }, { 'j', '5' }, { 'k', '6' }, { 'l', 'X' }, { 'm', '7' }, { 'n', '8' }, { 'o', '9' },
        { 'p', '/' } };

    // Checking for maps
    for (int i = 0; i < gm.length; i++) {
      if (gm[i][0] == in) {
        out = gm[i][1];
        break;
      }
    }
    return out;
  }
}