package class_5.Solutions;

public class Sum_Of_Even {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 20){
            if (i % 2 == 0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum is " +sum);
    }
}

//wap to find the sum of even numbers in between 1 to 20.

