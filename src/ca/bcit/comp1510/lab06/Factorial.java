package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * 
 * Computes the factorial of the integer.
 * @author Junsang(Jason)Yoo
 * @version 2021
 *
 */
public class Factorial {
    
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a non-negative integer:");
        int input = readInt(scan);
        
        if (input == 0) {
            System.out.println("The factorial value is " + 1);
        }
        
        if (input > 0) {
            int i = 1;
            int fact = 1;
            while (i <= input) {
                fact = fact * i;
                i++;
            } System.out.println("The factorial value is " + fact);
        }
        
        scan.close();
    }

    /**
     * Read lines from the input until a non-negative integer entered.
     * 
     * @param scan as Scanner
     * @return input as an integer.
     * */
    public static int readInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a number:");
            scan.next();
        }
        
        while (scan.nextInt() < 0) {
            System.out.println("Please enter a non-negativce integer:");
            
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a number:");
                scan.next();
            }
        }
        int result = scan.nextInt();
        
        return result;
    }
    
}
