package Arrays;
import java.util.Scanner;
public class MaximumandMinmumDifference {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int size =sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the value of arrays:");
        for(int i=0;i<=size-1;i++){
            array[i]=sc.nextInt();

        }
        int largest=array[0];
        int smallest=array[0];
        for(int i=1;i<=size-1;i++){
            if(array[i]>=largest){
                  largest=array[i];
            }
            if(array[i]<=smallest){
               smallest=array[i];
            }
        }
        System.out.print("Input:");
        for(int i=0;i<=size-1;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.println("Largest : "+largest);
        System.out.println("Smallest : "+smallest);
        System.out.println("Difference : "+(largest-smallest));

    }
}
