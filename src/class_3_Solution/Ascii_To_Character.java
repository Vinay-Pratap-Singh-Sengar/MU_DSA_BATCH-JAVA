package class_3_Solution;

import java.util.Scanner;

public class Ascii_To_Character {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ascii;

        System.out.print("Enter ASCII value: ");
        ascii = sc.nextInt();

        System.out.println("Character: " + (char) ascii);
    }
}
