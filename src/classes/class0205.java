package classes;
import java.util.Scanner;


//          RECURSION IN A NUT-SHELL

// EXAM QUESTION IS ON CODINGBAT RECURSION-1
// Back Trace Graph will be on the exam

public class class0205 {

    /**
     *          BTG
     *
     *       factorial(4)
     *          4 * factorial(3)
     *              3 * factorial(2)
     *                  2 * factorial(1)
     *                      1 * factorial(0)
     *                          1
     *
     *
     * @param n
     * @return
     */


    public static int factorial(int n){
        if (n == 0)                             // Base Case
            return 1;                           //  0! = 1
        else return n * factorial(n - 1);    // Recursion
    }

    public static int fibonacci(int n){
        if (n == 1 || n == 2)
            return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scnr.nextInt();
        System.out.println(n + "! = " + factorial(n));
        System.out.println("The Fibonacci sequence of " + n + " is " + fibonacci(n));
    }

}


