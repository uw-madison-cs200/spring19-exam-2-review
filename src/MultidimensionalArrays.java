/**
 * Multi-dimensional arrays
 * 
 * @author T.J.
 *
 */
import java.util.Arrays;

public class MultidimensionalArrays {
	public static void main(String[] args) {
		// Creating multidimensional arrays
		int[][] arr1 = new int[5][10];
		System.out.println("Printing arr1 in different ways:");
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.deepToString(arr1));
		System.out.println();

		char[][][] arr2 = new char[2][][];
		System.out.println("Original arr2: " + Arrays.toString(arr2));
		// And we can fill in arr2 in a jagged way
		arr2[0] = new char[][] {{'c'}};
		arr2[1] = new char[][] {{'a', 'b'}, {'D'}};
		System.out.println("Jagged arr2: " + Arrays.deepToString(arr2));
		System.out.println();

		// String[][] arr3 = {
		//	 {"(0, 0)", "(0, 1)"},
		//	 {"(1, 0)", "(1, 1)", "(1, 2)"},
		//	 {"(2, 0)"}
		// };
		// String[][] arr4 = {
		//	 {"Frog", "none"},
		//	 {"none", "lily", "none"},
		//	 {"none", "none"}
		// };

		// String[][][] arr5 = { arr3, arr4, arr3 };

		// // Print one out
		// // Note that when we print the references, the first and third are the same
		// System.out.println(Arrays.toString(arr5));
		// // Or write your own...
		// System.out.println(arr3ToString("", arr5));
		// System.out.println();

		// // arr3 was specifically constructed so we can get:
		// System.out.println("arr5[0][0][1] = " + arr5[0][0][1]);
		// System.out.println("arr5[0][1][1] = " + arr5[0][1][1]);
		// // Or
		// System.out.println("arr5[2][0][0] = " + arr5[2][0][0]);
		// System.out.println("arr5[2][2][0] = " + arr5[2][2][0]);
		// System.out.println();

		// // We can also look at one part of arr3
		// System.out.println("arr3[0]		= " + Arrays.toString(arr3[0]));
		// System.out.println("arr5[0][0] = " + Arrays.toString(arr5[0][0]));
		// System.out.println("arr3[1]		= " + Arrays.toString(arr3[1]));
		// System.out.println();

		// // Let's talk about equality
		// String[][][] arr6 = arr5;
		// System.out.println("arr6 = arr5:");
		// printCompare3(arr5, arr6);

		// arr6 = new String[][][] { arr3, arr4, arr3 };
		// System.out.println("New arr6 with same elements:");
		// printCompare3(arr5, arr6);

		// // Create a new arr3 with the same elements
		// arr3 = new String[][] {
		//	 arr3[0],
		//	 arr3[1],
		//	 arr3[2]
		// };
		// arr6[0] = arr3; // Change the first element to point to the new arr3
		// System.out.println("One reference changed:");
		// printCompare3(arr5, arr6);

		// // We can also do:
		// System.out.println("arr3 and arr6[0]:");
		// printCompare2(arr3, arr6[0]);

		// System.out.println("but arr3 and arr5[0]:");
		// printCompare2(arr3, arr5[0]);
	}

	public static void printCompare3(String[][][] arr1, String[][][] arr2) {
		System.out.println("==? \t\t\t" + (arr1 == arr2));
		System.out.println(".equals? \t\t" + (arr1.equals(arr2)));
		System.out.println("Arrays.equals? \t\t" + Arrays.equals(arr1, arr2));
		System.out.println("Arrays.deepEquals? \t" + Arrays.deepEquals(arr1, arr2));
		System.out.println();
	}

	public static void printCompare2(String[][] arr1, String[][] arr2) {
		System.out.println("==? \t\t\t" + (arr1 == arr2));
		System.out.println(".equals? \t\t" + (arr1.equals(arr2)));
		System.out.println("Arrays.equals? \t\t" + Arrays.equals(arr1, arr2));
		System.out.println("Arrays.deepEquals? \t" + Arrays.deepEquals(arr1, arr2));
		System.out.println();
	}

	public static String arrToString(String base, String[] array) {
		return base + Arrays.toString(array);
	}

	public static String arr2ToString(String base, String[][] array) {
		String output = base + "[\n";
		for (int i = 0; i < array.length; i++) {
			output += arrToString(base + "\t", array[i]) + ",\n";
		}
		output += base + "]";

		return output;
	}

	public static String arr3ToString(String base, String[][][] array) {
		String output = base + "[\n";
		for (int i = 0; i < array.length; i++) {
			output += arr2ToString(base + "\t", array[i]) + ",\n";
		}
		output += base + "]";

		return output;
	}
}
