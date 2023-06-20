import java.util.*;

public class Pattern5 {
  private static final Map<Integer, Integer> encode = new HashMap<Integer, Integer>();
  static {
    encode.put(0, 0x7E);
    encode.put(1, 0x30);
    encode.put(2, 0x6D);
    encode.put(3, 0x79);
    encode.put(4, 0x33);
    encode.put(5, 0x5B);
    encode.put(6, 0x5F);
    encode.put(7, 0x70);
    encode.put(8, 0x7F);
    encode.put(9, 0x7B);
  }

  public static void printDigit(int digit) {
    int cv = encode(digit);
    char[] b7 = String.format("%7s", Integer.toBinaryString(cv))
        .replace(' ', '0').toCharArray();

    lightSegment(b7[0] == '1', " _ \n", "   \n");
    lightSegment(b7[5] == '1', "|", " ");
    lightSegment(b7[6] == '1', "_", " ");
    lightSegment(b7[1] == '1', "|\n", " \n");
    lightSegment(b7[4] == '1', "|", " ");
    lightSegment(b7[3] == '1', "_", " ");
    lightSegment(b7[2] == '1', "|\n", " \n");
  }

  private static void lightSegment(boolean on, String onValue, String offValue) {
    System.out.print(on ? onValue : offValue);
    try {
      Thread.sleep(0);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static int encode(int digit) {
    return encode.containsKey(digit) ? encode.get(digit) : 0x00;
  }

  public static void main(String[] args) throws Exception {
    Scanner sck = new Scanner(System.in);
    int number = sck.nextInt();
    printDigit(number);
  }
}
