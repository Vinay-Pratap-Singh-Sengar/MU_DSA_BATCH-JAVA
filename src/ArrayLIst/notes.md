# Java ArrayList

## 1. What is ArrayList?

`ArrayList` is a class in Java used to store multiple values like an array, but its size can **grow and shrink dynamically**.

An array has a fixed size:

```java
int[] arr = new int[5];
```

Once the array is created with size `5`, we cannot directly increase its size.

With `ArrayList`, we can add or remove elements whenever required.

```java
ArrayList<Integer> list = new ArrayList<>();
```

---

# 2. Why do we need ArrayList?

### Array

```java
int[] arr = new int[5];
```

The size is fixed.

### ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
```

The size is dynamic.

### Simple Comparison

| Array                     | ArrayList              |
| ------------------------- | ---------------------- |
| Fixed size                | Dynamic size           |
| `arr.length`              | `list.size()`          |
| `arr[i]`                  | `list.get(i)`          |
| `arr[i] = 10`             | `list.set(i, 10)`      |
| Can store primitive types | Stores objects         |
| Part of Java language     | Class from `java.util` |

---

# 3. Import ArrayList

`ArrayList` belongs to the `java.util` package.

So we need to import it:

```java
import java.util.ArrayList;
```

Example:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

    }
}
```

---

# 4. Creating an ArrayList

Syntax:

```java
ArrayList<DataType> variableName = new ArrayList<>();
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();
```

Another example:

```java
ArrayList<String> names = new ArrayList<>();
```

---

# 5. Why `Integer` instead of `int`?

ArrayList works with **objects**, not primitive data types.

This is not allowed:

```java
ArrayList<int> list = new ArrayList<>();
```

Instead, use the wrapper class:

```java
ArrayList<Integer> list = new ArrayList<>();
```

### Primitive and Wrapper Classes

| Primitive | Wrapper Class |
| --------- | ------------- |
| `int`     | `Integer`     |
| `double`  | `Double`      |
| `char`    | `Character`   |
| `boolean` | `Boolean`     |
| `float`   | `Float`       |
| `long`    | `Long`        |

Example:

```java
ArrayList<Integer> numbers = new ArrayList<>();
ArrayList<Double> prices = new ArrayList<>();
ArrayList<Character> characters = new ArrayList<>();
ArrayList<String> names = new ArrayList<>();
```

---

# 6. Adding Elements

Use the `add()` method to add elements.

```java
list.add(10);
list.add(20);
list.add(30);
```

Complete example:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}
```

### Output

```text
[10, 20, 30]
```

---

# 7. ArrayList Index

ArrayList uses **0-based indexing**, just like arrays.

```text
Index:    0     1     2
          ↓     ↓     ↓
List:    10    20    30
```

So:

```java
list.get(0);   // 10
list.get(1);   // 20
list.get(2);   // 30
```

---

# 8. Accessing Elements Using `get()`

The `get()` method is used to access an element.

Syntax:

```java
list.get(index);
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list.get(1));
```

### Output

```text
20
```

### Array vs ArrayList

Array:

```java
arr[1]
```

ArrayList:

```java
list.get(1)
```

---

# 9. Updating Elements Using `set()`

The `set()` method is used to replace an existing element.

Syntax:

```java
list.set(index, value);
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

list.set(1, 100);

System.out.println(list);
```

### Before

```text
[10, 20, 30]
```

### After

```text
[10, 100, 30]
```

`set()` **replaces** an existing element.

---

# 10. Difference Between `add()` and `set()`

This is an important concept.

### `set()`

```java
list.set(1, 100);
```

It replaces the element at index `1`.

```text
Before:
[10, 20, 30]

After:
[10, 100, 30]
```

### `add(index, value)`

```java
list.add(1, 100);
```

It inserts a new element at index `1`.

```text
Before:
[10, 20, 30]

