package Arrays;
import java.util.Scanner;
public class TwoDimensionalmatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the no.of coulmns");
        int columns=sc.nextInt();
        int[][] array=new int[rows][columns];
        for(int i=0;i<=rows-1;i++){
            for(int j=0;j<=columns-1;j++){
                System.out.println("Enter the element of [" +i+"]["+j+"]");
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=rows-1;i++){
            System.out.print("[");
            for(int j=0;j<=columns-1;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.print(" ]");
            System.out.println();
        }

    }
    
    
}
