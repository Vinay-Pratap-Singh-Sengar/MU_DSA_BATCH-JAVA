# Class 2 — String Methods in Java

## 📚 Topics Covered

In this class, we will learn some important **String methods in Java** that are commonly used while solving DSA problems.

### Methods Covered

1. `substring()`
2. `indexOf()`
3. `lastIndexOf()`
4. `contains()`
5. `startsWith()`
6. `endsWith()`
7. `toUpperCase()`
8. `toLowerCase()`
9. `replace()`
10. `split()`

---

# 1. `substring()`

The `substring()` method is used to extract a part of a String.

## Syntax

```java
str.substring(startIndex)
```

or

```java
str.substring(startIndex, endIndex)
```

**Important:** `endIndex` is not included.

### Example 1

```java
String str = "HelloWorld";

String result = str.substring(5);

System.out.println(result);
```

Output:

```text
World
```

### Example 2

```java
String str = "HelloWorld";

String result = str.substring(0, 5);

System.out.println(result);
```

Output:

```text
Hello
```

Indexes:

```text
 H  e  l  l  o  W  o  r  l  d
 0  1  2  3  4  5  6  7  8  9
```

So:

```java
str.substring(0, 5)
```

means:

```text
Start from 0
Stop before 5
```

---

# 2. `indexOf()`

The `indexOf()` method returns the index of the **first occurrence** of a character or String.

### Example

```java
String str = "Hello";

System.out.println(str.indexOf('l'));
```

Output:

```text
2
```

The String is:

```text
 H  e  l  l  o
 0  1  2  3  4
```

The first `l` is at index `2`.

### Searching for a String

```java
String str = "Hello Java";

System.out.println(str.indexOf("Java"));
```

Output:

```text
6
```

### If not found

```java
String str = "Hello";

System.out.println(str.indexOf('x'));
```

Output:

```text
-1
```

So:

```text
-1 → character/String not found
```

---

# 3. `lastIndexOf()`

The `lastIndexOf()` method returns the index of the **last occurrence** of a character or String.

### Example

```java
String str = "Hello";

System.out.println(str.lastIndexOf('l'));
```

Output:

```text
3
```

Indexes:

```text
 H  e  l  l  o
 0  1  2  3  4
```

The last `l` is at index `3`.

### Another Example

```java
String str = "Java Programming";

System.out.println(str.lastIndexOf('a'));
```

Output:

```text
3
```

---

# 4. `contains()`

The `contains()` method checks whether a String contains a particular character sequence.

It returns:

```text
true
```

or

```text
false
```

### Example

```java
String str = "Hello Java";

System.out.println(str.contains("Java"));
```

Output:

```text
true
```

### Example

```java
String str = "Hello Java";

System.out.println(str.contains("Python"));
```

Output:

```text
false
```

### Important

`contains()` is case-sensitive.

```java
String str = "Hello";

System.out.println(str.contains("hello"));
```

Output:

```text
false
```

---

# 5. `startsWith()`

The `startsWith()` method checks whether a String starts with a particular String.

### Example

```java
String str = "Hello Java";

System.out.println(str.startsWith("Hello"));
```

Output:

```text
true
```

### Example

```java
String str = "Hello Java";

System.out.println(str.startsWith("Java"));
```

Output:

```text
false
```

---

# 6. `endsWith()`

The `endsWith()` method checks whether a String ends with a particular String.

### Example

```java
String str = "Hello Java";

System.out.println(str.endsWith("Java"));
```

Output:

```text
true
```

### Example

```java
String str = "Hello Java";

System.out.println(str.endsWith("Hello"));
```

Output:

```text
false
```

---

# 7. `toUpperCase()`

The `toUpperCase()` method converts all alphabetic characters into uppercase.

### Example

```java
String str = "hello java";

System.out.println(str.toUpperCase());
```

Output:

```text
HELLO JAVA
```

### Important

The original String does not change.

```java
String str = "hello";

str.toUpperCase();

System.out.println(str);
```

Output:

```text
hello
```

To store the result:

```java
str = str.toUpperCase();
```

---

# 8. `toLowerCase()`

The `toLowerCase()` method converts all alphabetic characters into lowercase.

### Example

```java
String str = "HELLO JAVA";

System.out.println(str.toLowerCase());
```

Output:

```text
hello java
```

### Example

