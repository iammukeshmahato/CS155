# Java Assignments

This repository contains my Java programming assignments. Each folder or file represents a different assignment or project.

## Table of Contents

1. [Question 1](#question-1)
2. [Question 2](#question-2)
3. [Question 3](#question-3)
4. [Question 4](#question-4)
5. [Question 5](#question-5)
6. [Question 6](#question-6)
7. [Question 7](#question-7)
8. [Question 9](#question-9)
9. [Question 9.7](#question-97)
10.   [Assignment 10](#assignment-10)
11.   [Assignment 11](#assignment-11)
12.   [Assignment 12](#assignment-12)

## Question 1

## 1.1 Display three messages

Write a program that displays:

```java
"Welcome to Java"
"Learning Java Now"
"Programming is Fun"
```

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program1.java) to view the code.

## 1.5 Compute expressions

Write a program that displays the result of the following expressions:

```java
(9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)
```

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program1.java) to view the code.

## Question 2

## 2.15 Geometry: Area of a Triangle

Write a program that prompts the user to enter three points (x1,
y1), (x2, y2), (x3, y3) of a triangle and displays its area. The formula for computing the area of a triangle
is Here is a sample run:

```java
area = 2s(s - side1)(s - side2)(s - side3)

s = (side1 + side2 + side3)/2;
```

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program2.java) to view the code.

## 2.17 Science: Wind-Chill Temperature

How cold is it outside? The temperature alone is not enough to provide the answer. Other factors, including wind speed, play important roles in determining how cold it feels outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure the coldness using temperature and wind speed. The formula is:

Click [here](https://github.com/iammukeshmahato/CS155/blob/08e730c4b4dc2757f48f0090d489c6bb22cf2d4a/Program2.java#L36) to view the code.

## Question 3

## 3.19 Compute the perimeter of a triangle

Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid.

**Note:** The input is valid if the sum of every pair of two edges is greater than the remaining edge.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program3_19.java) to view the code.

## 3.31 (Financials: currency exchange)

Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program3_31.java) to view the code.

## 3.33 Financials: compare costs

Suppose you shop for rice in two different packages.
You should write a program to compare the cost. The program prompts the user to enter the weight and price of the each package and displays the one with the better price.

Here is a sample run:

```
Enter weight and price for package 1: 40 25

Enter weight and price for package 2: 45 30

Package 2 has a better price.
```

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program3_33.java) to view the code.

## Question 4

## 4.21 Check SSN

Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program4_21.java) to view the code.

## 4.23 Financial application: payroll

Write a program that reads the following information and prints a payroll statement:

-  Employee’s name (e.g., Smith)
-  Number of hours worked in a week (e.g., 10)
-  Hourly pay rate (e.g., 9.75)
-  Federal tax withholding rate (e.g., 20%)
-  State tax withholding rate (e.g., 9%)

A sample run is shown below:

```
Enter employee's name: Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: 0.20
Enter state tax withholding rate: 0.09
```

```java
Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: $97.5
Deductions:
Federal Withholding (20.0%): $19.5
State Withholding (9.0%): $8.77
Total Deduction: $28.27
Net Pay: $69.22
```

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program4_23.java) to view the code.

## Question 5

## 5.13 Find the largest

Write a program to find the largest n such that n^3 < 12,000.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program5_13.java) to view the code.

## 5.15 Display the ASCII character table

Write a program that prints the characters in the ASCII character table from ! to ~. Display ten characters per line. Characters are separated by exactly one space.

```java
The ASCII codes for ! to ~ are:

! = 33
~ = 126
```

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program5_15.java) to view the code.

## 5.21 Financial application: compare loans with various interest rates

Write a program that lets the user enter the loan amount and loan period in number of years and displays the monthly and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8. Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program5_21.java) to view the code.

To calculate the monthly payment on a loan, we use the amortization formula, which is:

```Math
𝑀 = {{𝑃×𝑟×(1+𝑟)^𝑛} \over (1+𝑟)^𝑛−1}​
```

Here is a sample run:

```java
Loan Amount: 10000
Number of Years: 5

Interest Rate   Monthly Payment     Total Payment
5.000%          188.71              11322.74
5.125%          189.29              11357.13
5.250%          189.86              11391.59

...

7.875%          202.17              12129.97
8.000%          202.76              12165.84
```

## 5.27 Display leap years

Write a program that displays all the leap years, ten per line, from **_101 to 2100_**, separated by exactly one space. Also display the number of leap years in this period.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program5_27.java) to view the code.

## Question 6

## 6.1 Math: pentagonal numbers

A pentagonal number is defined as _n(3n–1)/2_ for n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . . Write a method with the following header that returns a pentagonal number:

```java
 public static int getPentagonalNumber(int n){
    // code here
 }
```

Write a test program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program6_1.java) to view the code.

