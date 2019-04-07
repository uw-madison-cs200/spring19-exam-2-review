/**
 * Arrays
 *
 * @author T.J.
 *
 */
import java.util.Scanner;
import java.util.Arrays;

public class ArrayExamples {
	public static void main(String[] args) {
		// How can we create an array?
		int[] arr1 = new int[999];
		String[] arr2 = { "I", "like pie and maybe", "   computer", "science" };
		char[][][] arr3 = new char[5][2][2];

		// What is the capacity of each of these arrays?


		// Why doesn't this work? How would we fix it?
		// arr2 = { "Hello there" };


		// Let's get the first word from each String in arr2
		// Scanner[] arr4 = scannersFor(arr2);
		// String[] arr5 = arr2; // Same reference!

		// // Print arr2 before and after
		// System.out.println(Arrays.toString(arr2));

		// for (int i = 0; i < arr4.length; i++) {
		// 	arr5[i] = arr4[i].next();
		// }

		// System.out.println(Arrays.toString(arr2));
		// System.out.println();

		// // Now let's talk equality

		// System.out.println("arr5 = arr2:");
		// printCompare(arr2, arr5);

		// arr2 = new String[]{ new String("One more String") };
		// arr5 = new String[]{ new String("One more String") };
		// System.out.println("Two new String arrays with new String contents:");
		// printCompare(arr2, arr5);

		// String same = "My one true String";
		// arr2 = new String[]{ same };
		// arr5 = new String[]{ same };
		// System.out.println("Two new String arrays with the same String contents:");
		// printCompare(arr2, arr5);
	}

	/**
	 * Create a separate Scanner for each element off array
	 **/
	public static Scanner[] scannersFor(String[] array) {
		Scanner[] scanners = new Scanner[array.length];

		for (int i = 0; i < array.length; i++) {
			scanners[i] = new Scanner(array[i]);
		}

		return scanners;
	}

	public static void printCompare(String[] arr1, String[] arr2) {
		System.out.println("==? \t\t" + (arr1 == arr2));
		System.out.println(".equals? \t" + (arr1.equals(arr2)));
		System.out.println("Arrays.equals? \t" + Arrays.equals(arr1, arr2));
		System.out.println();
	}
}
