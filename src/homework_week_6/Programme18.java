package homework_week_6;
/* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

import java.util.Scanner;

public class Programme18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Please enter second number");
            int secondNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        Programme18 printOperation = new Programme18();
        printOperation.printTheOperation(firstNumber, secondNumber);
        //Closing the scanner object
        scanner.close();
    }

    //Printing the all operations
    public void printTheOperation(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
        System.out.println("The division of " + a + " and " + b + " is " + (a / b));
        System.out.println("The remainder of " + a + " and " + b + " is " + (a % b));
    }
}


