# Java Operators

Operators are special symbols that are used to perform operations on values and variables.

For example:

```java
int a = 10;
int b = 5;

System.out.println(a + b);
```

Output:

```text
15
```

Here, `+` is an **operator**.

---

# Types of Operators in Java

In this chapter, we will learn:

1. Arithmetic Operators
2. Assignment Operators
3. Relational Operators
4. Logical Operators
5. Ternary Operator
6. Increment and Decrement Operators
7. Modulus Operator
8. Important concepts related to operators

---

# 1. Arithmetic Operators

Arithmetic operators are used to perform mathematical operations.

| Operator | Name                | Example |
| -------- | ------------------- | ------- |
| `+`      | Addition            | `a + b` |
| `-`      | Subtraction         | `a - b` |
| `*`      | Multiplication      | `a * b` |
| `/`      | Division            | `a / b` |
| `%`      | Modulus / Remainder | `a % b` |
| `++`     | Increment           | `a++`   |
| `--`     | Decrement           | `a--`   |

---

## Addition `+`

```java
int a = 10;
int b = 5;

System.out.println(a + b);
```

Output:

```text
15
```

---

## Subtraction `-`

```java
int a = 10;
int b = 5;

System.out.println(a - b);
```

Output:

```text
5
```

---

## Multiplication `*`

```java
int a = 10;
int b = 5;

System.out.println(a * b);
```

Output:

```text
50
```

---

## Division `/`

```java
int a = 10;
int b = 2;

System.out.println(a / b);
```

Output:

```text
5
```

### Important

When both operands are integers, Java performs **integer division**.

```java
System.out.println(10 / 3);
```

Output:

```text
3
```

It does not give `3.3333` because both numbers are `int`.

If we want a decimal result:

```java
System.out.println(10.0 / 3);
```

Output will be approximately:

```text
3.3333333333333335
```

---

# 2. Modulus Operator `%`

The `%` operator gives us the **remainder** after division.

```java
System.out.println(10 % 3);
```

Output:

```text
1
```

Because:

```text
10 ÷ 3

Quotient = 3
Remainder = 1
```

So:

```java
10 % 3
```

gives:

```text
1
```

---

## More Examples

```java
System.out.println(20 % 5);
System.out.println(20 % 6);
System.out.println(15 % 4);
```

Output:

```text
0
2
3
```

---

# 3. Important Uses of `%`

The modulus operator is very useful in programming.

## Check Even or Odd

If a number is divisible by `2`, it is even.

```java
int n = 10;

System.out.println(n % 2);
```

Output:

```text
0
```

So `10` is even.

For an odd number:

```java
int n = 7;

System.out.println(n % 2);
```

Output:

```text
1
```

So `7` is odd.

Later, when we learn `if-else`, we can use:

```java
n % 2 == 0
```

to check whether a number is even.

---

# 4. Find Last Digit

The `%` operator can also be used to find the last digit of a number.

```java
int n = 2426;

System.out.println(n % 10);
```

Output:

```text
6
```

Why?

```text
2426 ÷ 10

Remainder = 6
```

Therefore:

```java
2426 % 10
```

gives the last digit.

---

# 5. Find Last Two Digits

To find the last two digits of a number, use `% 100`.

```java
int n = 2426;

System.out.println(n % 100);
```

Output:

```text
26
```

### Remember

```text
% 10   → last 1 digit
% 100  → last 2 digits
% 1000 → last 3 digits
```

### Example

```java
System.out.println(12345 % 10);
System.out.println(12345 % 100);
System.out.println(12345 % 1000);
```

Output:

```text
5
45
345
```

---

# 6. Increment Operator `++`

The increment operator increases a value by `1`.

```java
int a = 10;

a++;

System.out.println(a);
```

Output:

```text
11
```

This:

```java
a++;
```

is similar to:

```java
a = a + 1;
```

---

# 7. Decrement Operator `--`

The decrement operator decreases a value by `1`.

```java
int a = 10;

a--;

System.out.println(a);
```

Output:

```text
9
```

This:

```java
a--;
```

is similar to:

