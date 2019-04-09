import java.util.Scanner;

/**
 * Primitives vs References
 *  - Primitive wrappers
 *  - Autoboxing / Autounboxing
 *
 * @author Connor
 */

public class PrimitivesAndReferences {
    public static void main(String[] args) {
//        primativesAndReferences();
        //canBeNull();
        //boxingAndUn();
        //scannerRefs();
    }

    // SOME OF BOTH
    public static void primativesAndReferences() {
        // PRIMITIVES - DATA TYPES
        // boolean, byte, char, double, float, int, long, short
        int integer = 1;
        boolean done = false;
        char letter = 'a';

        // REFERENCES (WRAPPERS & OTHER CLASSES) - POINTERS
        // Integer, Boolean, Scanner, String, etc.
        Scanner scanner = new Scanner(System.in);
        Integer number = new Integer(1);
        String word = "hello";
    }

    // REFERENCES NULL PRIMITIVES NOT?
    public static void canBeNull() {
        // OK?
        // String word = null;
        // char letter = null;

        // AND THEN
        int[] ints = new int[2]; // WHAT THING IS EXPECTED IN ints[i]
        Integer[] integers = new Integer[2]; // WHAT THING IS EXPECTED IN integers[i]

        for ( int i : ints ) {
            System.out.println(i);
        }

        for ( Integer i : integers ) {
            System.out.println(i);
        }
    }

    // SOME BOXING AND UNBOXING
    public static void boxingAndUn() {
        // BOXING UNBOXING
        Character ch1 = new Character('a');
        Character ch2 = 'a';
        char ch3 = ch2;
        Character ch4 = ch3;

        // BOXING AND UNBOXING IN CALLS
        int i1 = 4;
        Integer i2 = addOne(i1);

        Integer i3 = new Integer(3);
        int i4 = addTwo(i3);
    }

    // + 1
    public static int addOne(Integer in) {
        Integer result = in + 1;
        return result;
    }

    // + 2
    public static Integer addTwo(int in) {
        int result = in + 2;
        return result;
    }

    // CREATES TWO REFERENCES TO SAME SCANNER
    public static void scannerRefs() {
        Scanner sc = new Scanner("1 2 3 4");

        for ( int i = 0; i < 2; i++ ) {
            System.out.println(readNext(sc));
        }

        Scanner sc2 = sc;

        for ( int i = 0; i < 2; i++ ) {
            System.out.println(readNext(sc2));
        }
    }

    // READS NEXT IF THERE IS A NEXT
    public static String readNext(Scanner scanner) {
        String next = null;
        if ( scanner.hasNext() ) {
            next = scanner.next();
        }
        return next;
    }
}
