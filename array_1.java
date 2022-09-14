import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int q = obj.nextInt();
        for(int x=0;x<q;x++){
            int a = obj.nextInt();
            int b = obj.nextInt();
            int n = obj.nextInt();
            int sum = a;
            for(int i=0;i<n;i++){
                sum += Math.pow(2,i)*b;
                System.out.print(sum+" ");
            }
            System.out.println();
        }

    }
}
