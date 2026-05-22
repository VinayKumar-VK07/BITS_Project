package day5;

import java.util.Scanner;

public class FibonacciRecursion {
    public static int fun(int n) {

        // base case
        if (n == 0) return 0;
        if (n == 1) return 1;

        // recursive case
        return fun(n - 1) + fun(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + fun(n));

        sc.close();
    }
}
