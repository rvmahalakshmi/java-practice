import java.util.Scanner;
public class CountVowels{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string for test :");
        String input= sc.nextLine();
        int count=0;
        char[] arr=input.toCharArray();
        input=input.toLowerCase();
        for(int i=0;i<=input.length()-1;i++){
            char ch=arr[i];
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
               count++;
            }
        }
        System.out.println("No.of vowels present in given input is : "+count);
        sc.close();
    }
}
