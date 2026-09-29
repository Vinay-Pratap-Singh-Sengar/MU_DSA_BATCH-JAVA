# Java Arrays

## 1. What is an Array?

An **array** is a collection of elements of the **same data type** stored under one variable name.

Instead of creating multiple variables:

```java
int a = 10;
int b = 20;
int c = 30;
int d = 40;
```

We can use an array:

```java
int[] arr = {10, 20, 30, 40};
```

Now all four values are stored inside one variable:

```text
arr
 ↓
[10] [20] [30] [40]
```

---

# 2. Why Do We Need Arrays?

Suppose we want to store marks of 5 students.

Without an array:

```java
int marks1 = 80;
int marks2 = 75;
int marks3 = 90;
int marks4 = 85;
int marks5 = 70;
```

This becomes difficult to manage.

Using an array:

```java
int[] marks = {80, 75, 90, 85, 70};
```

Now we can process all values using loops.

---

# 3. Important Features of an Array

An array has the following properties:

1. Stores multiple values.
2. All elements must have the same data type.
3. Array size is fixed after creation.
4. Indexing starts from `0`.
5. Elements are accessed using an index.
6. Array has a `length` property.
7. Arrays can store primitive values as well as objects.

---

# 4. Creating an Array

There are multiple ways to create an array.

## Method 1: Declare and Initialize Together

```java
int[] arr = {10, 20, 30, 40, 50};
```

This creates an array containing 5 elements.

---

## Method 2: Declare First, Create Later

```java
int[] arr;

arr = new int[5];
```

Here, an array of size `5` is created.

---

## Method 3: Declare and Create Together

```java
int[] arr = new int[5];
```

This creates an array that can store `5` integers.

---

# 5. Array Syntax

General syntax:

```java
dataType[] arrayName = new dataType[size];
```

Example:

```java
int[] numbers = new int[5];
```

Here:

```text
int       → Data type
[]        → Array
numbers   → Array variable
new       → Creates a new object
5         → Array size
```

---

# 6. Array Index

Array indexing starts from **0**.

For:

```java
int[] arr = {10, 20, 30, 40, 50};
```

The indexes are:

```text
Index:     0    1    2    3    4
           ↓    ↓    ↓    ↓    ↓
Array:    10   20   30   40   50
```

Therefore:

```java
arr[0] → 10
arr[1] → 20
arr[2] → 30
arr[3] → 40
arr[4] → 50
```

---

# 7. Accessing Array Elements

We can access an element using its index.

```java
int[] arr = {10, 20, 30, 40, 50};

System.out.println(arr[0]);
System.out.println(arr[2]);
System.out.println(arr[4]);
```

Output:

```text
10
30
50
```

---

# 8. Updating an Array Element

We can change an element using its index.

```java
int[] arr = {10, 20, 30, 40, 50};

arr[2] = 100;

System.out.println(arr[2]);
```

Output:

```text
100
```

Before:

```text
[10, 20, 30, 40, 50]
```

After:

```text
[10, 20, 100, 40, 50]
```

---

# 9. Array Length

The `length` property gives the number of elements in an array.

```java
int[] arr = {10, 20, 30, 40, 50};

System.out.println(arr.length);
```

Output:

```text
5
```

### Important

For an array:

```java
arr.length
```

There are **no parentheses**.

For an ArrayList:

```java
list.size()
```

There are parentheses because `size()` is a method.

---

# 10. Array Size is Fixed

Once an array is created, its size cannot be changed.

Example:

```java
int[] arr = new int[5];
```

This array can store exactly 5 elements.

We cannot make it 10 elements directly.

```text
Array size = 5

[ ][ ][ ][ ][ ]
```

The size remains `5` throughout the lifetime of that array.

If we need a dynamically growing collection, we can use `ArrayList`.

---

# 11. Default Values in an Array

When we create an array using `new`, Java automatically assigns default values.

Example:

```java
int[] arr = new int[5];

System.out.println(arr[0]);
```

Output:

```text
0
```

For different data types:

