package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * @author Jason Yoo
 * @version 2021
 *
 */

public class BaseballStats {
    /**
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        
        Scanner scan = new Scanner(System.in);
        //TODO Read and process each line of the file
        
        System.out.print("Enter the name of the input file: ");
        fileName = "src/" + scan.nextLine();
        
        fileScan = new Scanner(new File(fileName));
        
        while (fileScan.hasNext()) {
            fileName = fileScan.nextLine();
            System.out.println(fileName);
            
            lineScan = new Scanner(fileName);
            lineScan.useDelimiter(",");
            
            while (lineScan.hasNext()) {
                System.out.print(" " + lineScan.next());
            }
            System.out.println();
        }
            
        
        scan.close();
    }
        
}
