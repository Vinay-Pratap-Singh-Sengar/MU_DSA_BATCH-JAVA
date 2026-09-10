package class_4.Solutions;

import java.util.Scanner;

public class Leep_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year =  sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }

    }
}

// year should be divisible by 4
// year must not be divisible by 100
// year also should be divisible by 400