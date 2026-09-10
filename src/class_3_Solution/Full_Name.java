package class_3_Solution;

import java.util.Scanner;

public class Full_Name {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName, lastName;

        System.out.print("Enter first name: ");
        firstName = sc.next();

        System.out.print("Enter last name: ");
        lastName = sc.next();

        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}
