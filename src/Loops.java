import java.util.*;

/*
 * Loops / Nested loops
 *
 * @author Connor
 */
public class Loops {
    public static void main (String args[]) {
        //typesOfLoops();
        //whileVsDoWhile();
        //offByOne();
        //nested()
        //scopeOfLoopVariable();
    }

    // ALL LOOP 5 TIMES (0 -> 4)
    public static void typesOfLoops() {
        // initial, condition, each iteration
        for ( int i = 0; i < 5; i++ ) {
            System.out.println(i);
        }

        int i = 0;
        while ( i < 5 ) {
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while ( i < 5 );
    }

    public static void whileVsDoWhile() {
        boolean looping = false;

        int counter = 0;

        //CHECKS FIRST
        while ( looping ) {
            counter++;
        }

        System.out.println(counter);

        // DOES BEFORE CHECKING
        do {
            counter++;
        } while ( looping );

        System.out.println(counter);
    }

    public static void offByOne() {
        char[] me = new char[] {'c', 'o', 'n', 'n', 'o', 'r'};

        for ( int i = 0; i < me.length - 1; i++ ) {
            System.out.print(me[i]);
        }

        System.out.println();

        for ( int i = 1; i <= me.length - 1; i++ ) {
            System.out.print(me[i]);
        }

        System.out.println();

        for ( int i = 0; i < me.length; i++ ) {
            System.out.print(me[i]);
        }

        //for ( int i = ?; i < ?; i++ )

        //A FEW WAYS TO LOOP SIX TIMES
        //for ( int i = 0; i < 6; i++ )
        //for ( int i = 0; i <= 5; i++ )
        //for ( int i = 1; i <= 6; i++ )
        //for ( int i = 1; i < 7; i++ )
    }

    public static void nested() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {1});
        list.add(new int[] {1, 2});
        list.add(new int[] {1, 2, 3});
        list.add(new int[] {1, 2, 3, 4});

        for ( int i = 0; i < list.size(); i++ ) {
            // FILL THIS IN?
            for ( int j = 0; ??; j++ ) {
                System.out.print(list.get(??)[??] + " ");
            }
            System.out.println();
        }
    }

    public static void scopeOfLoopVariable() {
        int i;
        for ( i = 1; i <= 5; i++ ) {
            int doubled = i * 2;
            System.out.println(doubled);
        }
        // WHAT IS i?
        // WHAT IS doubled?

        for ( int j = 1; j <= 5; j++ ) {
            int tripled = j * 3;
            System.out.println(tripled);
        }
        // WHAT IS j
        // WHAT IS tripled?
    }
}
