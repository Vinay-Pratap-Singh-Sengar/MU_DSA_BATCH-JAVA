package class_4.Solutions;

import java.util.Scanner;

public class Divisibility_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num % 5 == 0){
            System.out.println("Number is divisible by 5.");
        }
        if(num % 5 != 0){
            System.out.println("Number is not divisible by 5.");
        }
//        else{
//            System.out.println("Number is not divisible by 5.");
//        }
    }
}