After:
[10, 100, 20, 30]
```

### Remember

```text
set() → Replace
add() → Insert
```

---

# 11. Adding Element at a Specific Index

We can insert an element at a particular index.

Syntax:

```java
list.add(index, value);
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

list.add(1, 100);

System.out.println(list);
```

Output:

```text
[10, 100, 20, 30]
```

---

# 12. Removing Elements

We can remove elements using `remove()`.

### Remove using index

```java
list.remove(1);
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

list.remove(1);

System.out.println(list);
```

Output:

```text
[10, 30]
```

The element at index `1` was removed.

---

# 13. Important: `remove()` with Integer

There is an important difference when working with `Integer`.

Suppose:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
```

If we write:

```java
list.remove(1);
```

Java treats `1` as an **index**.

So the result is:

```text
[10, 30]
```

If we want to remove the value `20`, use:

```java
list.remove(Integer.valueOf(20));
```

Result:

```text
[10, 30]
```

### Remember

```java
list.remove(1);
```

→ Remove element at index `1`

```java
list.remove(Integer.valueOf(20));
```

→ Remove the value `20`

---

# 14. Finding Size Using `size()`

The `size()` method returns the number of elements.

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list.size());
```

Output:

```text
3
```

### Array vs ArrayList

Array:

```java
arr.length
```

ArrayList:

```java
list.size()
```

Remember:

```text
Array      → length
ArrayList  → size()
```

---

# 15. Checking Element Using `contains()`

`contains()` checks whether an element exists in the ArrayList.

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list.contains(20));
System.out.println(list.contains(50));
```

Output:

```text
true
false
```

---

# 16. Finding Index Using `indexOf()`

`indexOf()` returns the first index of an element.

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
list.add(20);

System.out.println(list.indexOf(20));
```

Output:

```text
1
```

It returns the **first occurrence**.

---

# 17. Finding Last Index Using `lastIndexOf()`

`lastIndexOf()` returns the last occurrence of an element.

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
list.add(20);

System.out.println(list.lastIndexOf(20));
```

Output:

```text
3
```

---

# 18. Checking Empty ArrayList

Use `isEmpty()`.

```java
ArrayList<Integer> list = new ArrayList<>();

System.out.println(list.isEmpty());
```

Output:

```text
true
```

After adding an element:

```java
list.add(10);

System.out.println(list.isEmpty());
```

Output:

```text
false
```

---

# 19. Removing All Elements Using `clear()`

The `clear()` method removes all elements.

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list);

list.clear();

System.out.println(list);
```

Output:

```text
[10, 20, 30]
[]
```

---

# 20. Traversing ArrayList

We can traverse an ArrayList using a normal `for` loop.

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
list.add(40);

for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

Output:

```text
10
20
30
40
```

---

# 21. Enhanced For Loop

We can also use an enhanced `for` loop.

```java
for(int value : list) {
    System.out.println(value);
}
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

for(int value : list) {
    System.out.println(value);
}
```

Output:

```text
10
20
30
```

### Understand the loop

```java
for(int value : list)
```

It means:

> Take each element from `list` one by one and store it in `value`.

---

# 22. ArrayList of Strings

ArrayList can also store strings.

```java
ArrayList<String> names = new ArrayList<>();

names.add("Rahul");
names.add("Amit");
names.add("Neha");

System.out.println(names);
```

Output:

```text
[Rahul, Amit, Neha]
```

Traversal:

```java
for(String name : names) {
    System.out.println(name);
}
```

---

# 23. Taking User Input

We can use `Scanner` to take input and store it in an ArrayList.

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            int value = sc.nextInt();

            list.add(value);
        }

        System.out.println(list);
    }
}
```

### Input

```text
5
10 20 30 40 50
```

### Output

```text
[10, 20, 30, 40, 50]
```

---

# 24. Finding Sum of ArrayList

### Problem

Given an ArrayList, find the sum of all elements.

Example:

```text
Input:
[10, 20, 30, 40]

Output:
100
```

### Solution

