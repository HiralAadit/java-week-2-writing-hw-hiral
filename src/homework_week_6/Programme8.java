package homework_week_6;
/*
 * Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
       //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the triangle : ");
        int length = scanner.nextInt();
        System.out.println("Enter the height of the triangle : ");
        int height = scanner.nextInt();
        areaOfTringle(height, length);
        scanner.close();




    }
    //Cal. the area of triangle with no return type with parameter method
    public static void areaOfTringle(int length, int height) {
        int area = (length * height)/2;
        System.out.println("The are of a triangle is : " + area);
    }
}