```java
a = a - 1;
```

---

# 8. Post-Increment `a++`

In post-increment, the **current value is used first**, and then the value is increased.

```java
int a = 10;

System.out.println(a++);
System.out.println(a);
```

Output:

```text
10
11
```

### Think like this:

```text
Print old value
      ↓
Increase by 1
```

---

# 9. Pre-Increment `++a`

In pre-increment, the value is **increased first**, and then the updated value is used.

```java
int a = 10;

System.out.println(++a);
```

Output:

```text
11
```

### Think like this:

```text
Increase by 1
      ↓
Use new value
```

---

# 10. Pre-Decrement and Post-Decrement

The same concept applies to `--`.

## Post-Decrement

```java
int a = 10;

System.out.println(a--);
System.out.println(a);
```

Output:

```text
10
9
```

The old value is used first.

---

## Pre-Decrement

```java
int a = 10;

System.out.println(--a);
```

Output:

```text
9
```

The value is decreased first.

---

# 11. Quick Difference

| Operator | Meaning                  |
| -------- | ------------------------ |
| `a++`    | Use first, then increase |
| `++a`    | Increase first, then use |
| `a--`    | Use first, then decrease |
| `--a`    | Decrease first, then use |

---

# 12. Assignment Operator

The assignment operator is:

```java
=
```

It is used to assign a value to a variable.

```java
int a = 10;
```

Here:

```text
10 → value
a  → variable
=  → assignment operator
```

---

# 13. Compound Assignment Operators

Java provides shorter ways to perform operations and assign the result back to the same variable.

| Operator | Meaning             | Example  |
| -------- | ------------------- | -------- |
| `=`      | Assign              | `a = 10` |
| `+=`     | Add and assign      | `a += 5` |
| `-=`     | Subtract and assign | `a -= 5` |
| `*=`     | Multiply and assign | `a *= 5` |
| `/=`     | Divide and assign   | `a /= 5` |
| `%=`     | Modulus and assign  | `a %= 5` |

---

## `+=`

```java
int b = 20;

b += 5;

System.out.println(b);
```

Output:

```text
25
```

This:

```java
b += 5;
```

means:

```java
b = b + 5;
```

---

## `-=`

```java
int b = 20;

b -= 5;

System.out.println(b);
```

Output:

```text
15
```

Same as:

```java
b = b - 5;
```

---

## `*=`

```java
int b = 20;

b *= 5;

System.out.println(b);
```

Output:

```text
100
```

Same as:

```java
b = b * 5;
```

---

## `/=`

```java
int b = 20;

b /= 5;

System.out.println(b);
```

Output:

```text
4
```

Same as:

```java
b = b / 5;
```

---

## `%=`

```java
int b = 20;

b %= 6;

System.out.println(b);
```

Output:

```text
2
```

Same as:

```java
b = b % 6;
```

---

# 14. Relational Operators

Relational operators are used to **compare two values**.

| Operator | Meaning                  |
| -------- | ------------------------ |
| `>`      | Greater than             |
| `<`      | Less than                |
| `>=`     | Greater than or equal to |
| `<=`     | Less than or equal to    |
| `==`     | Equal to                 |
| `!=`     | Not equal to             |

The result of a relational operation is always a:

```text
boolean
```

That means the result will be either:

```text
true
```

or:

```text
false
```

---

## `>`

```java
System.out.println(10 > 5);
```

Output:

```text
true
```

---

## `<`

```java
System.out.println(10 < 5);
```

Output:

```text
false
```

---

## `>=`

```java
System.out.println(10 >= 10);
```

Output:

```text
true
```

---

## `<=`

```java
System.out.println(10 <= 5);
```

Output:

```text
false
```

---

## `==`

`==` checks whether two values are equal.

```java
System.out.println(10 == 10);
```

Output:

```text
true
```

---

## `!=`

`!=` checks whether two values are different.

```java
System.out.println(10 != 5);
```

Output:

```text
true
```

---

# 15. `=` vs `==`

This is one of the most important things for beginners.

### `=`

Used for **assignment**.

