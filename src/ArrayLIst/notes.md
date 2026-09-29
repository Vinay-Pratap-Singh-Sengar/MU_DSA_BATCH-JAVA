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

# 8. Size vs Capacity

This is an important concept.

## Size

**Size = number of elements currently stored in the ArrayList.**

Example:

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

The list contains:

```text
[10, 20, 30]
```

Therefore:

```text
Size = 3
```

We use:

```java
list.size()
```

to find the current number of elements.

---

## Capacity

**Capacity = amount of internal storage currently available for storing elements.**

Conceptually:

```text
ArrayList

Capacity = 10

┌────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│ 10 │ 20 │ 30 │    │    │    │    │    │    │    │
└────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
   ↑     ↑     ↑
 elements currently stored

Size = 3
Capacity = 10
```

So:

```text
Size      = 3
Capacity  = 10
```

The important idea is:

> **Size tells us how many elements are currently present, while capacity refers to the internal storage available before the ArrayList needs to grow.**

---

## Important: `size()` does NOT return capacity

```java
list.size();
```

returns the **number of elements**, not the capacity.

Java's standard `ArrayList` API does not provide:

```java
list.capacity();   // ❌ No such method
```

So students should remember:

```text
size()     → Number of elements
capacity   → Internal storage
```

---

# 9. Initial Capacity

We can specify an initial capacity when creating an ArrayList.

```java
ArrayList<Integer> list = new ArrayList<>(100);
```

Here:

```text
100 = Initial Capacity
```

It does **not** mean that the ArrayList contains 100 elements.

Immediately after creation:

```java
System.out.println(list.size());
```

Output:

```text
0
```

So:

```text
Initial Capacity = 100
Size = 0
```

### Important

```java
ArrayList<Integer> list = new ArrayList<>(100);
```

means:

> Prepare internal storage with an initial capacity of 100.

It does **not** mean:

```text
100 elements are already present
```

---

# 10. What Happens When ArrayList Becomes Full?

Conceptually, suppose the current capacity is 10:

```text
Capacity = 10
Size = 10

[10][20][30][40][50][60][70][80][90][100]
```

Now we add another element:

```java
list.add(110);
```

The current internal storage has no free space.

ArrayList then:

1. Creates a larger internal array.
2. Copies/moves the existing elements.
3. Adds the new element.
4. Continues using the larger storage.

Conceptually:

```text
Old Capacity
10

       ↓ Grow

New Capacity
Larger than 10
```

The **exact growth amount is implementation-dependent** and should not be assumed to be a fixed number.

---

# 11. Size vs Capacity — Quick Comparison

| Size                                    | Capacity                              |
| --------------------------------------- | ------------------------------------- |
| Number of elements currently stored     | Internal storage available            |
| Changes when elements are added/removed | Grows when more storage is required   |
| Can be obtained using `size()`          | No public `capacity()` method         |
| Represents actual elements              | Represents allocated internal storage |
| Example: `3` elements                   | May have space for more elements      |

### Remember

```text
Size      → How many elements are present
Capacity  → How much internal storage is currently available
```

---

# 12. Accessing Elements Using `get()`

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

# 13. Updating Elements Using `set()`

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

# 14. Difference Between `add()` and `set()`

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

# 15. Adding Element at a Specific Index

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

# 16. Removing Elements

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

# 17. Important: `remove()` with Integer

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

# 18. Checking Element Using `contains()`

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

# 19. Finding Index Using `indexOf()`

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

# 20. Finding Last Index Using `lastIndexOf()`

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

# 21. Checking Empty ArrayList

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

# 22. Removing All Elements Using `clear()`

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

# 23. Traversing ArrayList

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

# 24. Enhanced For Loop

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

# 25. ArrayList of Strings

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

# 26. Taking User Input

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

# 27. Finding Sum of ArrayList

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

# 28. Find Maximum Element

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

# 29. Find Minimum Element

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

# 30. Count Even Numbers

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

# 31. Count Odd Numbers

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

# 32. Search an Element

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

# 33. Count Frequency of an Element

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

# 34. Reverse an ArrayList

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

# 35. Sorting an ArrayList

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

# 36. Sort in Descending Order

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

# 37. Reverse Using Collections

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

# 38. Maximum and Minimum Using Collections

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

# 39. Important ArrayList Methods

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

# 40. ArrayList + Collections Methods

| Method                                               | Purpose         |
| ---------------------------------------------------- | --------------- |
| `Collections.sort(list)`                             | Sort ascending  |
| `Collections.sort(list, Collections.reverseOrder())` | Sort descending |
| `Collections.reverse(list)`                          | Reverse list    |
| `Collections.max(list)`                              | Find maximum    |
| `Collections.min(list)`                              | Find minimum    |

---

# 41. Array vs ArrayList

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

# 42. Practice Questions

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

# 43. Quick Revision

## Creating ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
```

## Adding

```java
list.add(10);
```

## Accessing

```java
list.get(0);
```

## Updating

```java
list.set(0, 100);
```

## Removing by index

```java
list.remove(0);
```

## Removing by value

```java
list.remove(Integer.valueOf(10));
```

## Size

```java
list.size();
```

## Searching

```java
list.contains(10);
```

## First occurrence

```java
list.indexOf(10);
```

## Last occurrence

```java
list.lastIndexOf(10);
```

## Empty check

```java
list.isEmpty();
```

## Remove everything

```java
list.clear();
```

## Sorting

```java
Collections.sort(list);
```

## Reverse

```java
Collections.reverse(list);
```

## Maximum

```java
Collections.max(list);
```

## Minimum

```java
Collections.min(list);
```

---

# 44. Key Points to Remember

1. `ArrayList` is a **dynamic/resizable collection**.
2. It belongs to the `java.util` package.
3. ArrayList stores **objects**, not primitive data types.
4. Use wrapper classes such as `Integer` instead of `int`.
5. Indexing starts from `0`.
6. `get()` is used to access an element.
7. `set()` is used to update an element.
8. `add()` is used to add or insert an element.
9. `remove()` is used to delete an element.
10. `size()` returns the **current number of elements**.
11. Capacity refers to the **internal storage available**.
12. `size()` and capacity are **not the same thing**.
13. `ArrayList` does not provide a public `capacity()` method.
14. An initial capacity can be provided while creating an ArrayList.
15. ArrayList automatically grows when more storage is required.
16. `contains()` checks whether an element exists.
17. `Collections` provides useful operations such as sorting and reversing.
18. ArrayList is useful when the number of elements is not fixed.
