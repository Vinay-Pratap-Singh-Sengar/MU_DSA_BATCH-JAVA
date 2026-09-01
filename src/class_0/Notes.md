# Java First Program

Welcome to your first Java program! ☕

In this chapter, we will learn how to:

* Write a Java program using Notepad
* Understand the basic structure of a Java program
* Save a Java file correctly
* Compile a Java program
* Run a Java program
* Understand the `main()` method
* See different valid forms of the `main()` method
* Understand common errors related to `java` and `javac`

---

# 1. What is a Java Program?

A Java program is a set of instructions written using the Java programming language.

Let's start with the simplest Java program:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

    }
}
```

### Output

```text
Hello World!
```

This is commonly called the **Hello World program**.

It is a good first program because it introduces us to the basic structure of Java.

---

# 2. What Do We Need?

To write and run Java programs, we need the **JDK (Java Development Kit)**.

After installing the JDK, we should be able to use these commands:

```cmd
java -version
```

and

```cmd
javac -version
```

If they display the Java version, the JDK is available from the command line.

---

# 3. Writing a Java Program Using Notepad

If you are using Windows, you can write a Java program using **Notepad**.

Open:

```text
Start Menu → All Programs → Accessories → Notepad
```

Or simply search for **Notepad** from the Start Menu.

Now write the following program:

```java
public class Simple {

    public static void main(String[] args) {

        System.out.println("Hello Java");

    }
}
```

---

# 4. Save the Java File

Save the file with the `.java` extension.

For example:

```text
Simple.java
```

### Important

Make sure that the file is actually saved as:

```text
Simple.java
```

and not:

```text
Simple.java.txt
```

If you are using Notepad, select **Save as type → All Files** while saving the Java file.

---

# 5. Open Command Prompt

After saving the program, open **Command Prompt**.

You can search for:

```text
Command Prompt
```

from the Windows Start Menu.

---

# 6. Go to the Java File Location

Suppose we saved our file inside:

```text
C:\new
```

We first need to move to that folder in Command Prompt.

Use:

```cmd
cd C:\new
```

Now Command Prompt is working inside the folder where `Simple.java` is located.

---

# 7. Compile the Program

To compile a Java program, we use:

```cmd
javac Simple.java
```

Here:

* `javac` is the Java compiler.
* `Simple.java` is our Java source file.

If the program has no compilation errors, a file named:

```text
Simple.class
```

will be created.

---

# 8. Run the Program

After compilation, we can run the program using:

```cmd
java Simple
```

### Output

```text
Hello Java
```

Notice that while running the program, we write:

```cmd
java Simple
```

not:

```cmd
java Simple.java
```

and not:

```cmd
java Simple.class
```

---

# 9. Java Program Flow

The basic process is:

```text
Write Code
    ↓
Simple.java
    ↓
Compile
    ↓
javac Simple.java
    ↓
Simple.class
    ↓
Run
    ↓
java Simple
    ↓
Output
```

The important idea is:

```text
.java  →  .class  →  Output
```

The `.java` file contains the source code written by us.

The `.class` file contains the bytecode produced by the Java compiler.

---

# 10. Understanding the First Java Program

Let's look at our program again:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

    }
}
```

Now let's understand it step by step.

---

## `class`

```java
class Main
```

`class` is a Java keyword used to define a class.

Here, the class name is:

```text
Main
```

A Java program can contain classes, and our program is written inside a class.

---

## `public`

```java
public
```

`public` is an access modifier.

It means that the member can be accessed from outside the class.

For our first programs, you can simply remember:

```java
public
```

means **accessible from anywhere**.

---

## `static`

```java
static
```

`static` allows a method to be used without creating an object of the class.

The JVM needs to start our program by calling the `main()` method, so the `main()` method is declared as `static`.

For now, remember:

> `static` allows the method to be called without creating an object.

We will study `static` in more detail later.

---

## `void`

```java
void
```

`void` is the return type of the method.

It means that the method does not return a value.

For example:

```java
void display()
```

means that `display()` does not return anything.

---

# 11. The `main()` Method

The `main()` method is the **starting point of a Java application**.

Our program contains:

```java
public static void main(String[] args)
```

When we run the program, Java looks for an appropriate `main()` method to begin execution.

For beginners, remember this standard form:

```java
public static void main(String[] args)
```

---

# 12. Understanding `String[] args`

Consider:

```java
String[] args
```

Here:

* `String` represents text.
* `[]` means an array.
* `args` is the variable name.

So:

```java
String[] args
```

means an array of `String` values.

These values can be supplied when starting a Java program from the command line.

We will learn **command-line arguments** later.

---

# 13. Printing Output

To display something on the console, we commonly use:

```java
System.out.println();
```

For example:

```java
System.out.println("Hello Java");
```

