import java.util.Scanner;

public class Exercise1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp,remainder,final_res;
        final_res =0;
        temp = n;
        while(temp!=0){
            remainder = temp % 10; 
            final_res = final_res + (remainder * remainder * remainder);
            temp /= 10;
        }
        if(final_res == n)
            result = 1;
        else
            result =0;
        System.out.print(result);
    }
}