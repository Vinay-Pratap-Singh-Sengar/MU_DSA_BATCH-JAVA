package class_5.Solutions;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        char choice;
        do{
            System.out.println("Do you want to continue. press Y/N...");
            Scanner sc = new Scanner(System.in);
            choice = sc.next().charAt(0);

        }while(choice=='Y'||choice=='y');
    }
}
