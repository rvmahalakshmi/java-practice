package Literals;
import java.util.Scanner;
public class AsciiValueFinder {
    void check( char character){
        int ascii=character;
        if((ascii>=97&&ascii <123)||(ascii>=65 && ascii<91)){
            System.out.println(" The ASCII value for \""+ character + "\" is " + ascii);
        }
        else{

            System.out.println("INvalid ");
        }
    }
    public static void  main(String[] args){
        Scanner sc= new Scanner(System.in);
        AsciiValueFinder obj= new AsciiValueFinder();
        System.out.println("Enter a character:");
        char character=sc.next().charAt(0);
        obj.check(character);
    }
    
}
