package class_3_Solution;

import java.util.Scanner;

public class Charater_to_ASCII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch;

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);

        System.out.println("ASCII Value: " + (int) ch);
    }
}