| Data Type     | Default Value |
| ------------- | ------------- |
| `int`         | `0`           |
| `double`      | `0.0`         |
| `float`       | `0.0`         |
| `long`        | `0`           |
| `char`        | `'\u0000'`    |
| `boolean`     | `false`       |
| Object/String | `null`        |

Example:

```java
int[] numbers = new int[3];
```

Conceptually:

```text
[0] [0] [0]
```

---

# 12. Taking Array Input from User

We can use `Scanner` to take input.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
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
10
20
30
40
50
```

---

# 13. Traversing an Array

Traversal means visiting every element of an array.

We commonly use a `for` loop.

```java
int[] arr = {10, 20, 30, 40, 50};

for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Output:

```text
10
20
30
40
50
```

---

# 14. Enhanced For Loop

Java also provides an enhanced `for` loop.

```java
int[] arr = {10, 20, 30, 40, 50};

for(int value : arr) {
    System.out.println(value);
}
```

Here:

```java
for(int value : arr)
```

means:

> Take each element from `arr` one by one and store it in `value`.

---

# 15. Difference Between Normal and Enhanced For Loop

### Normal `for` loop

```java
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Useful when we need the **index**.

### Enhanced `for` loop

```java
for(int value : arr) {
    System.out.println(value);
}
```

Useful when we only need the **values**.

---

# 16. Find Sum of Array Elements

### Problem

Find the sum of all elements.

Example:

```text
Input:
[10, 20, 30, 40]

Output:
100
```

### Solution

```java
int[] arr = {10, 20, 30, 40};

int sum = 0;

for(int i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}

System.out.println(sum);
```

Output:

```text
100
```

---

# 17. Find Maximum Element

### Problem

Find the maximum element in an array.

Example:

```text
Input:
[10, 50, 20, 40, 30]

Output:
50
```

### Solution

```java
int[] arr = {10, 50, 20, 40, 30};

int max = arr[0];

for(int i = 1; i < arr.length; i++) {

    if(arr[i] > max) {
        max = arr[i];
    }
}

System.out.println(max);
```

---

# 18. Find Minimum Element

```java
int[] arr = {10, 50, 20, 40, 30};

int min = arr[0];

for(int i = 1; i < arr.length; i++) {

    if(arr[i] < min) {
        min = arr[i];
    }
}

System.out.println(min);
```

Output:

```text
10
```

---

# 19. Count Even Numbers

### Problem

Count the number of even elements.

Example:

```text
Input:
[10, 15, 20, 25, 30]

Output:
3
```

### Solution

```java
int[] arr = {10, 15, 20, 25, 30};

int count = 0;

for(int i = 0; i < arr.length; i++) {

    if(arr[i] % 2 == 0) {
        count++;
    }
}

System.out.println(count);
```

---

# 20. Count Odd Numbers

```java
int[] arr = {10, 15, 20, 25, 30};

int count = 0;

for(int i = 0; i < arr.length; i++) {

    if(arr[i] % 2 != 0) {
        count++;
    }
}

System.out.println(count);
```

Output:

```text
2
```

---

# 21. Search an Element

### Problem

Search whether a given element exists in an array.

Example:

```text
Array:
[10, 20, 30, 40]

Target:
30

Output:
true
```

### Solution

```java
int[] arr = {10, 20, 30, 40};

int target = 30;

boolean found = false;

for(int i = 0; i < arr.length; i++) {

    if(arr[i] == target) {
        found = true;
        break;
    }
}

System.out.println(found);
```

---

# 22. Find Index of an Element

### Problem

Find the index of a target element.

```java
int[] arr = {10, 20, 30, 40};

int target = 30;

int index = -1;

for(int i = 0; i < arr.length; i++) {

    if(arr[i] == target) {
        index = i;
        break;
    }
}

System.out.println(index);
```

Output:

```text
2
```

If the element is not found, the answer remains:

```text
-1
```

---

# 23. Count Frequency of an Element

### Problem

Count how many times a number occurs.

Example:

```text
Array:
[10, 20, 10, 30, 10]

Target:
10

Output:
3
```

### Solution

```java
int[] arr = {10, 20, 10, 30, 10};

int target = 10;
int count = 0;

for(int i = 0; i < arr.length; i++) {

    if(arr[i] == target) {
        count++;
    }
}

