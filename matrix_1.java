import java.util.*;
public class matrix_1 {
    static public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int[][]my_mat= new int[row][colm];
        for(int i =0;i<row;i++){
            for(int j = 0;j<colm;j++){
                my_mat[i][j]= sc.nextInt();
            }

        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<colm; j++) {
                System.out.print(my_mat[i][j]+" ");
            }
            System.out.println();
        }

        int x = sc.nextInt();
        for(int i =0;i<row;i++) {
            for (int j = 0; j < colm; j++) {
                if(my_mat[i][j]==x){
                    System.out.println("x found at location (" + i + ", " + j + ")");

                }
            }
        }
    }
}
