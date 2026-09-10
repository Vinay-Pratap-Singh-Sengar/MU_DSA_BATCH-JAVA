package class_1.Programs;

import java.util.Scanner;

public class Swap_Two_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println();

        System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println();

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}