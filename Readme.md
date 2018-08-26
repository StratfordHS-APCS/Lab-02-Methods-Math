[![Build Status](https://travis-ci.com/StratfordHS-APCS/lab-02-methods-math-username.svg?token=L8ZuTUsXtxKqevAPVWLC&branch=master)](https://travis-ci.com/StratfordHS-APCS/lab-02-methods-math-username)

# Lab 02 - Methods and Math Review

## Lab Goal
This lab was designed to give you a chance to review creating and using methods. As part of your review and practice you will be using various math methods.  The end result will be a small library of math functions.

## Instructions
In your **MyMathLib** class you will be adding the following methods.  The structure of the first method has been provided for you, but you'll have to fill in the details.  The rest of the methods listed need to be created by you.  Make sure the method names, parameter types, and return type are exactly as listed.  The scope of each method should be *public* so they can be called from another class.  If you add any helper methods they should be *private*.  Write tests of your methods in the **MathRunner** class.  You may either ask the user for input or use hardcoded values.  You should test a variety of values both positive and negative to make sure your program is working.

Note: The tests will not compile, and therefore will not run, until all of the methods are defined.  They don't have to work, but they need to exist and have a dummy return value at the least (see the initial ```doSqrt()``` function for an example of this).

**Required Methods:**

```public static double doSqrt(double num)``` - Returns the square root of a number.  If the number is negative then return -1.

```public static double roundUp(double num)``` - Rounds a double up to the next whole number. Examples 2.7 rounds up to 3.0, -2.7 rounds up to -3.0.

```public static double roundDown(double num)``` - Rounds a double down to the next whole number. Examples 2.7 rounds down to 2.0, -2.7 rounds down to -2.0.

```public static double square(double num)``` - Squares the given number.

```public static double root(double num, double root)``` - Finds the nth root of the number. Example: if num = 8 and root = 3, then the cube root of 8 is 2.

```public static boolean isBigger(double num)``` - Returns true if the absolute value of the number is bigger than 100, false if it is less or equal to 100.

```public static String isEvenOdd(int num)``` - Returns "Even" if the number is even, "Odd" if the number is odd.

After committing and pushing to GitHub, edit the first line of **Readme.md** and replace the two instances of "username" with your GitHub username.

## Helpful Information
* A list of all Java Math functions can be found at https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
* Don't forget about using "%" to find the modulus. (see The Modulus Operator below)
* Recall the difference between integer division (1/2 = 0) and real division (1/2.0 = 0.5). (see Floating Point Numbers below)

## Relevant ThinkJava Sections
* [The Modulus Operator](http://greenteapress.com/thinkjava6/html/thinkjava6004.html#sec39)
* [Reading Documentation](http://greenteapress.com/thinkjava6/html/thinkjava6005.html#sec52)
* [Writing Documentation](http://greenteapress.com/thinkjava6/html/thinkjava6005.html#sec53)
* [JavaDoc Tags](http://greenteapress.com/thinkjava6/html/thinkjava6007.html#sec75)
* [Return Values](http://greenteapress.com/thinkjava6/html/thinkjava6007.html#sec70)
* [Writing Methods](http://greenteapress.com/thinkjava6/html/thinkjava6007.html#sec71)
* [Boolean Methods](http://greenteapress.com/thinkjava6/html/thinkjava6007.html#sec74)
* [Conditional Statements](http://greenteapress.com/thinkjava6/html/thinkjava6006.html#sec59)
* [Floating Point Numbers](http://greenteapress.com/thinkjava6/html/thinkjava6003.html#sec24)

## Notes
* Checkstyle config link is http://www.daveavis.com/cs/checkstyle_SHS.xml
* After cloning your repo from GitHub you can open your code in BlueJ by double clicking on the **package** file.

## Grading
* 10 - ```doSqrt()```
* 10 - ```roundUp()```
* 10 - ```roundDown()```
* 10 - ```square()```
* 10 - ```root()```
* 10 - ```isBigger()```
* 10 - ```isEvenOdd()```
* 20 - MathRunner
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