## 6.5 Sort three numbers

Write a method with the following header to display three numbers in increasing order:

```java
public static void displaySortedNumbers( double num1, double num2, double num3){
    // code here
}
```

Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program6_5.java) to view the code.

## 6.9 Conversions between feet and meters

Write a class that contains the following two methods:

-  Convert from feet to meters

```java
public static double footToMeter(double foot){
    // code here
}
```

The formula for the conversion is: meter = 0.305 \* foot

-  Convert from meters to feet

```java
public static double meterToFoot(double meter){
    // code here
}
```

The formula for the conversion is: foot = 3.279 \* meter

Write a test program that invokes these methods to display the following tables:

```java
Feet Meters | Meters Feet
--------------------------
1.0 0.305   |  20.0 65.574
2.0 0.610   | 25.0 81.967
.
.
.
9.0 2.745   | 60.0 196.721
10.0 3.050  | 65.0 213.11
```

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program6_9.java) to view the code.

## 6.17 Display matrix of 0s and 1s

Write a method that displays an n-by-n matrix using the following header:

```java
public static void printMatrix(int n){
    // code here
}
```

Each element is 0 or 1, which is generated randomly. Write a test program that prompts the user to enter n and displays an n-by-n matrix. Here is a sample run:

```java
Enter n: 3
0 1 0
0 0 0
1 1 1
```

```java
Enter n: 4
1 0 0 1
0 1 1 0
0 1 1 1
1 0 1 0
```

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program6_17.java) to view the code.

## Question 9

## 9.1 The Rectangle class

Design a class named Rectangle to represent a rectangle.The class contains:

-  Two double data fields named width and height
   that specify the width and height of the rectangle. The default values are 1 for both width and height.

-  A no-arg constructor that creates a default rectangle.

-  A constructor that creates a rectangle with the
   specified width and height.
-  A method named getArea() that returns the area of this rectangle.
-  A method named getPerimeter() that returns the perimeter.
-  Draw the UML diagram for the class and then implement the class.

Write a test program that creates two Rectangle objects

-  one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Rectangle.java) to view the code.

## 9.5 The GregorianCalendar class

Java API has the GregorianCalendar class in the java.util package, which you can use to obtain the year, month, and day of a date. The no-arg constructor constructs an instance for the current date, and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.

Write a program to perform two tasks:

-  Display the current year, month, and day.
-  The GregorianCalendar class has the setTimeInMillis(long), which can be used to set a specified elapsed time since January 1, 1970. Set the value to 1234567898765L and display the year, month, and day.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program9_5.java) to view the code.

## Question 9.7

## 9.7 The Account class

Design a class named Account that contains:

-  A private int data field named id
   for the account (default 0).
-  A private double data field named balance for the account (default 0).
-  Aprivate double data field named annualInterestRate that stores the current interest rate (default 0).
   Assume all accounts have the same interest rate.
-  A private Date data field named dateCreated that
   stores the date when the account was created.
-  A no-arg constructor that creates a default account.
-  A constructor that creates an account with the specified id and initial balance.
-  The accessor and
   mutator methods for id, balance, and annualInterestRate.
-  The accessor method for dateCreated.
-  A method named getMonthlyInterestRate() that returns the monthly interest rate.
-  A method named getMonthlyInterest() that returns the monthly interest.
-  A method named withdraw that withdraws a specified amount from the account.
-  A method named deposit that deposits a specified amount to the
   account.

   Draw the UML diagram for the class and then implement the class. (Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate. Monthly interest is balance \*
   monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)

   Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance,

## Assignment 10