```java
int sum = 0;

for(int i = 0; i < list.size(); i++) {

    sum = sum + list.get(i);
}

System.out.println(sum);
```

---

# 25. Find Maximum Element

### Problem

Find the maximum element in an ArrayList.

Example:

```text
Input:
[10, 50, 20, 40, 30]

Output:
50
```

### Solution

```java
int max = list.get(0);

for(int i = 1; i < list.size(); i++) {

    if(list.get(i) > max) {
        max = list.get(i);
    }
}

System.out.println(max);
```

---

# 26. Find Minimum Element

```java
int min = list.get(0);

for(int i = 1; i < list.size(); i++) {

    if(list.get(i) < min) {
        min = list.get(i);
    }
}

System.out.println(min);
```

---

# 27. Count Even Numbers

### Problem

Count the number of even elements in an ArrayList.

Example:

```text
Input:
[10, 15, 20, 25, 30]

Output:
3
```

### Solution

```java
int count = 0;

for(int value : list) {

    if(value % 2 == 0) {
        count++;
    }
}

System.out.println(count);
```

---

# 28. Count Odd Numbers

```java
int count = 0;

for(int value : list) {

    if(value % 2 != 0) {
        count++;
    }
}

System.out.println(count);
```

---

# 29. Search an Element

### Problem

Check whether a given number exists in the ArrayList.

Example:

```text
List:
[10, 20, 30, 40]

Target:
30

Output:
true
```

### Using `contains()`

```java
int target = 30;

if(list.contains(target)) {
    System.out.println(true);
}
else {
    System.out.println(false);
}
```

### Without using `contains()`

```java
int target = 30;
boolean found = false;

for(int value : list) {

    if(value == target) {
        found = true;
        break;
    }
}

System.out.println(found);
```

---

# 30. Count Frequency of an Element

### Problem

Count how many times a particular number occurs.

Example:

```text
List:
[10, 20, 10, 30, 10]

Target:
10

Output:
3
```

### Solution

```java
int target = 10;
int count = 0;

for(int value : list) {

    if(value == target) {
        count++;
    }
}

System.out.println(count);
```

---

# 31. Reverse an ArrayList

We can manually traverse from the last index.

```java
for(int i = list.size() - 1; i >= 0; i--) {

    System.out.print(list.get(i) + " ");
}
```

For:

```text
[10, 20, 30, 40]
```

Output:

```text
40 30 20 10
```

---

# 32. Sorting an ArrayList

Java provides the `Collections` class for common operations.

Import:

```java
import java.util.Collections;
```

Sort in ascending order:

```java
Collections.sort(list);
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(40);
list.add(10);
list.add(30);
list.add(20);

Collections.sort(list);

System.out.println(list);
```

Output:

```text
[10, 20, 30, 40]
```

---

# 33. Sort in Descending Order

```java
Collections.sort(list, Collections.reverseOrder());
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(40);
list.add(10);
list.add(30);
list.add(20);

Collections.sort(list, Collections.reverseOrder());

System.out.println(list);
```

Output:

```text
[40, 30, 20, 10]
```

---

# 34. Reverse Using Collections

We can reverse the actual ArrayList using:

```java
Collections.reverse(list);
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
list.add(40);

Collections.reverse(list);

System.out.println(list);
```

Output:

```text
[40, 30, 20, 10]
```

---

# 35. Maximum and Minimum Using Collections

We can use:

```java
Collections.max(list);
Collections.min(list);
```

Example:

```java
int max = Collections.max(list);
int min = Collections.min(list);

System.out.println("Maximum = " + max);
System.out.println("Minimum = " + min);
```

---

# 36. Important ArrayList Methods

| Method               | Description                    |
| -------------------- | ------------------------------ |
| `add(value)`         | Adds an element                |
| `add(index, value)`  | Inserts an element at an index |
| `get(index)`         | Returns an element             |
| `set(index, value)`  | Updates an element             |
| `remove(index)`      | Removes element by index       |
| `remove(Object)`     | Removes element by value       |
| `size()`             | Returns number of elements     |
| `contains(value)`    | Checks whether element exists  |
| `indexOf(value)`     | Returns first occurrence       |
| `lastIndexOf(value)` | Returns last occurrence        |
| `isEmpty()`          | Checks whether list is empty   |
| `clear()`            | Removes all elements           |