```java
String str = "Hello Java";

str = str.toLowerCase();

System.out.println(str);
```

Output:

```text
hello java
```

---

# 9. `replace()`

The `replace()` method is used to replace characters or character sequences.

## Replace a Character

```java
String str = "banana";

String result = str.replace('a', 'o');

System.out.println(result);
```

Output:

```text
bonono
```

## Replace a String

```java
String str = "I like Java";

String result = str.replace("Java", "C++");

System.out.println(result);
```

Output:

```text
I like C++
```

### Removing Characters

We can replace a character with an empty String.

```java
String str = "hello world";

str = str.replace(" ", "");

System.out.println(str);
```

Output:

```text
helloworld
```

This is useful for removing spaces.

---

# 10. `split()`

The `split()` method is used to divide a String into multiple parts.

It returns a **String array**.

### Example

```java
String str = "Java is easy";

String[] words = str.split(" ");

for (int i = 0; i < words.length; i++) {
    System.out.println(words[i]);
}
```

Output:

```text
Java
is
easy
```

Here:

```java
str.split(" ")
```

means split the String wherever a space occurs.

### Example

```java
String str = "apple,banana,mango";

String[] fruits = str.split(",");

for (int i = 0; i < fruits.length; i++) {
    System.out.println(fruits[i]);
}
```

Output:

```text
apple
banana
mango
```

---

# 📌 Quick Revision Table

| Method          | Purpose                            | Example                   |
| --------------- | ---------------------------------- | ------------------------- |
| `substring()`   | Extract part of String             | `str.substring(2, 5)`     |
| `indexOf()`     | Find first occurrence              | `str.indexOf('a')`        |
| `lastIndexOf()` | Find last occurrence               | `str.lastIndexOf('a')`    |
| `contains()`    | Check if String contains something | `str.contains("Java")`    |
| `startsWith()`  | Check beginning                    | `str.startsWith("Hello")` |
| `endsWith()`    | Check ending                       | `str.endsWith("Java")`    |
| `toUpperCase()` | Convert to uppercase               | `str.toUpperCase()`       |
| `toLowerCase()` | Convert to lowercase               | `str.toLowerCase()`       |
| `replace()`     | Replace characters/String          | `str.replace('a', 'b')`   |
| `split()`       | Divide String into parts           | `str.split(" ")`          |

---

# 📝 Practice Questions

## 1. Reverse String

Write a Java program to reverse a String.

### Example

Input:

```text
hello
```

Output:

```text
olleh
```

### Hint

Use:

```java
charAt()
```

and a loop.

Start from:

```java
str.length() - 1
```

---

## 2. Remove Spaces

Write a Java program to remove all spaces from a String.

### Example

Input:

```text
Java is easy
```

Output:

```text
Javaiseasy
```

### Hint

Use:

```java
replace()
```

Example:

```java
str.replace(" ", "")
```

---

## 3. Count Words

Write a Java program to count the number of words in a String.

### Example

Input:

```text
Java is very easy
```

Output:

```text
4
```

### Hint

Use:

```java
split(" ")
```

Then use:

```java
words.length
```

---

## 4. Find Character

Write a Java program to find the position of a character in a String.

### Example

Input:

```text
String: programming
Character: g
```

Output:

```text
4
```

### Hint

Use:

```java
indexOf()
```

---

## 5. Extract Substring

Write a Java program to extract a part of a String using `substring()`.

### Example

Input:

```text
String: HelloWorld
Start: 0
End: 5
```

Output:

```text
Hello
```

### Hint

Use:

```java
str.substring(start, end)
```

Remember:

**The end index is not included.**

---

# 🎯 Class 2 Goal

After completing this class, you should be able to:

* Extract part of a String using `substring()`
* Find characters using `indexOf()`
* Find the last occurrence using `lastIndexOf()`
* Check whether a String contains another String
* Check the beginning and ending of a String
* Convert Strings to uppercase and lowercase
* Replace characters or Strings
* Split a String into multiple parts
* Solve basic String problems using these methods

---

# 🔑 Important DSA Tip

String methods are useful, but try to understand **how they work internally**.

For basic DSA problems, practice solving problems using:

```text
String
↓
length()
↓
charAt()
↓
Loop
↓
Condition
```

Once these basics are strong, methods such as `substring()`, `indexOf()`, `replace()`, and `split()` become much easier to use.
