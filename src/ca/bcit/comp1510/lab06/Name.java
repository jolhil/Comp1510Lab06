/**
 * 
 */

package ca.bcit.comp1510.lab06;

/**
 * Represent a Name concept.
 * 
 * @author Junsang(Jason)Yoo
 * @version 2021
 *
 */
public class Name {
    
    /** First name. */
    private String firstName;
    
    /** Middle name.*/
    private String middleName;
    
    /** Last name.*/
    private String lastName;
    
    /** 
     * Constructor sets three components of name.
     * @param first as a string
     * @param middle as a string
     * @param last as a string.
     */
    public Name(String first, String middle, String last) {
        if (first.trim().length() == 0) {
            firstName = "Jane";
        } else {
            firstName = first.substring(0, 1).toUpperCase() 
                    + first.substring(1).toLowerCase();
        }
        if (middle.trim().length() == 0) {
            middleName = "Unknown";
        } else {
            middleName = middle.substring(0, 1).toUpperCase()
                    + middle.substring(1).toLowerCase();
        }
        if (last.trim().length() == 0) {
            lastName = "Doe";
        } else {
            lastName = last.substring(0, 1).toUpperCase()
                    + last.substring(1).toLowerCase();
        }
    }
    
    /** 
     * Return the first name as a String.
     * @return firstName as a String. 
     */
    public String getFirst() {
        return firstName;
    }
    
    /**
     * Return the middle name as a string.
     * @return middleName as a string.
     */
    public String getMiddle() {
        return middleName;
    }
    
    /**
     * Return the last name as a string.
     * @return lastName as a string.
     */
    public String getLast() {
        return lastName;
    }

    /**
     * Sets the value of first name to new name.
     * @param newFirst as a string.
     * */
    public void setFirstName(String newFirst) {
        if (newFirst.trim().length() != 0) {
            newFirst = firstName.substring(0, 1).toUpperCase() 
                    + firstName.substring(1, firstName.length()).toLowerCase();
            this.firstName = newFirst;
        }
    }
    
    /**
     * Sets the value of middle name to new name.
     * @param newMiddle as a string.
     */
    public void setMiddleName(String newMiddle) {
        if (newMiddle.trim().length() != 0) {
            newMiddle = middleName.substring(0, 1).toUpperCase() 
                    + middleName.substring(1, 
                            middleName.length()).toLowerCase();
            this.middleName = newMiddle;
        }
    }
    
    /**
     * Sets the value of last name to new last.
     * @param newLast as a string
     */
    public void setLastName(String newLast) {
        if (newLast.trim().length() != 0) {
            newLast = lastName.substring(0, 1).toUpperCase() 
                    + lastName.substring(1, lastName.length()).toLowerCase();
            this.lastName = newLast;
        }
    }
    
    /** Returns the sum of the lengths of the three parts of the name.
     * @return length as an integer.*/
    public int length() {
        int length = firstName.length() 
                + middleName.length() + lastName.length();
        
        return length;
    }
    
    /** Returns a string consisting of the three initials in upper-case.
     * @return initial as a string.*/
    public String initial() {
        String initial = firstName.substring(0, 1).toUpperCase()
                + middleName.substring(0, 1).toUpperCase()
                + lastName.substring(0, 1).toUpperCase();
        
        return initial;
    }
    
    /** Returns the nth character in the full three part name.
     * @param n as an integer.
     * @return nthChar as a string.*/
    public String nthChar(int n) {
        String fullName = firstName + middleName + lastName;
        String nthChar = fullName.substring(n - 1, n);
        if (n > fullName.length()) {
            return "@";
        }
        return nthChar;
    }
    
    /** Returns a string consisting of the last name followed by a comma
     * followed by the first name followed by the middle name.
     * @return lastFirst as a string.*/
    public String lastFirst() {
        String lastFirst = lastName + ", " + firstName + " " + middleName;
        
        return lastFirst;
    }
    
    /** Tests if the string is equal to the first name.
     * @param x as a string
     * @return true if the string x equals to the first name and 
     *     false otherwise. */
    public boolean equal(String x) {
        x = x.toLowerCase();
        firstName = firstName.toLowerCase();
        if (x.equals(firstName)) {
            return true;
        }
        
        return false;
    }
    
    /** Tests if the three parts of the name object are the same
     * as the three parts of this name object.
     * @param name as a Name 
     * @return true if the name is equal to this name and false otherwise.*/
    public boolean compare(Name name) {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
        name.setFirstName(name.firstName);
        name.setMiddleName(name.middleName);
        name.setLastName(name.lastName);
        if (this.firstName.equals(name.firstName) 
                && this.middleName.equals(name.middleName) 
                && this.lastName.equals(name.lastName)) {
            return true;
        } 
        return false;
        
    }
    
    /**
     * Returns a String composed of the concatenation 
     * of the first, middle, and last name.
     * @return toString description.
     * */
    public String toString() {
        String name = firstName + " " + middleName + " " + lastName;
        
        return name;
    }
}
