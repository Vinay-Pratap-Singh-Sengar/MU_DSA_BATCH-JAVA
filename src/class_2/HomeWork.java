package class_2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String fname = sc.nextLine();


        System.out.println("The full name is "+fname);
        System.out.println("length of the word is : "+fname.length());
    }
}
