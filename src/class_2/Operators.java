package class_2;

public class Operators {
    public static void main(String[] args) {
////        arithmetic : +   , - , * , / ,  % ,  ++ , --
//
//        int a = 10;
//
//        System.out.println(a++);
//        System.out.println(++a);
//        System.out.println(a--);
//        System.out.println(++a);
//        System.out.println(--a);



// // assignment operator :  = , += ,-= ,*= ,/= , %= ,

        int b = 20;
        b += 5;
        System.out.println(b);

//  // relational operator : >  , <  , >=  ,   <=   , ==  , !=
//          the result of relational and logical operator will always be a boolean value.
//  // logical operator : and (&&) , or(||) , not(!)

//        System.out.println(true && true && true && true && true && true && true && false );
//        System.out.println(false && false && false && false && false && false && false && true );


// // ternary operator : (? :)

        int age = 17;
        String result = ( age >= 18 ? "you can vote" : "you can not vote");
        System.out.println(result);
//        System.out.println(( age >= 18) ? "you can vote" : "you can not vote");
        System.out.println(2426%100);
    }
}

//wap to find out the last two digit from the number 2426;

code-class-eight.vercel.app