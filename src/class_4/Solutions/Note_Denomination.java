package class_4.Solutions;

import java.util.Scanner;

public class Note_Denomination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount ");
        int amount = sc.nextInt();

        if(amount >= 500){
            int notes = amount / 500;
            System.out.println("Notes of 500 are : " + notes);
            amount = amount % 500;
        }

        if(amount >= 200){
            int notes = amount / 200;
            System.out.println("Notes of 200 are : " + notes);
            amount = amount % 200;
        }

        if(amount >= 100){
            int notes = amount / 100;
            System.out.println("Notes of 100 are : " + notes);
            amount = amount % 100;
        }

        if(amount >= 50){
            int notes = amount / 50;
            System.out.println("Notes of 50 are : " + notes);
            amount = amount % 50;
        }

        if(amount >= 20){
            int notes = amount / 20;
            System.out.println("Notes of 20 are : " + notes);
            amount = amount % 20;
        }

        if(amount >= 10){
            int notes = amount / 10;
            System.out.println("Notes of 10 are : " + notes);
            amount = amount % 10;
        }

        if(amount >= 5){
            int notes = amount / 5;
            System.out.println("Notes of 5 are : " + notes);
            amount = amount % 5;
        }

        if(amount >= 2){
            int notes = amount / 2;
            System.out.println("Notes of 2 are : " + notes);
            amount = amount % 2;
        }

        if(amount == 1){
            int notes = amount;
            System.out.println("Notes of 1 are : " + notes);
        }
    }
}
