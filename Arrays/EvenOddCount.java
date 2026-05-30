package Arrays;

import java.util.Scanner;

public class EvenOddCount {
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
        System.out.println(" ]");
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<=size-1;i++){
            if((array[i]&1)==0){
                evencount+=1;
            }
            else{
                oddcount+=1;
            }
        }
        System.out.println(" Even number consist in array is :"+evencount);
        System.out.println(" Odd number consist in array is :"+oddcount);
        
    }
    
}