---

# 37. ArrayList + Collections Methods

| Method                                               | Purpose         |
| ---------------------------------------------------- | --------------- |
| `Collections.sort(list)`                             | Sort ascending  |
| `Collections.sort(list, Collections.reverseOrder())` | Sort descending |
| `Collections.reverse(list)`                          | Reverse list    |
| `Collections.max(list)`                              | Find maximum    |
| `Collections.min(list)`                              | Find minimum    |

---

# 38. Important Difference: Array vs ArrayList

```text
ARRAY

int[] arr = new int[5];

Fixed Size
   ↓
arr.length
   ↓
arr[index]
```

```text
ARRAYLIST

ArrayList<Integer> list = new ArrayList<>();

Dynamic Size
   ↓
list.size()
   ↓
list.get(index)
```

---

# 39. Practice Questions

## Basic

### Q1.

Create an ArrayList of integers and add 5 numbers.

### Q2.

Print all elements using a `for` loop.

### Q3.

Find the size of the ArrayList.

### Q4.

Print the first and last elements.

### Q5.

Update the element at index `2`.

### Q6.

Remove the element at index `1`.

---

## Intermediate

### Q7.

Find the sum of all elements.

### Q8.

Find the maximum element.

### Q9.

Find the minimum element.

### Q10.

Count even numbers.

### Q11.

Count odd numbers.

### Q12.

Search for a given element.

### Q13.

Find the frequency of a given element.

### Q14.

Print the ArrayList in reverse order.

### Q15.

Sort the ArrayList in ascending order.

---

## Advanced Practice

### Q16. Remove Duplicates

Given:

```text
[10, 20, 10, 30, 20]
```

Output:

```text
[10, 20, 30]
```

---

### Q17. Second Largest Element

Given:

```text
[10, 50, 20, 40, 30]
```

Output:

```text
40
```

---

### Q18. Merge Two ArrayLists

Given:

```text
List 1 = [10, 20, 30]

List 2 = [40, 50, 60]
```

Output:

```text
[10, 20, 30, 40, 50, 60]
```

---

### Q19. Common Elements

Given:

```text
List 1 = [10, 20, 30, 40]

List 2 = [20, 40, 50, 60]
```

Output:

```text
[20, 40]
```

---

### Q20. Remove All Even Numbers

Given:

```text
[10, 15, 20, 25, 30]
```

Output:

```text
[15, 25]
```

---

# 40. Quick Revision

Remember these important methods:

```java
list.add(10);              // Add
list.add(1, 20);           // Insert
list.get(0);               // Access
list.set(0, 100);          // Update
list.remove(0);            // Remove by index
list.remove(Integer.valueOf(10)); // Remove by value

list.size();               // Size
list.contains(10);         // Search
list.indexOf(10);          // First index
list.lastIndexOf(10);      // Last index
list.isEmpty();            // Check empty
list.clear();              // Remove all
```

Collections:

```java
Collections.sort(list);
Collections.reverse(list);
Collections.max(list);
Collections.min(list);
```

---

# Key Points to Remember

1. `ArrayList` is a **dynamic/resizable array**.
2. It belongs to the `java.util` package.
3. ArrayList stores **objects**, not primitive data types.
4. Use wrapper classes such as `Integer` instead of `int`.
5. Indexing starts from `0`.
6. `get()` is used to access an element.
7. `set()` is used to update an element.
8. `add()` is used to add or insert an element.
9. `remove()` is used to delete an element.
10. `size()` returns the number of elements.
11. `contains()` checks whether an element exists.
12. `Collections` provides useful operations such as sorting and reversing.
13. ArrayList is commonly used when the number of elements is not fixed.
