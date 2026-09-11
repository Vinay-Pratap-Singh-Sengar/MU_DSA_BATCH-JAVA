package class_4.Solutions;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units of electricity bill :");
        int units = sc.nextInt();

        if(units <= 50){
            double bill = units * 0.50 * 1.2;
            System.out.println("Bill amount is : " + bill);
        }
        else if(units <= 100){
            double bill = (25 + (units - 50) * 0.75) * 1.2;
            System.out.println("Bill amount is : " + bill);
        }
        else if(units <= 200){
            double bill = (100 + (units - 150) * 1.2) * 1.2;
            System.out.println("Bill amount is : " + bill);
        }
        else {
            double bill = (220 + (units - 250) * 1.5 )* 1.2;
            System.out.println("Bill amount is : " + bill);
        }
    }
}
