package class_2.Programs;

import java.util.Scanner;

public class Square_Root_Cube {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        double square = n * n;
        double cube = n * n * n;
        double squareRoot = Math.sqrt(n);

        System.out.println();

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Square Root: " + squareRoot);

    }
}
