package Arrays;
import java.util.Scanner;
public class Rotatearray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements for the array:");
        for(int i=0;i<=size-1;i++){
           // System.out.println(" "+(i+1));
            array[i]=sc.nextInt();
        }
        System.out.print ("Given Array :");
        System.out.print("[");
        for(int i=0;i<=size-1;i++){
            System.out.print(" "+array[i]);
        }
        System.out.print(" ]");
        System.out.println();
        int left=0;
        int right=array.length-1;
        int n=array.length-1;
        while(left< right){
            int temp=array[left];
               array[left]=array[right];
               array[right]=temp;
               left++;
               right--;
        }
         System.out.print ("After rotation:");
        System.out.print("[");
        for(int i=0;i<=size-1;i++){
            System.out.print(" "+array[i]);
        }
        System.out.print(" ]");


    }
}
