# Class 3 — StringBuilder in Java

## 📚 Topics Covered

In this class, we will learn about **StringBuilder** and why it is useful when we need to modify Strings.

### Topics

1. Why String is Immutable
2. What is StringBuilder?
3. Creating a StringBuilder
4. `append()`
5. `setCharAt()`
6. `delete()`
7. `reverse()`
8. `toString()`

---

# 1. Why is String Immutable?

Before learning StringBuilder, we need to understand one important concept:

> **String is immutable in Java.**

**Immutable** means that once a String object is created, its content cannot be changed.

### Example

```java
String str = "Hello";

str = str + " Java";

System.out.println(str);
```

Output:

```text
Hello Java
```

It may look like the original String was modified.

But actually, Java creates a **new String**.

Conceptually:

```text
"Hello"
   ↓
"Hello Java"
```

The original `"Hello"` String was not changed.

---

# 2. Example of String Immutability

Consider:

```java
String str = "Hello";

str.concat(" Java");

System.out.println(str);
```

Output:

```text
Hello
```

Why?

Because `concat()` creates a new String, but we did not store the result.

To get the changed value:

```java
String str = "Hello";

str = str.concat(" Java");

System.out.println(str);
```

Output:

```text
Hello Java
```

---

# 3. What is StringBuilder?

`StringBuilder` is a Java class used to create and modify a sequence of characters.

Unlike String, a `StringBuilder` object is **mutable**.

**Mutable** means:

> We can change its content without creating a new object for every modification.

### Example

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" Java");

System.out.println(sb);
```

Output:

```text
Hello Java
```

Here, the same `StringBuilder` can be modified.

---

# 4. Creating StringBuilder

We can create a StringBuilder using:

```java
StringBuilder sb = new StringBuilder();
```

This creates an empty StringBuilder.

### Example

```java
StringBuilder sb = new StringBuilder();

System.out.println(sb);
```

Output:

```text
```

We can also create it with an initial String:

```java
StringBuilder sb = new StringBuilder("Hello");

System.out.println(sb);
```

Output:

```text
Hello
```

---

# 5. `append()`

The `append()` method is used to add characters or Strings at the end.

### Example

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" Java");

System.out.println(sb);
```

Output:

```text
Hello Java
```

### Appending Multiple Values

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" ");
sb.append("Java");

System.out.println(sb);
```

Output:

```text
Hello Java
```

### Append Numbers

`append()` can also add numbers.

```java
StringBuilder sb = new StringBuilder("Age: ");

sb.append(20);

System.out.println(sb);
```

Output:

```text
Age: 20
```

---

# 6. `setCharAt()`

The `setCharAt()` method is used to **change a character at a particular index**.

### Syntax

```java
sb.setCharAt(index, character);
```

### Example

```java
StringBuilder sb = new StringBuilder("Hello");

sb.setCharAt(0, 'Y');

System.out.println(sb);
```

Output:

```text
Yello
```

Indexes:

```text
 H  e  l  l  o
 0  1  2  3  4
```

After:

```java
sb.setCharAt(0, 'Y');
```

It becomes:

```text
 Y  e  l  l  o
 0  1  2  3  4
```

### Another Example

```java
StringBuilder sb = new StringBuilder("Java");

sb.setCharAt(0, 'K');

System.out.println(sb);
```

Output:

```text
Kava
```

---

# 7. `delete()`

The `delete()` method is used to remove characters from a StringBuilder.

### Syntax

```java
sb.delete(startIndex, endIndex);
```

**Important:** `endIndex` is not included.

### Example

```java
StringBuilder sb = new StringBuilder("Hello Java");

sb.delete(5, 10);

System.out.println(sb);
```

Output:

```text
Hello
```

Indexes:

```text
 H  e  l  l  o     J  a  v  a
 0  1  2  3  4  5  6  7  8  9
```

```java
sb.delete(5, 10);
```

removes indexes:

```text
5, 6, 7, 8, 9
```

So:

```text
Hello Java
     ↓
