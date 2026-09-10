README.md




````
# Java Basics: Variables, Keywords, Identifiers, Tokens & Type Casting

These notes cover some important Java basics:

- Variables
- Declaration
- Initialization
- Assignment
- Keywords
- Identifiers
- Tokens
- Type Casting

---

## 1. Example Programs

### Area.java

```java
package class_1;

public class Area {

    public static void main(String[] args) {

        int length = 20;
        int width = 30;

        int area = length * width;

        System.out.println(area);
        System.out.println("Area is = " + area);
    }
}
````

### Output



```
600
Area is = 600
```

---

### UserInput.java



```
package class_1;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");

        int length;              // declaration
        length = sc.nextInt();   // taking input

        System.out.println("Enter the width : ");

        int width = sc.nextInt();

        int c;      // declaration
        c = 23;     // assignment

        int d = 4;  // declaration + initialization

        System.out.println("Area is : " + length * width);
    }
}
```

---

# 2. Variables

A **variable** is a named location in memory used to store a value.

For example:



```
int age = 20;
```

Here:



```
int  → data type
age  → variable name
20   → value
```

---

## Declaration

Declaration means telling Java the **data type and name** of a variable.



```
int length;
int width;
int c;
```

At this point, we have declared the variables.

---

## Initialization

Initialization means giving a variable its **first value**.



```
int c = 23;
```

We can also do it separately:



```
int c;
c = 23;
```

---

## Declaration + Initialization

We can declare and initialize a variable in the same line:



```
int length = 20;
int width = 30;
int d = 4;
```

---

## Assignment

Assignment means storing a value in a variable.



```
int c;

c = 23;
```

Here, `23` is assigned to `c`.

We can change the value later:



```
int c = 23;

c = 50;
```

Now the value of `c` is `50`.

---

## Simple Example



```
int age = 20;