```java
int age = 20;
```

Meaning:

```text
Store 20 inside age
```

### `==`

Used for **comparison**.

```java
age == 20
```

Meaning:

```text
Is age equal to 20?
```

### Remember

```text
=   → Assign
==  → Compare
```

---

# 16. Logical Operators

Logical operators are used to combine or modify conditions.

| Operator | Name | Meaning                      |    |                                     |
| -------- | ---- | ---------------------------- | -- | ----------------------------------- |
| `&&`     | AND  | Both conditions must be true |    |                                     |
| `        |      | `                            | OR | At least one condition must be true |
| `!`      | NOT  | Reverses the result          |    |                                     |

The result is always:

```text
true
```

or:

```text
false
```

---

# 17. AND Operator `&&`

The AND operator returns `true` only when **both conditions are true**.

```java
System.out.println(true && true);
```

Output:

```text
true
```

But:

```java
System.out.println(true && false);
```

Output:

```text
false
```

### Truth Table

| A     | B     | A && B |
| ----- | ----- | ------ |
| true  | true  | true   |
| true  | false | false  |
| false | true  | false  |
| false | false | false  |

### Easy way to remember

```text
&& → Both should be true
```

---

# 18. OR Operator `||`

The OR operator returns `true` when **at least one condition is true**.

```java
System.out.println(true || false);
```

Output:

```text
true
```

### Truth Table

| A | B | A || B |
|---|---|---|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

### Easy way to remember

```text
|| → Any one can be true
```

---

# 19. NOT Operator `!`

The NOT operator reverses a boolean value.

```java
System.out.println(!true);
```

Output:

```text
false
```

And:

```java
System.out.println(!false);
```

Output:

```text
true
```

### Easy way to remember

```text
! → Reverse
```

---

# 20. Ternary Operator

The ternary operator is a short way of writing a simple `if-else` type decision.

Syntax:

```java
condition ? value1 : value2
```

Example:

```java
int age = 17;

String result = (age >= 18)
        ? "You can vote"
        : "You cannot vote";

System.out.println(result);
```

Output:

```text
You cannot vote
```

---

# 21. Understanding the Ternary Operator

Look at:

```java
age >= 18 ? "You can vote" : "You cannot vote"
```

There are three parts:

```text
Condition
   ↓
age >= 18

   ?

Value when true
   ↓
"You can vote"

   :

Value when false
   ↓
"You cannot vote"
```

So:

```text
condition ? true-value : false-value
```

---

# 22. Another Ternary Example

```java
int number = 10;

String result = (number % 2 == 0)
        ? "Even"
        : "Odd";

System.out.println(result);
```

Output:

```text
Even
```

Here we are using two concepts together:

```text
%
+
ternary operator
```

---

# 23. Complete Operators Example

The following program demonstrates some of the operators together:

```java
public class Operators {

    public static void main(String[] args) {

        // Arithmetic operators

        int a = 10;

        System.out.println(a + 5);
        System.out.println(a - 5);
        System.out.println(a * 5);
        System.out.println(a / 5);
        System.out.println(a % 3);


        // Increment and decrement

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);


        // Assignment operator

        int b = 20;

        b += 5;

        System.out.println(b);


        // Relational operator

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);


        // Logical operator

        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(!true);


        // Ternary operator

        int age = 17;

        String result = (age >= 18)
                ? "You can vote"
                : "You cannot vote";

        System.out.println(result);
    }
}
```

---

# 24. Operator Precedence

When multiple operators are used in one expression, Java follows an order of evaluation.

For example:

```java
int result = 10 + 5 * 2;

System.out.println(result);
```

Output:

```text
20
```

It is evaluated as:

```text
10 + (5 * 2)
```

not:

```text
(10 + 5) * 2
```

---

## Use Parentheses

When you want a specific order, use parentheses.

```java
int result = (10 + 5) * 2;

System.out.println(result);
```

Output:

```text
30
```

### Basic rule for now

Remember:

```text
()
↓
*
/
%
↓
+
-
```

Parentheses should be used whenever they make the expression easier to understand.

---

