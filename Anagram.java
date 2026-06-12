import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string :");
        String s=sc.nextLine();
        System.out.println("Enter the second string:");
        String  c=sc.nextLine();
        char[] a=s.toCharArray();
        char[] b=c.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result=Arrays.equals(a,b);
        System.out.println( result);
    }
}