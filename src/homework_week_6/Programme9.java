package homework_week_6;
/*
 * Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter uppercase string  : ");
        String uppercase = scanner.nextLine();
        Programme9 t = new Programme9();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }

    //conversion of Uppercase tp Lower case method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());

    }
}
