package Arrays;
import java.util.Scanner;
public class SumandAverage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<=size-1;i++){
            System.out.println("Enter the valu of "+(i+1) + " :");
            array[i]=sc.nextInt();
        }
        System.out.print ("Given  one dimensional Array :");
        System.out.print("[");
        for(int i=0;i<=size-1;i++){
            System.out.print(" "+array[i]);
        }
        int sum=0;
        System.out.print("]");
        System.out.println();
        for(int i=0;i<=size-1;i++){
            sum+=i;
        }
        int average=sum/size;
        System.out.println("Sum of the given array : "+sum);
        System.out.println("Average of the given array: "+average);
    }
    
}
