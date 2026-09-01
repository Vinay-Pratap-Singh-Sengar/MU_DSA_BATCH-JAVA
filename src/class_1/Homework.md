# Java Basic Programming Homework

## A. Input, Output & Strings

### 1. Full Name

**Take the user's first name and last name and print the full name.**

**Example:**

```text
Enter first name: Vinay
Enter last name: Sengar

Full Name: Vinay Sengar
```

---

### 2. Greeting Message

**Take a name from the user and print a greeting message using that name.**

**Example:**

```text
Enter your name: Vinay

Hello Vinay, Welcome!
```

---

### 3. Word Length

**Take a word from the user and print its length.**

**Example:**

```text
Enter a word: Java

Length: 4
```

---

### 4. Character ASCII Value

**Take a character from the user and print its ASCII value.**

**Example:**

```text
Enter a character: A

ASCII Value: 65
```

---

### 5. ASCII Value to Character

**Take an ASCII value from the user and print the corresponding character.**

**Example:**

```text
Enter ASCII value: 65

Character: A
```

---

# B. Numbers & Arithmetic Operations

### 6. Arithmetic Operations

**Take two numbers from the user and print their:**

* Sum
* Difference
* Product
* Quotient
* Remainder

**Example:**

```text
Enter first number: 10
Enter second number: 3

Sum: 13
Difference: 7
Product: 30
Quotient: 3
Remainder: 1
```

---

### 7. Swap Using Third Variable

**Take two numbers from the user and swap their values using a third variable.**

**Example:**

```text
Before Swap:
a = 10
b = 20

After Swap:
a = 20
b = 10
```

---

### 8. Swap Without Third Variable

**Take two numbers from the user and swap their values without using a third variable.**

**Hint:** Use arithmetic operators.

---

### 9. Square, Cube & Square Root

**Take a number from the user and print its:**

* Square
* Cube
* Square Root

**Hint:**

Use:

```java
Math.sqrt()
Math.pow()
```

---

### 10. Power of a Number

**Take two numbers `x` and `y` from the user and calculate `x^y`.**

**Example:**

```text
Enter x: 2
Enter y: 5

Answer: 32
```

**Hint:**

Use:

```java
Math.pow()
```

---

# C. Mathematical Formula-Based Programs

## 11. Simple Interest

**Take Principal, Rate, and Time from the user and calculate Simple Interest and Total Amount.**

### Formula:

```text
SI = (P × R × T) / 100

Amount = P + SI
```

---

## 12. Compound Interest

**Take Principal, Rate, and Time from the user and calculate Compound Interest and Total Amount.**

### Formula:

```text
Amount = P × (1 + R/100)^T

CI = Amount - P
```

**Hint:**

Use:

```java
Math.pow()
```

---

## 13. Rectangle

**Take the length and breadth of a rectangle and calculate its area and perimeter.**

### Formula:

```text
Area = Length × Breadth

Perimeter = 2 × (Length + Breadth)
```

---

## 14. Circle

**Take the radius of a circle and calculate its:**

* Diameter
* Circumference
* Area

### Formula:

```text
Diameter = 2 × r

Circumference = 2 × π × r

Area = π × r²
```

**Hint:**

You can use:

```java
Math.PI
```

---

## 15. Triangle Area

**Take the base and height of a triangle and calculate its area.**

### Formula:

```text
Area = (Base × Height) / 2
```

---

## 16. Equilateral Triangle

**Take the side of an equilateral triangle and calculate its area.**

### Formula:

```text
Area = (√3 / 4) × Side²
```

**Hint:**

Use:

```java
Math.sqrt()
```

---

# D. Unit & Temperature Conversion

## 17. Celsius to Fahrenheit

**Take a temperature in Celsius from the user and convert it into Fahrenheit.**

### Formula:

```text
Fahrenheit = (Celsius × 9/5) + 32
```

---

## 18. Fahrenheit to Celsius

**Take a temperature in Fahrenheit from the user and convert it into Celsius.**

### Formula:

```text
Celsius = (Fahrenheit - 32) × 5/9
```

---

## 19. Centimeter Conversion

**Take a distance in centimeters and convert it into meters and kilometers.**

### Formula:

```text
Meter = Centimeter / 100

Kilometer = Centimeter / 100000
```

---

## 20. Days Conversion

**Take the total number of days from the user and convert them into years, weeks, and remaining days.**

Assume:

```text
1 Year = 365 Days
1 Week = 7 Days
```

### Formula:

```text
Years = Total Days / 365

Remaining Days = Total Days % 365

Weeks = Remaining Days / 7

Days = Remaining Days % 7
```

**Example:**

```text
Enter total days: 400

Years: 1
Weeks: 5
Days: 0
```

---

# ⭐ Additional Practice: Marks Calculation

## 21. Student Marks

**Take marks of five subjects from the user and calculate:**

* Total Marks
* Average Marks
* Percentage

Assume each subject is out of **100 marks**.

### Formula:

```text
Total = S1 + S2 + S3 + S4 + S5

Average = Total / 5

Percentage = (Total / 500) × 100
```

---

# Java Concepts to Practice

While solving these programs, students should practice:

* `import java.util.Scanner;`
* `public class Main`
* `public static void main(String[] args)`
* `Scanner`
* `System.out.println()`
* `System.out.print()`
* `int`
* `float`
* `double`
* `char`
* `String`
* `nextInt()`
* `nextDouble()`
* `next()`
* `nextLine()`
* Arithmetic operators:

    * `+`
    * `-`
    * `*`
    * `/`
    * `%`
* Assignment operator: `=`
* Variables
* Type casting
* `Math.sqrt()`
* `Math.pow()`
* `Math.PI`
* Integer division
* Modulus operator `%`

---

# Instructions

1. Write each program in a separate `.java` file.
2. Use meaningful variable names.
3. Take all required values from the user unless the question specifically provides a value.
4. Display clear prompts before taking input.
5. Display the result with a meaningful message.
6. Do not use methods/functions created by yourself, loops, arrays, or conditional statements unless instructed.
7. Use the `Scanner` class for taking input.
8. Try to solve each problem independently before checking the reference solution.
9. Use appropriate data types such as `int`, `double`, `char`, and `String`.
10. For decimal calculations, use `double` wherever required.

---

# Suggested File Names

```text
01_full_name.java
02_greeting.java
03_word_length.java
04_character_ascii.java
05_ascii_character.java
06_arithmetic_operations.java
07_swap_with_third_variable.java
08_swap_without_third_variable.java
09_square_cube_sqrt.java
10_power.java
11_simple_interest.java
12_compound_interest.java
13_rectangle.java
14_circle.java
15_triangle_area.java
16_equilateral_triangle.java
17_celsius_to_fahrenheit.java
18_fahrenheit_to_celsius.java
19_centimeter_conversion.java
20_days_conversion.java
21_marks_calculation.java
```

## Submission

Create a separate `.java` file for each question and submit all **21 programs**.

Make sure your programs:

* Compile without errors
* Take input from the user
* Display clear output
* Follow the instructions given above
* Use only the Java concepts taught so far
