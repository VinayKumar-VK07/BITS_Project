package day5;

public class NaturalNumbers {
    public static void fun(int n) {

        // base case
        if (n == 0) return;

        // recursive class
        fun(n - 1);
        System.out.println(n+ " ");
    }

    public static void main(String[] args) {
        fun(5);
    }
}
