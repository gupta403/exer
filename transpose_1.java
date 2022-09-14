import java.util.*;
public class transpose_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int colm = sc.nextInt();
        int[][]trans= new int [row][colm];
        for(int i =0;i<row;i++){
            for(int j = 0;j<colm;j++){
                trans[i][j]= sc.nextInt();
            }
        }
        for(int j =0;j<row;j++) {
            for (int i = 0; i < colm; i++) {
                // trans[j][i]= sc.nextInt();
                System.out.print(trans[i][j] + "");//here I use row and colm interchange
            }

            System.out.println();
        }


    }
}
