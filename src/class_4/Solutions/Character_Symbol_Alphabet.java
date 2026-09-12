package class_4.Solutions;

import java.util.Scanner;

public class Character_Symbol_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value : ");
        char ch = sc.next().charAt(0);

        if((int)ch >= 65 && (int)ch <= 90){
            System.out.println("upper case");
        }
        else if((int)ch >= 97 && (int)ch <= 122){
            System.out.println("lower case");
        }
        else if((int)ch >= 48 && (int)ch <= 57){
            System.out.println("number");
        }
        else {
            System.out.println("symbol");
        }
    }
}
