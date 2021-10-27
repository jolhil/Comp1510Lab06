/**
 * 
 */
package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * 
 * Computes the factorial of the integer
 * @author Junsang(Jason)Yoo
 * @version 2021
 *
 */
public class Factorial {

    
    public int readInt(Scanner s) {
        int x = s.nextInt();
        
        return x;
    }
    /**
     * Drives the program
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a non-negative integer:");
        int x = scan.nextInt();
        
        while (x < 0) {
            System.out.println("Please enter a non-negativce integer:");
            x = scan.nextInt();
        }
        
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a number:");
            x = scan.nextInt();
        }
        
        scan.close();
    }

}
