package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
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
        double hits = 0;
        double walks = 0;
        double sacs = 0;
        double outs = 0;
        
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        
        DecimalFormat decimal = new DecimalFormat("0.000");
        
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
                char code = lineScan.next().charAt(0);
                if (code == 'o') {
                    outs++;
                } else if (code == 'h') {
                    hits++;
                } else if (code == 'w') {
                    walks++;
                } else if (code == 's') {
                    sacs++;
                } else if (Character.isUpperCase(code)) {
                    outs = 0;
                    hits = 0;
                    walks = 0;
                    sacs = 0;
                }
            }
            System.out.println("hits: " + (int) hits + "\nouts: " + (int) outs
                    + "\nwalks: " + (int) walks + "\nsacrifies: " + (int) sacs);
            System.out.println("Batting average is " 
                    + decimal.format((hits / (hits + outs))));
        }
        scan.close();
    }
}

