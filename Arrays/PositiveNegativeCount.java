package Arrays;
import java.util.Scanner;
public class PositiveNegativeCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int size =sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the value of arrays:");
        for(int i=0;i<=size-1;i++){
            array[i]=sc.nextInt();

        }
        int positive_count=0;
        int negative_count=0;
        for(int num:array){
            if(num>=0){
                positive_count+=1;
            }
            else{
                negative_count+=1;
            }
        }
        System.out.println("No.of Positive numbers are :"+positive_count);
        System.out.println("No.of Negative numbers are :"+negative_count);

    }
    
}