System.out.println(count);
```

---

# 24. Reverse an Array

Example:

```text
Input:
[10, 20, 30, 40, 50]

Output:
[50, 40, 30, 20, 10]
```

One way to print in reverse:

```java
int[] arr = {10, 20, 30, 40, 50};

for(int i = arr.length - 1; i >= 0; i--) {
    System.out.print(arr[i] + " ");
}
```

Output:

```text
50 40 30 20 10
```

---

# 25. Reverse the Actual Array

To modify the actual array, use two pointers.

```java
int[] arr = {10, 20, 30, 40, 50};

int left = 0;
int right = arr.length - 1;

while(left < right) {

    int temp = arr[left];

    arr[left] = arr[right];

    arr[right] = temp;

    left++;
    right--;
}
```

After reversing:

```text
[50, 40, 30, 20, 10]
```

### Two Pointer Concept

```text
[10, 20, 30, 40, 50]
 ↑                    ↑
left                right
```

Swap:

```text
[50, 20, 30, 40, 10]
```

Move pointers:

```text
    ↑              ↑
   left           right
```

Continue until:

```text
left >= right
```

---

# 26. Copying an Array

We can create another array and copy elements.

```java
int[] arr = {10, 20, 30, 40, 50};

int[] copy = new int[arr.length];

for(int i = 0; i < arr.length; i++) {
    copy[i] = arr[i];
}
```

Now:

```text
arr  = [10, 20, 30, 40, 50]

copy = [10, 20, 30, 40, 50]
```

---

# 27. Comparing Two Arrays

Do not use:

```java
arr1 == arr2
```

to compare the contents of two arrays.

Use:

```java
Arrays.equals(arr1, arr2);
```

First import:

```java
import java.util.Arrays;
```

Example:

```java
int[] arr1 = {10, 20, 30};
int[] arr2 = {10, 20, 30};

System.out.println(Arrays.equals(arr1, arr2));
```

Output:

```text
true
```

---

# 28. Printing an Array

If we directly write:

```java
int[] arr = {10, 20, 30};

System.out.println(arr);
```

It does **not** print the elements in the normal array format.

Use:

```java
import java.util.Arrays;

System.out.println(Arrays.toString(arr));
```

Output:

```text
[10, 20, 30]
```

---

# 29. Sorting an Array

Java provides `Arrays.sort()`.

Import:

```java
import java.util.Arrays;
```

Example:

```java
int[] arr = {40, 10, 30, 20};

Arrays.sort(arr);

System.out.println(Arrays.toString(arr));
```

Output:

```text
[10, 20, 30, 40]
```

---

# 30. Find Maximum and Minimum Using `Arrays`

We can use loops to understand the logic.

For maximum:

```java
int max = arr[0];

for(int i = 1; i < arr.length; i++) {

    if(arr[i] > max) {
        max = arr[i];
    }
}
```

For minimum:

```java
int min = arr[0];

for(int i = 1; i < arr.length; i++) {

    if(arr[i] < min) {
        min = arr[i];
    }
}
```

This is preferred when learning DSA because students should understand the logic rather than depending only on library methods.

---

# 31. Array of Strings

Arrays can store strings.

```java
String[] names = {
    "Rahul",
    "Amit",
    "Neha",
    "Priya"
};
```

Access:

```java
System.out.println(names[0]);
```

Output:

```text
Rahul
```

Traversal:

```java
for(int i = 0; i < names.length; i++) {
    System.out.println(names[i]);
}
```

---

# 32. Character Array

We can create an array of characters.

```java
char[] letters = {'A', 'B', 'C', 'D'};
```

Access:

```java
System.out.println(letters[0]);
```

Output:

```text
A
```

Traversal:

```java
for(char ch : letters) {
    System.out.println(ch);
}
```

---

# 33. Boolean Array

```java
boolean[] values = {true, false, true, false};
```

Traversal:

```java
for(boolean value : values) {
    System.out.println(value);
}
```

---

# 34. Array of Doubles

```java
double[] prices = {10.5, 20.5, 30.5};
```

Traversal:

```java
for(double price : prices) {
    System.out.println(price);
}
```

---

# 35. Passing Array to a Method

An array can be passed to a method.

```java
public static void printArray(int[] arr) {

    for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
```

Calling the method:

```java
int[] arr = {10, 20, 30};

printArray(arr);
```

Complete example:

```java
public class Main {

    public static void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        printArray(arr);
    }
}
```

---

# 36. Returning an Array from a Method

A method can also return an array.

```java
public static int[] createArray() {

    int[] arr = {10, 20, 30};

    return arr;
}
```

Calling:

```java
int[] result = createArray();
```

---

# 37. Array Out of Bounds

Array indexes must be within the valid range.

Suppose:

```java
int[] arr = {10, 20, 30};
```

Valid indexes are:

```text
0
1
2
```

This is invalid:

```java
System.out.println(arr[3]);
```

It causes:

```text
ArrayIndexOutOfBoundsException
```

### Remember

For an array of size `n`:

```text
First index = 0
Last index  = n - 1
```

Example:

```text
Size = 5

