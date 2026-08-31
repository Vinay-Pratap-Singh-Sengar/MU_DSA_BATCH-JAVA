package class_1;

public class First {
    public void greet(){
        System.out.println("hello , good evening");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        First first = new First();
        first.greet();
    }
}

// identify the correct syntax :
//
////Valid Java main() method signature
//public static void main(String[] args)
//public static void main(String []args)
//public static void main(String args[])
//public static void main(String... args)
//static public void main(String[] args)
//public static final void main(String[] args)
//final public static void main(String[] args)
//final strictfp public static void main(String[] args)
//
//
////    Invalid Java main() method signature
//public void main(String[] args)
//static void main(String[] args)
//public void static main(String[] args)
//abstract public static void main(String[] args)