import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i;
        for(i=0;i<n*2;i+=2){
            if(i%3 == 0)
                sum += i;
        }
        System.out.print(sum);
    }
}