import java.util.Scanner;

/**
 * Exceptions
 * - Throwing & Catching
 *
 * @author Yuanfang
 */
public class Exceptions {
    /*
    concepts:
    try
    catch
    finally
    throws
    throw
    checked exception
    unchecked exception,
    */
    public static void main(String[] args) {

    }

    public static void example1() {
        System.out.println("before of try");
        try {
            System.out.println("before method call");
            String filename = null;
            int result = method1(filename);
            System.out.println("after method call");
        } catch (FileNotFoundException e) {
            System.out.println("in catch");
        } finally {
            System.out.println("in finally");
        }
        System.out.println("after of try");
    }

    public static int method1(String filename) throws FileNotFoundException {
        if (filename == null) {
            throw new FileNotFoundException();
        }
        return 0;
    }


    public static void example2(String[] args) {
        System.out.println(method2());
    }

    public static int method2() {
        try {
            String filename = null;
            return method3(filename);
        } catch (Exception e) {
            System.out.println("in catch");
            return -1;
        } finally {
            System.out.println("in finally");
            return -2;
        }
        //return 0;
    }

    public static int method3(String filename) throws FileNotFoundException {
        if (filename == null) {
            throw new FileNotFoundException();
        }
        return 0;
    }


}
