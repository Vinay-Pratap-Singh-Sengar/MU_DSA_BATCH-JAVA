package class_3_Solution;

import java.util.Scanner;

public class Swap_Without_Third {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