Hello
```

---

# 8. `reverse()`

The `reverse()` method reverses the contents of a StringBuilder.

### Example

```java
StringBuilder sb = new StringBuilder("Hello");

sb.reverse();

System.out.println(sb);
```

Output:

```text
olleH
```

### Another Example

```java
StringBuilder sb = new StringBuilder("Java");

sb.reverse();

System.out.println(sb);
```

Output:

```text
avaJ
```

---

# 9. `toString()`

The `toString()` method converts a `StringBuilder` into a normal `String`.

### Example

```java
StringBuilder sb = new StringBuilder("Hello");

String str = sb.toString();

System.out.println(str);
```

Output:

```text
Hello
```

This is useful when a method or problem requires a `String`.

### Example

```java
StringBuilder sb = new StringBuilder("Java");

sb.reverse();

String result = sb.toString();

System.out.println(result);
```

Output:

```text
avaJ
```

---

# 10. String vs StringBuilder

| Feature                        | String         | StringBuilder      |
| ------------------------------ | -------------- | ------------------ |
| Mutable                        | ❌ No           | ✅ Yes              |
| Can modify characters directly | ❌ No           | ✅ Yes              |
| `setCharAt()`                  | ❌ No           | ✅ Yes              |
| `append()`                     | ❌ No           | ✅ Yes              |
| `delete()`                     | ❌ No           | ✅ Yes              |
| `reverse()`                    | ❌ No           | ✅ Yes              |
| `toString()`                   | Already String | Converts to String |

### Simple Example

#### String

```java
String str = "Hello";

str = str + " Java";
```

A new String is created.

#### StringBuilder

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" Java");
```

The StringBuilder itself is modified.

---

# 11. StringBuilder and Loops

StringBuilder is very useful when building a String inside a loop.

### Example

Print numbers from 1 to 5:

```java
StringBuilder sb = new StringBuilder();

for (int i = 1; i <= 5; i++) {
    sb.append(i);
}

System.out.println(sb);
```

Output:

```text
12345
```

### Adding Spaces

```java
StringBuilder sb = new StringBuilder();

for (int i = 1; i <= 5; i++) {
    sb.append(i).append(" ");
}

System.out.println(sb);
```

Output:

```text
1 2 3 4 5
```

---

# 📝 Practice Questions

## 1. Reverse String

Write a Java program to reverse a String using `StringBuilder`.

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
StringBuilder sb = new StringBuilder(str);

sb.reverse();
```

---

## 2. Modify Characters

Write a Java program to change a character at a particular index using `setCharAt()`.

### Example

Input:

```text
Java
```

Change index `0` to `K`.

Output:

```text
Kava
```

### Hint

Use:

```java
sb.setCharAt(0, 'K');
```

---

## 3. Build a String

Write a Java program that builds a String using `StringBuilder` and `append()`.

### Example

Build:

```text
Hello Java
```

### Expected Output

```text
Hello Java
```

### Hint

Use:

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" ");
sb.append("Java");

System.out.println(sb);
```

---

# 🎯 Class 3 Goal

After completing this class, you should be able to:

* Understand String immutability
* Understand the difference between String and StringBuilder
* Create a StringBuilder
* Add content using `append()`
* Modify characters using `setCharAt()`
* Remove characters using `delete()`
* Reverse a StringBuilder using `reverse()`
* Convert StringBuilder into String using `toString()`
* Use StringBuilder while solving basic DSA problems

---

# 🔑 Important DSA Tip

When you need to **modify a String many times**, `StringBuilder` is often more convenient than repeatedly creating new Strings.

Remember:

```text
String
↓
Immutable
↓
Cannot directly modify its characters
```

Whereas:

```text
StringBuilder
↓
Mutable
↓
Can modify its contents
```

### Most Important Methods

```java
append()
setCharAt()
delete()
reverse()
toString()
```

Practice these methods before moving to the next String class.
