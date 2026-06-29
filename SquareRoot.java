import java.util.Arrays;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int size=sc.nextInt();
        int[] array=new int[size];
         System.out.print("Enter the elements into an array:");
        for(int i=0;i<=size-1;i++){
            array[i]=sc.nextInt();
        }
         System.out.println();
        int[] square=new int[size];
        int i=0;
        for(int nums:array){
            square[i]=nums*nums;
            i++;
        }
        System.out.print("Given Array:[");
        for(int nums:array){
            System.out.print(" "+nums);
        }
        System.out.print("]");
        System.out.println();
         System.out.print("Square of given array in Ascending order[:");
         Arrays.sort(square);
         for(int nums:square){
          System.out.print(" "+nums);
         }
         System.out.println("]");
        
    }
}
