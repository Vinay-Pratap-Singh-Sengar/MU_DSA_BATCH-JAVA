package class_2;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);

//        int ascii = ch;
//        System.out.println("The ascii of character "+ch +" is : "+ascii);
        System.out.println("The ascii of character "+ch +" is : "+ (int) ch);
        System.out.println("22" + "10");
    }
}
