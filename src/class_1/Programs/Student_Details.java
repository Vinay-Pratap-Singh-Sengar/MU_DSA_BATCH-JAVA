package class_1.Programs;
import java.util.Scanner;
public class Student_Details {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}