Output:

```text
Hello Java
```

We can print numbers as well:

```java
System.out.println(100);
```

Output:

```text
100
```

We can also print multiple statements:

```java
System.out.println("My name is Vinay");
System.out.println("I am learning Java");
```

Output:

```text
My name is Vinay
I am learning Java
```

---

# 14. Understanding `System.out.println()`

For now, you can think of:

```java
System.out.println()
```

as a Java statement used to **print output on the console**.

Later, we will understand what `System`, `out`, and `println()` mean internally.

For now:

```text
System → standard output
out    → output stream
println → print and move to the next line
```

---

# 15. Different Ways to Write `main()`

Java allows some variations in the way we write the `main()` method.

The important thing is that the method must still match the requirements expected by the JVM.

---

## A. Changing the Order of Modifiers

These are both valid:

```java
public static void main(String[] args)
```

and:

```java
static public void main(String[] args)
```

The order of `public` and `static` can be changed.

However, for beginners, we recommend using the standard form:

```java
public static void main(String[] args)
```

---

# 16. Different Positions of `[]`

The array brackets can be written in different positions.

### Style 1

```java
public static void main(String[] args)
```

### Style 2

```java
public static void main(String [] args)
```

### Style 3

```java
public static void main(String args[])
```

These represent the same basic idea:

```text
String array
```

The first form is the most commonly used:

```java
String[] args
```

---

# 17. Using Var-args

Another valid form is:

```java
public static void main(String... args)
```

Here:

```java
String... args
```

is called **var-args**.

It allows a method to accept a variable number of arguments.

We will study var-args in more detail later.

For now, you only need to recognize that this is also a valid form of the `main()` method.

---

# 18. Semicolon After a Class

A semicolon after a class definition is not required.

For example:

```java
class A {

    static public void main(String... args) {

        System.out.println("Hello Java");

    }
}
```

This is enough.

You may also see:

```java
class A {

    static public void main(String... args) {

        System.out.println("Hello Java");

    }
};
```

The semicolon after the closing `}` is unnecessary.

For normal Java coding, simply write:

```java
}
```

---

# 19. Valid `main()` Method Examples

Some examples of valid forms are:

```java
public static void main(String[] args)
```

```java
public static void main(String [] args)
```

```java
public static void main(String args[])
```

```java
public static void main(String... args)
```

```java
static public void main(String[] args)
```

You may also see additional modifiers in some valid declarations, such as:

```java
public static final void main(String[] args)
```

The standard form you should use in your programs is:

```java
public static void main(String[] args)
```

---

# 20. Invalid `main()` Method Examples

The following forms do not provide the standard Java application entry point:

### Missing `static`

```java
public void main(String[] args)
```

### Missing `public`

```java
static void main(String[] args)
```

### Incorrect modifier placement

```java
public void static main(String[] args)
```

### `abstract` main method

```java
abstract public static void main(String[] args)
```

For your programs, use:

```java
public static void main(String[] args)
```

This is the easiest and most commonly used form.

---

# 21. Common Error: `javac` Not Recognized

A common problem for beginners is seeing an error like:

```text
'javac' is not recognized as an internal or external command
```

This usually means that Command Prompt cannot find the Java compiler.

---

# 22. Why Does This Error Occur?

The Java compiler is available through the JDK.

If the JDK's `bin` directory has not been added to the system `PATH`, Windows may not know where to find:

```text
java
```

and:

```text
javac
```

---

# 23. Check Whether Java Is Available

Open Command Prompt and run:

```cmd
java -version
```

Then:

```cmd
javac -version
```

If both commands display a version number, Java is configured correctly.

---

# 24. Setting the Java Path

If `java` or `javac` is not recognized, we may need to add the JDK's `bin` directory to the system `PATH`.

A JDK installation may look similar to:

```text
C:\Program Files\Java\jdk-xx\bin
```

The exact location depends on the JDK version and where it was installed.

After setting the PATH, open a **new Command Prompt** and check again:

```cmd
java -version
```

```cmd
javac -version
```

---

# 25. Quick Revision

| Command             | Use                          |
| ------------------- | ---------------------------- |
| `java -version`     | Check installed Java version |
| `javac -version`    | Check Java compiler version  |
| `javac Simple.java` | Compile Java program         |
| `java Simple`       | Run Java program             |

---

# 26. Remember This

### Java Source File

```text
Simple.java
```

### Compile

```cmd
javac Simple.java
```

### Compiled File

```text
Simple.class
```

### Run

```cmd
java Simple
```

### Output

```text
Hello Java
```

---

# 27. The Most Important Program

For now, remember this program:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

    }
}
```

And remember the basic flow:

```text
Write → Compile → Run → Output
```

That's your first step into Java programming! 🚀
