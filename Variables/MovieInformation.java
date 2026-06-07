package Variables;
import java.util.Scanner;
public class MovieInformation {
    char category;
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MovieInformation obj=new MovieInformation();
        System.out.println("Enter the moviename:");
        String moviename=sc.next();
        System.out.println("Enter the Released year:");
        int releaseyear=sc.nextInt();
        System.out.println("Enter the rating(1 to 10):");
        double rating=sc.nextDouble();
        if(rating >=1 && rating<=4){
            obj.category='C';

        }
        else if(rating>=5 && rating<=7){
            obj.category='B';
        }
        else if(rating>=8 && rating<=10){
            obj.category='A';
        }
        else{
             System.out.println("Invalid rating");
        }
         System.out.println("Movie name: "+moviename);
          System.out.println("Released year :"+releaseyear);
           System.out.println("Rating : "+rating);
            System.out.println("Category : "+obj.category);

        }
    
}
