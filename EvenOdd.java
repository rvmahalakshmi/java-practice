import java.util.*;

public class EvenOdd {
    void checkInteger(int number) {
        if ((number & 1) == 0) {
            System.out.println("The given number " + number + " is Even");
        } else {
            System.out.println("The given number " + number + " is Odd");
        }
    }
    void checkFloating(double number) {
        if (number % 2 == 0) {
            System.out.println("The given number " + number + " is Even");
        } else {
            System.out.println("The given number " + number + " is Odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EvenOdd e = new EvenOdd();

        System.out.println("The Entering Values Should be:");
        System.out.println("1. Integral");
        System.out.println("2. Floating");
        System.out.print("Enter your Choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter an integer number to test: ");
            int number = sc.nextInt();

            e.checkInteger(number);

        } else if (choice == 2) {

            System.out.print("Enter a floating number to test: ");
            double number = sc.nextDouble();

            e.checkFloating(number);

        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}