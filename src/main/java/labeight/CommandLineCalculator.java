package labeight;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 * This class reads in values and then computes summary statistics about the
 * numbers that were input. It leverages methods in the NumericalCalculator.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Gregory M. Kapfhammer
 */

public class CommandLineCalculator {

  /**
   * This is the main method that calls all of the necessary methods.
   *
   * @author Gregory M. Kapfhammer
   */
  public static void main(String[] args) {

    // Step 1: Display the welcome message
    System.out.println("Gregory M. Kapfhammer " + new Date());
    System.out.println("Welcome to the Command Line Calculator!");
    System.out.println();

    // Step 2: Declare the starting file and scanner
    File numericalInputsFile = null;
    Scanner scanner = null;

    // Step 3: Connect the scanner to the input file

    // Step 4: Read in all of the integers from the file
    // store the integers inside of an ArrayList
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    while (scanner.hasNext()) {
      if (scanner.hasNextInt()) {
        numberList.add(scanner.nextInt());
      }
    }

    // Step 5: Display all of the input values that are stored in the list
    // after giving a statement about the number of input values in total

    // Step 6: Find the minimum value in a list of values

    // Step 7: Find the maximum value in a list of values

    // Step 8: Calculate and display the arithmetic mean of the numbers

    // Step 9: Display a closing message

  }
}
