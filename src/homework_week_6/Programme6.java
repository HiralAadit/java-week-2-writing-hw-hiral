package homework_week_6;
/*
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */


import java.util.Date;
import java.util.Scanner;

public class Programme6 {


    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        scanner.close();

    }
    //calculating the area of circle
    public  static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius);
        System.out.println("The Area of Circle is :"  + area);
    }
}



