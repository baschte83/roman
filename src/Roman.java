/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 10. November 2016
 * Purpose: solution to lab Roman
 */
public class Roman {

    /**
     * Variable to store a list of all roman numerals.
     */
    private final String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    /**
     * Variable to store the arabic correspondants to the roman numerals above.
     */
    private final int[] arabic = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    /**
     * Method to translate the roman correspondant to an arabic number.
     * @param value - an arabic number.
     * @return - returns the roman representation of an arabic number as a string.
     */
    public String getRoman(final int value) {

        // Variable to store the roman representation.
        String result = "";

        int newValue = value;

        /*
         * This loop iterates through the 'arabic' array. Everytime a value from the 'arabic' array is contained
         * in the arabic number, than a counter 'counter' is incremeneted. In the second loop the corresponding
         * string representation of the 'roman' array is added 'counter' times to the string 'result'. If the whole
         * 'arabic' array processed, than the 'result' string is returned.
         */
        for (int i = roman.length - 1; i >= 0; i--) {

            int counter = newValue / arabic[i];
            newValue = newValue % arabic[i];

            for (int j = 0; j < counter; j++) {

                result += roman[i];

            }
        }

        return result;

    }

    /**
     * Main method of the program roman.
     * @param args - variable number of values from the terminal.
     */
    public static void main(String[] args) {

        // This imports the arabic number from the terminal.
        int value = Integer.parseInt(args[0]);

        /*
         * Check, if the arabic number from the console is 0. If so, than an error message
         * is printed to the screen.
         */
        if (value <= 0) {

            System.out.println("Invalid Input");

        }
        else {

            String result = new Roman().getRoman(value);
            System.out.println(result);

        }

    }

}
