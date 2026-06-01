package Arrays;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
          boolean found=true;
        System.out.println("Enter the Size of the array:");
        int size =sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the value of arrays:");
        for(int i=0;i<=size-1;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int search_element=sc.nextInt();
        for( int num:array){
            if(num==search_element){
                 found=true;
                break;
            }
            else{
                found=false;
            }
        }
        if(found==true){
            System.out.println("Element is found");
        }
        else{
            System.out.println("Element is not found");
        }
            }
}
