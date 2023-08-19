// Operators
/* Arithmetic Operators
 * Addition: +
 * Subtraction: -
 * Multiplication: *
 * Division: / Quotient value
 * Modulus: % Remainder value
*/

/* Relational Operators
 * Equal to: ==
 * Not equal to: !=
 * Greater than: >
 * Less than: <
 * Greater than or equal to: >=
 * Less than or equal to: <=
*/

/* Logical Operators
    * AND: &&
    * OR: ||
    * NOT: !
*/

/* Bitwise Operators
    * AND: &
    * OR: |
    * XOR: ^
    * NOT: ~
    * Left Shift: <<
    * Right Shift: >>
    * Zero fill right shift: >>>
*/

/* Assignment Operators
    * =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
*/

/* Misc Operators
    * Conditional Operator: ? :
    * instanceof Operator
    * Comma Operator
*/

// Write a program to calculate the sum of two numbers.
// 24, 56

class calc {
    public static void main(String[] args) {
        int a = 24;
        int b = 56;

        int sum = a+b;

        System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
        System.out.print("The sum of " + a + " and " + b + " is " + (a+b) + "."); // Method 1
    }
}