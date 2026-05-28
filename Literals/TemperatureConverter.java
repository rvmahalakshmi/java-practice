package Literals;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celsius form:");
        if(sc.hasNextInt()){
            int celsius=sc.nextInt();
            double fahrenheit=((9.0)/5)*celsius + 32;
            System.out.println("temperature is : "+fahrenheit);
        }
        else{
            System.out.println("---Invalid input----");
        }

    }
}
