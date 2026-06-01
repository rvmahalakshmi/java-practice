package Arrays;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int size =sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the value of arrays:");
        for(int i=0;i<=size-1;i++){
            array[i]=sc.nextInt();
        }
        int temp;
        int i=0;
        int j=i+1;
        while(i<array.length-1){
             while(j<array.length){
                if(array[i]>=array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[i]=temp;
                }
                j++;
             }
             i++;
        }
        System.out.println("second largest: "+array[1]);   
         sc.close();   
        }

    }
    

