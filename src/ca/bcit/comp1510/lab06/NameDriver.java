/**
 * 
 */

package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Test the name class.
 * @author Junsang(Jason) Yoo
 * @version 2021
 *
 */

public class NameDriver {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n;
        final int exceed = 23;
        
        // Create a name that use white space and empty String for
        // its components.
        Name name = new Name(" ", "MarGaret", "");
        System.out.println(name.toString());
        
        // Create a correct name and test the name format.
        Name name2 = new Name("JASON", "JUNSANG", "yoo");
        System.out.println(name2.toString());
        
        // Test setter with empty String. It will not change anythig.
        name2.setFirstName("");
        System.out.println(name2.toString());
        
        // Test setter format
        name2.setMiddleName("Kwon");
        System.out.println(name2.toString());
        
        // Test getChar method with an integer that exceeds 
        // the length of the name.
        n = exceed;
        System.out.println(name2.getChar(n));
        scan.close();
    }

}
