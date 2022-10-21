package homework_week_6;
/*
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
        // Object creation
        Programme7 t = new Programme7();
        t.converttempToDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();
        // closing the scanner object
        scanner.close();
    }
        //Temperature conversion method
        public void  converttempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");
    }




}
