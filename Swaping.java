import java.util.*;
public class Swaping{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers for swaping");
        System.out.println("Enter first number:");
        int fnum=sc.nextInt();
        System.out.println("Enter second number:");
        int snum=sc.nextInt();
        System.out.println("-----Before Swaping------");
         System.out.println("First number:"+fnum+"\n Second number:"+snum);
        int extra =fnum;
        fnum=snum;
        snum=extra;
        System.out.println("-----After Swaping-----");
        System.out.println("First number:"+fnum+"\n Second number:"+snum);

    }
}