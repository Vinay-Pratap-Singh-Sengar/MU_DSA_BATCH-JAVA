package class_4.Solutions;

import java.util.Scanner;

public class Week_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the week number : ");
        int num = sc.nextInt();

        switch (num) {
            case 1: case 2: case 11: case 12:
                System.out.println("Winter");
                break;

            case 3 : case 4 : case 5 : case 6:
                System.out.println("Summer");
                break;

            case 7 : case 8 : case 9 : case 10:
              System.out.println("Rainy");
              break;

            default :
                System.out.println("Invalid Input");

        }
    }
}
