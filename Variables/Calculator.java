package Variables;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int bill=0;
        while(true){
        System.out.println("----Avaliable Items-----");
        System.out.println("1)Idli:20rs");
        System.out.println("2)Dosa:15rs");
        System.out.println("3)Vada:30rs");
         System.out.println("5)Enough");
        System.out.println("enter option:");
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter no.of plates:");
                int plates =sc.nextInt();
                bill=20*plates + bill;
                break;
            case 2:
                System.out.println("Enter no.of dosa:");
                int dosa=sc.nextInt();
                bill=15*dosa+bill+bill;
                break;
            case 3:
                System.out.println("Enter no.of vada plates:");
                int vada=sc.nextInt();
                bill=30*vada+bill;
                break;
            case 4:
                System.out.println("Enter no.of puri plates:");
                int puri=sc.nextInt();
                bill=15*puri+bill;
                break;
            case 5:
                 System.out.println(" your total bill amount is "+bill);
                System.out.println("Thank u for coming:");
                sc.close();
                return;

            default:
                System.out.println("Invalid option"); 
        }  
        }
        
    }
}