# 25. Important Points to Remember

### 1. `%` gives the remainder

```java
2426 % 100
```

Output:

```text
26
```

---

### 2. `/` with integers gives integer division

```java
10 / 3
```

Output:

```text
3
```

---

### 3. `=` and `==` are different

```text
=   → Assignment
==  → Comparison
```

---

### 4. Relational operators return boolean

```java
System.out.println(10 > 5);
```

Output:

```text
true
```

---

### 5. Logical operators work with boolean values

```java
true && false
true || false
!true
```

---

### 6. `++` increases by 1

```java
a++;
```

---

### 7. `--` decreases by 1

```java
a--;
```

---

### 8. `a++` and `++a` are not always the same

```text
a++ → Use first, then increase
++a → Increase first, then use
```

---

### 9. Compound assignment is shorthand

```java
a += 5;
```

means:

```java
a = a + 5;
```

---

### 10. Ternary operator has three parts

```java
condition ? true-value : false-value
```

---

# 26. Practice Questions

Try these questions before moving to the next topic.

## Basic

### 1. What will be the output?

```java
int a = 10;

System.out.println(a++);
System.out.println(a);
```

---

### 2. What will be the output?

```java
int a = 10;

System.out.println(++a);
System.out.println(a);
```

---

### 3. What will be the output?

```java
System.out.println(25 % 10);
```

---

### 4. Find the last two digits

Write a program to find the last two digits of:

```text
2426
```

Expected output:

```text
26
```

---

### 5. What will be the output?

```java
int a = 20;

a += 10;

System.out.println(a);
```

---

## Relational Operators

### 6. Find the output:

```java
System.out.println(10 > 5);
System.out.println(10 < 5);
System.out.println(10 == 10);
System.out.println(10 != 10);
```

---

## Logical Operators

### 7. Find the output:

```java
System.out.println(true && false);
System.out.println(true || false);
System.out.println(!true);
```

---

## Ternary Operator

### 8. Write a program to check whether a number is positive or negative using the ternary operator.

Example:

```text
Input: 10
Output: Positive
```

---

### 9. Write a program to check whether a number is even or odd using `%` and the ternary operator.

Example:

```text
Input: 7
Output: Odd
```

---

# 27. Homework ⭐

Write programs for the following:

### 1. Last Digit

Find the last digit of:

```text
7896
```

---

### 2. Last Two Digits

Find the last two digits of:

```text
7896
```

---

### 3. Even or Odd

Take a number from the user and determine whether it is even or odd using the ternary operator.

---

### 4. Largest of Two Numbers

Take two numbers and use the ternary operator to find the larger number.

---

### 5. Voting Eligibility

Take age from the user.

If age is `18` or above:

```text
You can vote
```

Otherwise:

```text
You cannot vote
```

Use the ternary operator.

---

### 6. Positive or Negative

Take a number from the user and determine whether it is positive or negative using the ternary operator.

---

# Quick Revision

```text
+       → Addition
-       → Subtraction
*       → Multiplication
/       → Division
%       → Remainder

++      → Increase by 1
--      → Decrease by 1

=       → Assignment
+=      → Add and assign
-=      → Subtract and assign
*=      → Multiply and assign
/=      → Divide and assign
%=      → Modulus and assign

>       → Greater than
<       → Less than
>=      → Greater than or equal to
<=      → Less than or equal to
==      → Equal
!=      → Not equal

&&      → AND
||      → OR
!       → NOT

?:      → Ternary
```

---

# One-Line Memory Trick

```text
Arithmetic  → Calculate
Assignment  → Store/Update
Relational  → Compare
Logical     → Combine conditions
Ternary     → Make a simple decision
```

## Most Important Examples

```java
// Arithmetic
10 + 5

// Remainder
10 % 3

// Increment
a++

// Assignment
a += 5

// Comparison
a > b

// Logical
a > 10 && b < 20

// Ternary
age >= 18 ? "Eligible" : "Not Eligible"
```

Keep practicing these operators. They are used throughout Java programming and will become especially important when we start learning **conditions (`if-else`) and loops**.
