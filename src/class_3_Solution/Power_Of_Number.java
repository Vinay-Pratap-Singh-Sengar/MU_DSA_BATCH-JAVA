package class_3_Solution;

import java.util.Scanner;

public class Power_Of_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Enter x: ");
        x = sc.nextDouble();

        System.out.print("Enter y: ");
        y = sc.nextDouble();

        double result = Math.pow(x, y);

        System.out.println("Answer: " + result);
    }
}
