import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number for table:");
        int tablenumber=sc.nextInt();
        System.out.println("Enter the end of the table:");
        int endnum=sc.nextInt();
        for(int i=1;i<=endnum;i++){
            System.out.println(tablenumber+ "x" +i+ "=" +tablenumber*i);
        }

    }
}