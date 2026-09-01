package class_2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Principle : ");
        int p = sc.nextInt();

        System.out.println("Rate : ");
        int r = sc.nextInt();

        System.out.println("Time : ");
        int t = sc.nextInt();
//        double si = p * r * t / 100.0;
        double si = (double) p * r * t / 100.0;
        System.out.println("The interest is : " +si);
    }
}
