package Variables;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.next();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the height:");
        float height=sc.nextFloat();
        System.out.println("Enter the gender:");
        String gender=sc.next();
        System.out.println("-------DETAILS OF A PERSON--------");
        System.out.println("My name is "+name);
        System.out.println("I am  "+age+" years old.");
        System.out.println("My height is "+height+ "feet.");
        System.out.println("Gender : "+gender);
    }
    
}
