import java.io.*;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        int c = 0;
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            String s1 = br.readLine();
            for (int a6 = 0; a6 < s1.length(); a6++) {
                char str7 = s1.charAt(a6);
                if (str7 == 'e' || str7 == 'E' || str7 == 'a' || str7 == 'A' || str7 == 'i' || str7 == 'I'
                        || str7 == 'o' || str7 == 'O' || str7 == 'u' || str7 == 'U') {
                    c = c + 1;
                }
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}