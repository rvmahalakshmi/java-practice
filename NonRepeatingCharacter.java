import java.util.Scanner;
public class NonRepeatingCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word for test :");
        String input=sc.next();
        char[] array=input.toCharArray();
        for(int i=0;i< input.length();i++){
            boolean repeating=false;
              for(int j=i+1;j<input.length();j++){
                if(array[i]==array[j]){
                    repeating=true;
                    break;
                }
              }
              if(!repeating){
                System.out.println(array[i]);
                break;
              }
        }

    }
}