package class_3_Solution;

import java.util.Scanner;

public class Word_Length {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word;

        System.out.print("Enter a word: ");
        word = sc.next();

        System.out.println("Length: " + word.length());
    }

}
