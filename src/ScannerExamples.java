import java.util.Scanner;

/**
 * Scanner
 * - using a method with if statements to scan a string with whitespace
 * - using nextLine() and next() together
 *
 * @author T.J.
 */
public class ScannerExamples {
	
	public static void main(String[] args) {
    String baseString = "Hello,   there     everyone  ";
    Scanner scnr  = new Scanner(baseString);
    Scanner scnr2 = new Scanner(baseString);
    Scanner scnr3 = new Scanner(baseString);

    // nextLine() vs next()
    System.out.println("nextLine(): *" + scnr.nextLine() + "*");
    System.out.println();

    // How many times will this run?
    // while (scnr2.hasNext()) {
    //   System.out.println("next(): *" + scnr2.next() + "*");
    // }
    // System.out.println();


    // What if we read too much?
    // scnr2.next();

    // Let's mix nextLine() and next()
    // System.out.println("next(): *" + scnr3.next() + "*");
    // System.out.println("nextLine(): *" + scnr3.nextLine() + "*");
    // System.out.println();

    // // Now we're gonna try to read a double from "input"
    // // We want the first double on a line and to print an error
    // // if there is not a double
    // // This String should return 14.0 then 5.0
    // String multiline = "xx no number 9 18.0\n 14 9.0 \n 5.0 here";
    // Scanner scnr4 = new Scanner(multiline);
    // // We'll start at promptDouble1 and work through promptDouble5
    // System.out.println(promptDouble5(scnr4, "My value: "));
    // System.out.println(promptDouble5(scnr4, "My value: "));
    // System.out.println();

    // Scanner scnr5 = new Scanner("slowmo\n5 10 \n 15");
    // System.out.println(promptIntRange1(scnr5, "My int: ", 5, 10));
    // System.out.println(promptIntRange1(scnr5, "My int: ", 15, 20));
    // System.out.println();

    // Scanner scnr6 = new Scanner("slowmo\n 5 10 \n 15");
    // System.out.println(promptIntRange1(scnr6, "My int: ", Integer.MIN_VALUE, Integer.MAX_VALUE));
    // System.out.println();

    // Scanner scnr7 = new Scanner("slowmo\n 5 10 \n 15");
    // System.out.println(promptIntRange2(scnr7, "My int: ", Integer.MIN_VALUE, Integer.MAX_VALUE));
  }

  // Just read a double!
  public static double promptDouble1(Scanner scnr, String prompt) {
    System.out.print(prompt);
    return scnr.nextDouble();
  }

  // Let's check if it's a double, then read it
  public static double promptDouble2(Scanner scnr, String prompt) {
    System.out.print(prompt);
    if (scnr.hasNextDouble()) {
      return scnr.nextDouble();
    }

    System.out.println("Invalid input!");
    return scnr.nextDouble();
  }

  // Ok, clearly we need a loop
  public static double promptDouble3(Scanner scnr, String prompt) {
    do {
      System.out.print(prompt);

      if (scnr.hasNextDouble()) {
        return scnr.nextDouble();
      }
      else {
        System.out.println("Invalid input!");
      }
    } while(true);
  }

  // But not an infinite loop...
  public static double promptDouble4(Scanner scnr, String prompt) {
    do {
      System.out.print(prompt);

      if (scnr.hasNextDouble()) {
        return scnr.nextDouble();
      }
      else {
        System.out.println("Invalid input!");
        // Get rid of the bad output!
        scnr.nextLine(); // we don't need to store it, just throw it out
      }
    } while(true);
  }

  // Let's fix the line ending
  public static double promptDouble5(Scanner scnr, String prompt) {
    do {
      System.out.print(prompt);

      if (scnr.hasNextDouble()) {
        double ret = scnr.nextDouble();
        scnr.nextLine(); // Make sure we read to the end of the line of input
        return ret;
      }
      else {
        System.out.println("Invalid input!");
        // Get rid of the bad output!
        scnr.nextLine(); // we don't need to store it, just throw it out
      }
    } while(true);
  }

  // Now we're mostly copying the double version but using a min and max
  public static int promptIntRange1(Scanner scnr, String prompt, int min, int max) {
    int val = min - 1;

    do {
      System.out.print(prompt);

      if (scnr.hasNextInt()) {
        val = scnr.nextInt();
        // Make sure we read to the end of the line of input
        // But since we aren't reading from stdin, our input
        // may not end with a newline
        if (scnr.hasNextLine()) {
          scnr.nextLine();
        }
      }
      else {
        System.out.println("Invalid input!");
        // Get rid of the bad output!
        scnr.nextLine(); // we don't need to store it, just throw it out
      }
    } while (val < min || val > max);

    return val;
  }

  // Integer.MIN_VALUE - 1 == Integer.MAX_VALUE
  // So make sure we only check the range once we read a value
  public static int promptIntRange2(Scanner scnr, String prompt, int min, int max) {
    do {
      System.out.print(prompt);

      if (scnr.hasNextInt()) {
        int val = scnr.nextInt();
        // Make sure we read to the end of the line of input
        // But since we aren't reading from stdin, our input
        // may not end with a newline
        if (scnr.hasNextLine()) {
          scnr.nextLine();
        }
        if (val >= min && val <= max) {
          return val;
        }
        else {
          System.out.println("Invalid input!");
        }
      }
      else {
        System.out.println("Invalid input!");
        // Get rid of the bad output!
        scnr.nextLine(); // we don't need to store it, just throw it out
      }
    } while (true);
  }
}
