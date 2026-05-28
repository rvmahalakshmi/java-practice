package Literals;
import java.util.Scanner;
public class CharacterCategoryChecker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Given input to check :");
        char input=sc.next().charAt(0);
        if(input>='A'&& input<='Z'){
            System.out.println("Given input belongs to \"Uppercase character\"");
        }    
        else if(input>='a'&& input<='z'){
            System.out.println("Given input belongs \"Lowercase character\"");
        }
        else if(input>='0'&&input<='9'){
            System.out.println("Given input belongs \"Digit\"");
        }
        else{
             System.out.println("Given input belongs to \"Special character\"");
        }
    }
    
}