## 9.8 The Fan class

Design a class named Fan to represent a fan. The class contains:

-  Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.

-  A private int data field named speed that specifies the speed of the fan (the default is SLOW).

-  A private boolean data field named on that specifies whether the fan is on (the default is false).

-  A private double data field named radius that specifies the radius of the fan (the default is 5).

-  A string data field named color that specifies the color of the fan (the default is blue).

-  The accessor and mutator methods for all four data fields.

-  A no-arg constructor that creates a default fan.

-  A method named toString() that returns a string description for the fan.

   -  If the fan is on, the method returns the fan speed, color, and radius in one combined string.
   -  If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.

Draw the UML diagram for the class and then implement the class.

Write a test program that creates two Fan objects. Assign maximum speed, radius 10, color yellow, and turn it on to the first object. Assign medium speed, radius 5, color blue, and turn it off to the second object. Display the objects by invoking their toString method.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2010/Fan.java) to view the code.

## 11.1 The Triangle class

Design a class named Triangle that extends GeometricObject. The class contains:

-  Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
-  A no-arg constructor that creates a default triangle.
-  A constructor that creates a triangle with the specified side1, side2, and side3.
-  The accessor methods for all three data fields.
-  A method named getArea() that returns the area of this triangle.
-  A method named getPerimeter() that returns the perimeter of this triangle.
-  A method named toString() that returns a string description for the triangle.

   For the formula to compute the area of a triangle, see Programming Exercise 2.19.

   The toString() method is implemented as follows:

```java
   return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
```

Draw the UML diagrams for the classes Triangle and GeometricObject and implement the classes.

Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. The program should create a Triangle object with these sides and set the color and filled properties using the input. The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2010/Triangle.java) to view the code.

## 11.2 The Person, Student, Employee, Faculty, and Staff classes

Design a class named Person and its two subclasses named Student and Employee.

-  Make Faculty and Staff subclasses of Employee.
-  A person has a name, address, phone number, and email address.
-  A student has a class status (freshman, sophomore, junior, or senior).
-  Define the status as a constant. An employee has an office, salary, and date hired.

-  Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired.

-  A faculty member has office hours and a rank.

-  A staff member has a title. Override the toString method in each class to display the class name and the person’s name.

Draw the UML diagram for the classes and implement them.

Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2010/TestPersonHierarchy.java) to view the code.

## Assignment 11

## 11.4 Maximum element in ArrayList

Write the following method that returns the maximum value in an
ArrayList of integers. The method returns null if the list is null or the list size is 0.

```java
public static Integer max(ArrayList list)
```

Write a test program that prompts the user to enter a sequence of numbers ending with 0, and invokes this method to return the largest number in the input.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2011/MaxArrayList.java) to view the code.

## 11.6 Use ArrayList

Write a program that creates an ArrayList and adds a Loan object, a Date object, a string, and a Circle object to the list, and use a loop to display all the elements in the list by invoking the
object’s toString() method.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2011/UsingArrayList.java) to view the code.

## 11.10 (Implement MyStack using inheritance)

In Listing 11.10, MyStack is implemented using composition. Define a new stack class that extends ArrayList. Draw the UML diagram for the classes and then implement MyStack.
Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2011/MyStack.java) to view the code.

Write a test program that prompts the user to enter five strings and displays them in reverse order.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2011/TestStack.java) to view the code.

## Assignment 12

## 12.1 (NumberFormatException) Listing 7.9

Calculator.java, is a simple commandline calculator. Note
that the program terminates if any operand is nonnumeric.

Write a program with an exception handler that deals with nonnumeric operands; then write another program without using an exception handler to achieve the same objective. Your program should display a message that informs the user of the wrong operand type before exiting (see Figure 12.12). FIGURE 12.12 The program performs arithmetic operations and detects input errors.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2012/CalculatorWithException.java) to view the code.

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2012/CalculatorWithoutException.java) to view the code.

## 12.2 (InputMismatchException)

Write a program that prompts the user to read two integers and
displays their sum. Your program should prompt the user to read the number again if the input is
incorrect

Click [here](https://github.com/iammukeshmahato/CS155/blob/main/Program%2012/SumWithRetry.java) to view the code.