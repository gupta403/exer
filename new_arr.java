import java.util.Scanner;
//to find a number in tha array
public class new_arr {
    static public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]my_new = new int[n];
        for(int i = 0;i<n;i++){
            my_new[i] = sc.nextInt();

            //System.out.println(my_new[0]);
        }
        int x = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(my_new[i]==x){
                System.out.println(i);
            }
        }
    }
}
