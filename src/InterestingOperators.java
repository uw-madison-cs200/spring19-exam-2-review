/**
 * Interesting operators
 * 
 * @author Yuanfang
 */

public class InterestingOperators {
    /*
    concepts:
    increment operator
    decrement operator
    ternary operator
    */

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();

    }

    public static void example1(){
        int i = 0;
        i++;
        System.out.printf("example1: i:%d.\n", i);
    }

    public static void example2(){
        int i = 0;
        ++i;
        System.out.printf("example2: i:%d.\n", i);
    }

    public static void example3(){
        int i = 0;
        int j = i++;
        System.out.printf("example3: i:%d j:%d.\n", i, j);
    }

    public static void example4(){
        int i = 0;
        int j = ++i;
        System.out.printf("example4: i:%d j:%d.\n", i, j);
    }

    public static void example5(){
        int i = 0;
        i = i++;
        System.out.printf("example5: i:%d.\n", i);
        
        //int tmp = i;
        //i = i + 1;
        //i = tmp;

    }

    public static void example6(){
        int i = 0;
        i = ++i;
        System.out.printf("example6: i:%d.\n", i);
        
        //i = i + 1;
        //int tmp = i;
        //i = tmp;
    }


    public static void example7(){
        int i = 0;
        System.out.print("example7: ");
        String s = i == 0?"i == 0":"i != 0";
        System.out.println(s);
    }



}
