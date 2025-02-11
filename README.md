# Java Assignments

This repository contains my Java programming assignments. Each folder or file represents a different assignment or project.

## Table of Contents

1. [Question 1](#question-1)
2. [Question 2](#question-2)
3. [Question 3](#question-3)
4. [Question 4](#question-4)
5. [Question 5](#question-5)

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
