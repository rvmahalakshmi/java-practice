package Arrays;
import java.util.Scanner;
public class  ReverseArray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int size =sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the value of arrays:");
        for(int i=0;i<=size-1;i++){
            array[i]=sc.nextInt();
        }
        int[] reverse_array=new int[size];
        for(int i=size-1;i>=0;i--){
            for(int j=0;j<=size-1;j++){
            reverse_array[j]+=array[i];

        }
    }
    System.out.print(" Original Array:[");
    for(int i=0;i<=size-1;i++){
         System.out.print(" "+array[i]);
    }
    System.out.print(" ]");
    System.out.println();
     System.out.print(" Reversed array:[");
    for(int i=0;i<=size-1;i++){
         System.out.print(" "+array[i]);
    }
    System.out.print(" ]");
}
}
