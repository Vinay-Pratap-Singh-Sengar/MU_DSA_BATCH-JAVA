package class_1;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");

        int length; //declaration
        length = sc.nextInt(); //initialization
        System.out.println("Enter the width : ");
        int width = sc.nextInt();

        int c ; //within the memory create the space named c of size 4

        c = 23; // assigned the value 23 inside c

        int d = 4;
        System.out.println("Area is : "+ length * width);
    }
}
