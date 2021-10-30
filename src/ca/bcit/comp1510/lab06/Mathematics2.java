package ca.bcit.comp1510.lab06;

/**
 * Represent a concept of mathematics.
 * @author Jason Yoo
 * @version 2021
 *
 */
public class Mathematics2 {

    /** Ratio of foot to kilometer.*/
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;

    /**
     * Returns the area of the square with the specified edge length.
     *
     * @param edgeLength of the square.
     * @return area as a double
     */
    public double getSquareArea(double edgeLength) {
        double area = Math.pow(edgeLength, 2);
        return area;
    }

    /**
     * Returns the sum of the specified values.
     * 
     * @param first 
     *            operand
     * 
     * @param second 
     *            operand
     * 
     * @return sum of the operands
     */
    public double add(double first, double second) {
        double sum = first + second;
        return sum;
    }

    /**
     * Returns the product of the specified values.
     * 
     * @param first
     *            operand
     * 
     * @param second
     *            operand
     * 
     * @return product of the operands
     */
    public double multiply(double first, double second) {
        double product = first * second;
        return product;
    }

    /**
     * Returns the difference of the specified values.
     * 
     * @param first
     *            operand
     * 
     * @param second
     *            operand
     * 
     * @return difference of the operands
     */
    public double subtract(double first, double second) {
        double difference = first - second;
        return difference;
    }

    /**
     * Returns the quotient of the specified values. If the divisor is zero,
     * returns zero instead of NaN or infinity.
     * 
     * @param first
     *            operand
     * 
     * @param second
     * 
     * @return quotient of the operands
     */
    public double divide(int first, int second) {
        double quotient;
        if (second == 0) {
            quotient = 0;
        } else {
            quotient = first / second;
        }
        return quotient;
    }

    /**
     * Returns the absolute value of the specified integer.
     * 
     * @param number
     *            to test
     * 
     * @return absolute value of number
     */
    public int absoluteValue(int number) {
        int abs = Math.abs(number);
        return abs;
    }

    /**
     * Returns a random number between 10 and 20 inclusive,
     * but NOT 15.
     * @return random number in rage [10, 20] excluding 15.
     * */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        final int ten = 10;
        final int fifteen = 15;
        int range = ten + 1;
        int random = (int) (Math.random() * range + ten);
        while (random == fifteen) {
            random = (int) (Math.random() * range + ten);
        }
        return random;
    }

    /**
     * Converts the specified number of feet to kilometers.
     * @param feet to convert
     * @return kilometers in the specified number of feet
     * */
    public double convertFeetToKilometres(double feet) {
        double kilometer = feet * FOOT_TO_KILOMETRE_RATIO;
        return kilometer;
    }

    /**
     * Returns the sum of the numbers between zero and the
     * first parameter that are divisible by the second
     * number. For example, sumOfProducts(10, 3) will return
     * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
     * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
     * return -2 + -4 + -6 + -8 + -10 = -30.
     * @param bound the upper bound
     * @param divisor the divisor
     * @return sum
     * */
    public int sumOfProducts(int bound, int divisor) {
        int sum = 0;
        int i = 0;
        if (bound > 0) {
            while (i <= bound) {
                sum = sum + i;
                i += divisor;
            }
        } else if (bound < 0) {
            while (i >= bound) {
                sum = sum + i;
                i -= divisor;
            }
        } else {
            sum = 0;
        }
        return sum;
    }

}
