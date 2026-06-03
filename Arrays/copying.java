package Arrays;
import java.util.*;

public class copying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sizes of two arrays");

        System.out.println("For first array: ");
        int first_arr = sc.nextInt();
        int[] array1 = new int[first_arr];

        System.out.println("For second array: ");
        int second_arr = sc.nextInt();
        int[] array2 = new int[second_arr];

        System.out.print("Enter elements for first array: ");
        for (int i = 0; i < first_arr; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Enter elements for second array: ");
        for (int i = 0; i < second_arr; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Before copying:");

        System.out.print("First array [");
        for (int num : array1) {
            System.out.print(" " + num);
        }
        System.out.println(" ]");

        System.out.print("Second array [");
        for (int num : array2) {
            System.out.print(" " + num);
        }
        System.out.println(" ]");

        int min = Math.min(first_arr, second_arr);

        for (int i = 0; i < min; i++) {
            array1[i] = array2[i];
        }

        System.out.println();
        System.out.println("After copying:");

        System.out.print("First array [");
        for (int num : array1) {
            System.out.print(" " + num);
        }
        System.out.println(" ]");

        System.out.print("Second array [");
        for (int num : array2) {
            System.out.print(" " + num);
        }
        System.out.println(" ]");

        sc.close();
    }
}