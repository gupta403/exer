import java.util.Scanner;

public class eg_1 {
    public static void odd(int n){
        int sum = 0;
        for(int i = 1;i<=n;i = i+2){
            sum = sum +i;



        }
        System.out.println(sum);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        odd(n);
    }
}