Valid indexes:
0 1 2 3 4

Last index = 5 - 1 = 4
```

---

# 38. Important Array Formula

If:

```java
int[] arr = new int[n];
```

Then:

```text
First Index = 0

Last Index = n - 1

Number of Elements = n
```

Example:

```java
int[] arr = new int[10];
```

Therefore:

```text
Size       = 10
First Index = 0
Last Index  = 9
```

---

# 39. One-Dimensional Array

The arrays we have studied so far are **one-dimensional arrays**.

Example:

```java
int[] arr = {10, 20, 30, 40};
```

Visual representation:

```text
[10] [20] [30] [40]
```

---

# 40. Two-Dimensional Array

A two-dimensional array is like a table containing rows and columns.

Example:

```java
int[][] matrix = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
```

Visual representation:

```text
       Column
        0   1   2

Row 0  10  20  30
Row 1  40  50  60
Row 2  70  80  90
```

Access an element:

```java
System.out.println(matrix[1][2]);
```

Output:

```text
60
```

Because:

```text
matrix[1][2]

Row    = 1
Column = 2

Value  = 60
```

---

# 41. Creating a 2D Array

```java
int[][] matrix = new int[3][3];
```

This creates:

```text
3 rows
3 columns
```

Total elements:

```text
3 × 3 = 9
```

---

# 42. Traversing a 2D Array

We use nested loops.

```java
int[][] matrix = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};

for(int i = 0; i < matrix.length; i++) {

    for(int j = 0; j < matrix[i].length; j++) {

        System.out.print(matrix[i][j] + " ");
    }

    System.out.println();
}
```

Output:

```text
10 20 30
40 50 60
70 80 90
```

---

# 43. 2D Array Input

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
```

---

# 44. Jagged Array

In Java, a 2D array can have different numbers of columns in different rows.

Example:

```java
int[][] arr = new int[3][];

arr[0] = new int[2];
arr[1] = new int[4];
arr[2] = new int[3];
```

Conceptually:

```text
Row 0 → [ ][ ]

Row 1 → [ ][ ][ ][ ]

Row 2 → [ ][ ][ ]
```

This is called a **jagged array**.

---

# 45. Important Array Methods from `Arrays`

Java provides the `Arrays` utility class.

Import:

```java
import java.util.Arrays;
```

### Print Array

```java
Arrays.toString(arr);
```

### Sort Array

```java
Arrays.sort(arr);
```

### Compare Arrays

```java
Arrays.equals(arr1, arr2);
```

### Fill Array

```java
Arrays.fill(arr, 0);
```

Example:

```java
int[] arr = new int[5];

Arrays.fill(arr, 10);

System.out.println(Arrays.toString(arr));
```

Output:

```text
[10, 10, 10, 10, 10]
```

---

# 46. Array vs ArrayList

| Array                     | ArrayList                    |
| ------------------------- | ---------------------------- |
| Fixed size                | Dynamic size                 |
| `arr.length`              | `list.size()`                |
| `arr[index]`              | `list.get(index)`            |
| `arr[index] = value`      | `list.set(index, value)`     |
| Primitive types allowed   | Uses objects/wrapper classes |
| Can be created with `new` | Class from `java.util`       |
| Size cannot change        | Size can grow/shrink         |