System.out.println(age);
```

### Output



```
20
```

---

# 3. Keywords

**Keywords** are reserved words in Java that have a special meaning.

We cannot use keywords as variable names, class names, or method names.

Some keywords used in our programs are:

| Keyword | Meaning |
| -------------- | ------------------------------------------------------- |
| `package`      | Defines the package                                     |
| `import`       | Imports a class or package                              |
| `public`       | Access modifier                                         |
| `class`        | Used to define a class                                  |
| `static`       | Allows a method to be called without creating an object |
| `void`         | Means the method does not return a value                |
| `int`          | Integer data type                                       |
| `new`          | Creates an object                                       |

### Example



```
public class Area {
```

Here:



```
public → keyword
class  → keyword
Area   → identifier
```

> **Note:** `System` and `String` are classes, not Java keywords.

For example:



```
System.out.println("Hello");
```

Here:



```
System  → class
out     → output stream
println → method
```

---

# 4. Identifiers

**Identifiers** are names given to different elements in a Java program.

Examples:



```
Area
UserInput
main
length
width
area
sc
c
d
```

---

## Examples from Our Programs

| IdentifierUsed For |                  |
| ------------------ | ---------------- |
| `class_1`          | Package name     |
| `Area`             | Class name       |
| `UserInput`        | Class name       |
| `main`             | Method name      |
| `args`             | Method parameter |
| `length`           | Variable         |
| `width`            | Variable         |
| `area`             | Variable         |
| `sc`               | Scanner object   |
| `c`                | Variable         |
| `d`                | Variable         |

---

## Rules for Identifiers

### 1. An identifier can start with a letter



```
int age;
String name;
```

### 2. An identifier can contain numbers



```
int student1;
int marks10;
```

But it cannot start with a number.

❌ Incorrect:



```
int 1student;
```

---

### 3. `_` and `$` can be used



```
int _value;
int $amount;
```

---

### 4. Spaces are not allowed

❌ Incorrect:



```
int student name;
```

✅ Correct:



```
int studentName;
```

---

### 5. Keywords cannot be used

❌ Incorrect:



```
int class = 10;
```

Because `class` is a Java keyword.

---

### 6. Java is Case-Sensitive

These are different identifiers:



```
age
Age
AGE
```

For example:



```
int age = 20;
int Age = 30;
```

Java treats `age` and `Age` as different variables.

---

# 5. Tokens

A **token** is a small individual unit of a Java program.

For example:



```
int age = 20;
```

This statement contains:



```
int
age
=
20
;
```

These are different tokens.

---

## Types of Tokens

Some important types of Java tokens are:

1.  Keywords
2.  Identifiers
3.  Literals
4.  Operators
5.  Separators

---

## 1. Keywords

Examples:



```
public
class
static
void
int
new
```

---

## 2. Identifiers

Examples:



```
Area
UserInput
main
length
width
sc
```

---

## 3. Literals

Literals are fixed values written directly in the program.

Examples:



```
20
30
23
4
"Hello Java"
"Enter the length : "
```

---

## 4. Operators

Operators are symbols used to perform operations.

Examples:



```
=
*
+
```

For example:



```
int area = length * width;
```

Here:



```
=  → assignment operator
*  → multiplication operator
```

The `+` operator can also be used for string concatenation:



```
System.out.println("Area is = " + area);
```

---

## 5. Separators

Separators are symbols used to separate different parts of a Java program.

Examples:



```
;
{
}
(
)
.
,
```

For example:



```
System.out.println("Hello");
```

Here:



```
( ) → parentheses
.   → dot
;   → semicolon
```

---

# 6. Type Casting

**Type casting** means converting a value from one data type to another data type.

For example:



```
int → double
```

or:


```
double → int
```

There are two common types of type casting:

-  Implicit Casting
-  Explicit Casting

---

# 7. Implicit Casting

Implicit casting happens automatically.

It usually happens when a smaller compatible data type is converted into a larger data type.

Example:



```
int a = 10;

double d = a;

System.out.println(d);
```

### Output



```
10.0
```

Here:


```
int → double
```

Java automatically performs the conversion.

This is also called **widening conversion**.

---

## Another Example

```
int marks = 90;

double result = marks;

System.out.println(result);
```

### Output



```
90.0
```

No manual casting is required.

---

# 8. Explicit Casting

Explicit casting means manually converting one data type into another.

Example:



```
double d = 10.5;

int a = (int) d;

System.out.println(a);
```

### Output



```
10
```

The decimal part is removed.

Here:



```
(int) d
```

means:

> Convert `d` into an `int`.

This is also called **narrowing conversion**.

---

## Syntax

The basic syntax is:



```
(targetType) value
```

Example:



```
(int) 10.5
```

Result:



```
10
```

---

## Another Example



```
double price = 99.99;

int newPrice = (int) price;

System.out.println(newPrice);
```

### Output



```
99
```

---

# 9. Type Casting in an Expression

Suppose we have:



```
int length = 20;
int width = 30;
```

Then:



```
int area = length * width;
```

Both `length` and `width` are integers, so the result is also an integer.

We can also store the result in a `double`:



```
double area = length * width;
```

Java can automatically convert the integer result into a `double`.

---

# 10. Quick Summary

| Concept | Meaning | Example |
| --------------------- | ----------------------------------- | ------------------------ |
| Variable              | Named storage for a value           | `int age;`               |
| Declaration           | Type + variable name                | `int age;`               |
| Initialization        | Giving the first value              | `age = 20;`              |
| Assignment            | Giving or changing a value          | `age = 25;`              |
| Keyword               | Reserved word in Java               | `public`, `class`, `int` |
| Identifier            | Name given by the programmer        | `age`, `Area`            |
| Token                 | Individual unit of a program        | `int`, `=`, `20`, `;`    |
| Literal               | Fixed value                         | `20`, `"Hello"`          |
| Operator              | Performs an operation               | `+`, `*`, `=`            |
| Type Casting          | Converts one data type into another | `(int) 10.5`             |

---

# 11. Beginner Practice

Try to solve these questions yourself before looking at the solution.

### Practice 1 — Variable

Create a variable called `age` and store your age in it.

Example:



```
int age = 20;
```

Print the value of `age`.

---

### Practice 2 — Area

Create two integer variables:



```
length = 10
width = 5
```

Calculate and print the area.

Expected output:



```
Area = 50
```

---

### Practice 3 — Double

Create:



```
int marks = 85;
```

Convert it into a `double` and print the result.

Expected output:



```
85.0
```

---

### Practice 4 — Identifier

What is wrong with this statement?



```
int class = 10;
```

Think about the rules of identifiers.

---

### Practice 5 — Tokens

Find the different tokens in:



```
int age = 20;
```

Identify:

-  Keyword
-  Identifier
-  Operator
-  Literal
-  Separator

---

### Practice 6 — Type Casting

Predict the output:



```
double value = 10.5;

int result = (int) value;

System.out.println(result);
```

---

### Practice 7 — User Input

Create a program that takes `length` and `width` from the user and prints the area.

Example:



```
Enter the length:
20

Enter the width:
30

Area is = 600
```

---

### Practice 8 ⭐

Create a program that takes two numbers from the user and prints:



```
Sum
Difference
Multiplication
```

Example:



```
Enter first number:
10

Enter second number:
5

Sum = 15
Difference = 5
Multiplication = 50
```

---

# 12. Remember

### Variables



```
Declare → Initialize → Use
```

Example:



```
int age;

age = 20;

System.out.println(age);
```

---

### Java Program



```
Write → Compile → Run → Output
```

---

### Type Casting



```
Smaller Type → Larger Type
        ↓
    Automatic
```



```
Larger Type → Smaller Type
        ↓
      Manual
```

---

### Important Rules

-  Use meaningful variable names.
-  Do not use Java keywords as identifiers.
-  Java is case-sensitive.
-  Variable names cannot contain spaces.
-  An identifier cannot start with a number.
- `javac` is used to compile a Java program.
- `java` is used to run a Java program.

---

## ⭐ Key Concepts



```
Variable
    ↓
Stores a value

Keyword
    ↓
Reserved word

Identifier
    ↓
Name given to a program element

Token
    ↓
Individual unit of a program

Type Casting
    ↓
Converting one data type into another
```
