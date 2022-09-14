//Write a function which takes in 2 numbers and returns the greater of those
//two
import java.util.Scanner;
public class eg2 {
    public static void great(int a, int b){
        if(a>b){
            System.out.println(a+""+"is a greater number");
        }
        else{
            System.out.println(b+"is a greater number");
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc_1 = new Scanner(System.in);
        int b = sc_1.nextInt();
        great(a,b);
    }



}