### Remember

```text
Array     → Fixed Size
ArrayList → Dynamic Size
```

---

# 47. Common Mistakes

## Mistake 1: Starting index from 1

Wrong:

```java
arr[1]
```

thinking it is the first element.

Correct:

```java
arr[0]
```

---

## Mistake 2: Using `length()`

Wrong:

```java
arr.length()
```

Correct:

```java
arr.length
```

`length` is a property, not a method.

---

## Mistake 3: Accessing invalid index

For:

```java
int[] arr = new int[5];
```

This is invalid:

```java
arr[5]
```

Valid indexes are:

```text
0 1 2 3 4
```

---

## Mistake 4: Trying to change array size

Once created:

```java
int[] arr = new int[5];
```

the array size cannot be changed.

If dynamic size is required, consider:

```java
ArrayList<Integer>
```

---

# 48. Practice Questions

## Basic

### Q1.

Create an integer array of size 5 and store 5 numbers.

### Q2.

Print all elements of an array.

### Q3.

Print the first element.

### Q4.

Print the last element.

### Q5.

Find the length of the array.

### Q6.

Update the element at index `2`.

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

Find the index of a given element.

### Q14.

Count the frequency of a given element.

### Q15.

Print the array in reverse order.

---

## DSA Practice

### Q16. Reverse the Array

Input:

```text
[10, 20, 30, 40, 50]
```

Output:

```text
[50, 40, 30, 20, 10]
```

---

### Q17. Check Palindrome Array

Input:

```text
[1, 2, 3, 2, 1]
```

Output:

```text
true
```

---

### Q18. Remove Duplicates

Input:

```text
[10, 20, 10, 30, 20]
```

Output:

```text
[10, 20, 30]
```

---

### Q19. Find Second Largest

Input:

```text
[10, 50, 20, 40, 30]
```

Output:

```text
40
```

---

### Q20. Move All Zeroes to the End

Input:

```text
[0, 1, 0, 3, 12]
```

Output:

```text
[1, 3, 12, 0, 0]
```

---

### Q21. Rotate Array

Input:

```text
[1, 2, 3, 4, 5]
```

Rotate right by `2`.

Output:

```text
[4, 5, 1, 2, 3]
```

---

### Q22. Find Missing Number

Given:

```text
[0, 1, 3]
```

Output:

```text
2
```

---

### Q23. Find Duplicate Number

Given:

```text
[1, 3, 4, 2, 2]
```

Output:

```text
2
```

---

# 49. Quick Revision

### Create Array

```java
int[] arr = new int[5];
```

### Initialize Array

```java
int[] arr = {10, 20, 30};
```

### Access

```java
arr[0];
```

### Update

```java
arr[0] = 100;
```

### Length

```java
arr.length;
```

### Traverse

```java
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Enhanced For Loop

```java
for(int value : arr) {
    System.out.println(value);
}
```

### Print Array

```java
Arrays.toString(arr);
```

### Sort

```java
Arrays.sort(arr);
```

### Compare

```java
Arrays.equals(arr1, arr2);
```

### Fill

```java
Arrays.fill(arr, 0);
```

---

# 50. Key Points to Remember

1. An array stores multiple values of the same data type.
2. Array indexing starts from `0`.
3. The last index is `length - 1`.
4. Array size is fixed after creation.
5. Use `arr.length` to find the number of elements.
6. `length` is a property, so do not use `()`.
7. Elements are accessed using `arr[index]`.
8. Elements can be updated using `arr[index] = value`.
9. Java automatically assigns default values when an array is created using `new`.
10. Use loops to traverse an array.
11. Use nested loops for 2D arrays.
12. `Arrays.toString()` can be used to print a 1D array.
13. `Arrays.sort()` can be used to sort an array.
14. `Arrays.equals()` can be used to compare array contents.
15. If dynamic size is required, use `ArrayList`.
16. Arrays are an important foundation for DSA and are used in searching, sorting, two-pointer, sliding-window, and many other algorithms.
