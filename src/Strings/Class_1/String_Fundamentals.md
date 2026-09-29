# Class 1 — String Fundamentals in Java

## 📚 Topics Covered

In this class, we will learn the basic concepts of **String in Java**.

### Topics

1. What is String?
2. String Declaration
3. String Input
4. `length()`
5. `charAt()`
6. String Traversal
7. String Concatenation
8. `equals()`

---

# 1. What is a String?

A **String** is a sequence of characters.

For example:

```java
"Hello"
"Java"
"Vinay"
"Hello World"
```

In Java, String is represented using the `String` class.

### Example

```java
String name = "Vinay";

System.out.println(name);
```

### Output

```text
Vinay
```

---

# 2. String Declaration

There are different ways to create a String in Java.

### Using String Literal

```java
String name = "Vinay";
```

This is the most commonly used way.

### Example

```java
String city = "Indore";

System.out.println(city);
```

Output:

```text
Indore
```

---

# 3. String Input

We can take String input using the `Scanner` class.

### Example

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Name: " + name);
    }
}
```

### `next()` vs `nextLine()`

#### `next()`

Reads only one word.

```java
String name = sc.next();
```

Input:

```text
Vinay Sengar
```

Output:

```text
Vinay
```

#### `nextLine()`

Reads the complete line.

```java
String name = sc.nextLine();
```

Input:

```text
Vinay Sengar
```

Output:

```text
Vinay Sengar
```

---

# 4. `length()`

The `length()` method returns the number of characters in a String.

### Syntax

```java
string.length()
```

### Example

```java
String str = "Hello";

System.out.println(str.length());
```

### Output

```text
5
```

### Important

String indexing starts from `0`.

For:

```text
Hello
```

The indexes are:

```text
 H  e  l  l  o
 0  1  2  3  4
```

So:

```java
str.length()
```

returns `5`, but the last index is:

```text
4
```

---

# 5. `charAt()`

The `charAt()` method is used to access a character at a particular index.

### Syntax

```java
string.charAt(index)
```

### Example

```java
String str = "Hello";

System.out.println(str.charAt(0));
System.out.println(str.charAt(1));
System.out.println(str.charAt(4));
```

### Output

```text
H
e
o
```

### Important

If the String length is `5`, valid indexes are:

```text
0 1 2 3 4
```

Trying to access an invalid index will cause:

```text
StringIndexOutOfBoundsException
```

---

# 6. String Traversal

**String traversal** means visiting each character of a String one by one.

We generally use a `for` loop.

### Example

```java
String str = "Hello";

for (int i = 0; i < str.length(); i++) {
    System.out.println(str.charAt(i));
}
```

### Output

```text
H
e
l
l
o
```

### How it works

```text
i = 0 → H
i = 1 → e
i = 2 → l
i = 3 → l
i = 4 → o
```

---

# 7. String Concatenation

**Concatenation** means joining two or more Strings.

We can use the `+` operator.

### Example

```java
String firstName = "Vinay";
String lastName = "Sengar";

String fullName = firstName + " " + lastName;

System.out.println(fullName);
```

### Output

```text
Vinay Sengar
```

### Another Example

```java
String str1 = "Hello";
String str2 = "Java";

System.out.println(str1 + " " + str2);
```

Output:

```text
Hello Java
```

---

# 8. `equals()`

The `equals()` method is used to compare the contents of two Strings.

### Example

```java
String str1 = "Java";
String str2 = "Java";

System.out.println(str1.equals(str2));
```

### Output

```text
true
```

### Different Strings

```java
String str1 = "Java";
String str2 = "C++";

System.out.println(str1.equals(str2));
```

Output:

```text
false
```

### Important

For comparing Strings, use:

```java
str1.equals(str2)
```

Do not use `==` when you want to compare String contents.

---

# 📝 Practice Questions

## 1. Print Every Character

Write a Java program to print every character of a String on a separate line.

### Example

Input:

```text
Java
```

Output:

```text
J
a
v
a
```

---

## 2. Print String in Reverse

Write a Java program to print a String in reverse order.

### Example

Input:

```text
Java
```

Output:

```text
avaJ
```

### Hint

Start the loop from:

```java
str.length() - 1
```

and move towards:

```java
0
```

---

## 3. Count Vowels

Write a Java program to count the number of vowels in a String.

Consider:

```text
a, e, i, o, u
```

### Example

Input:

```text
education
```

Output:

```text
5
```

### Hint

Use:

```java
char ch = str.charAt(i);
```

Then check whether the character is:

```text
a
e
i
o
u
```

---

## 4. Count Consonants

Write a Java program to count the number of consonants in a String.

### Example

Input:

```text
hello
```

Output:

```text
3
```

### Hint

A character is a consonant if it is an alphabet but is not a vowel.

---

## 5. Count Digits

Write a Java program to count how many digits are present in a String.

### Example

Input:

```text
java123
```

Output:

```text
3
```

### Hint

Check whether a character is between:

```text
'0' and '9'
```

Example:

```java
if (ch >= '0' && ch <= '9') {
    // digit
}
```

---

# 💡 Important Methods

| Method     | Purpose                    | Example             |
| ---------- | -------------------------- | ------------------- |
| `length()` | Returns String length      | `str.length()`      |
| `charAt()` | Gets character at an index | `str.charAt(0)`     |
| `equals()` | Compares String contents   | `str1.equals(str2)` |

---

# 🔑 Important Points to Remember

* String is a sequence of characters.
* String indexing starts from `0`.
* `length()` gives the number of characters.
* `charAt()` is used to access a character.
* String traversal is usually done using a loop.
* `+` is used for String concatenation.
* Use `equals()` to compare String contents.
* The last character is at index:

```java
str.length() - 1
```

---

# 🎯 Class 1 Goal

After completing this class, you should be able to:

* Declare a String
* Take String input
* Find the length of a String
* Access individual characters
* Traverse a String
* Concatenate Strings
* Compare Strings
* Solve basic String problems using loops
