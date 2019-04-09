/**
 * Method signatures and overloading
 * - Declaring & calling
 * - Returns & parameters
 * - Instance vs class (static) methods
 * - Variable scope
 * 
 * @author Yuanfang
 *
 */
public class Method {
    /*
    concepts:
    signatures
    overloading
    method declaration
    method call
    method return
    parameters
    instance method
    static method
    */

    public static void main(String[] args){
        methodD();
        // localVariable = 10;
        int result = methodA("str", 0, 0);

    }

    // signatures and overloading
    public static int methodA(String a, int b, char c) {
        return 0;
    }

    public static char methodB(String a, int b, char c) {
        return 0;
    }

    public static int methodA(String a, char b) {
        return 0;
    }

    public static int methodA(String a, char b, int c) {
        return 0;
    }

    public int methodC(String a){
        return 0;
    }

    public static void methodD(){
        int localVariable = 1;
        for(int i = 0;i<10;i++){
            localVariable = 10;
            System.out.println("hello " + i);
        }
        // i = 2;
    }



}

