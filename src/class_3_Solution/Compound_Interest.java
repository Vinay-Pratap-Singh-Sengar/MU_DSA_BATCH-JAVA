package class_3_Solution;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal, rate, time;

        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        time = sc.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100, time);

        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + amount);
    }
}
