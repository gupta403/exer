import java.util.Scanner;
public class avrg {
    public static void avrge(int a,int b,int c){
        //System.out.println();
        double sum = a+b+c;
        double f = sum/3;
        System.out.println(f);



    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        Scanner sc_1 = new Scanner(System.in);
        int b  = sc_1.nextInt();
        Scanner sc_2 = new Scanner(System.in);
        int c  = sc_2.nextInt();
        avrge( a, b,c);

    }


}
