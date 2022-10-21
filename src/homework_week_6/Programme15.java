package homework_week_6;
/*
 * Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first variable value");
        int first = scanner.nextInt();
        System.out.println("Enter  variable value");
        int second = scanner.nextInt();
        Programme15 t = new Programme15();
        t.swapTheValue(first, second);
        scanner.close();
    }
public void swapTheValue(int a, int b){
        int c;
    System.out.println("Before the swapping, The value of first variable is : " + a + "and second variable is :" + b);
    c = a;
    a = b;
    b = c;
   System.out.println("After the swapping, he value of first variable is : " + a + "and second variable is : " + b);
}
}

