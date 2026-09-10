package class_4.Solutions;

import java.util.Scanner;

public class Number_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int num = sc.nextInt();

        if(num >= 0 && num <= 10){
            System.out.println("number is in range of 0 to 10");
        }
        else if(num > 10 && num < 20){
            System.out.println("number is in range of 11 to 19");
        }
        else{
            System.out.println("number is greater than or equal to 20");
        }
    }
}
