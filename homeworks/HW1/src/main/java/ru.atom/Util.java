package ru.atom;


/**
 * In this assignment you need to implement the following util methods.
 * Note:
 * throw new UnsupportedOperationException(); - is just a stub
 */

public class Util {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        System.out.println("max: " + max(myArray));
        System.out.println("sum: " + sum(myArray));
        System.out.println(getHelloWorld());
    }

    public static String getHelloWorld() {
        return "Hello, World!";
    }

    /**
     * Returns the greatest of {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the largest of values.
     */
    public static int max(int[] values) {
        int n2 = values.length;
        int max1 = values[0];
        for (int i = 1; i < n2; i++) {
            if (values[i] > max1) max1 = values[i];
        }
        return max1;
    }

    /**
     * Returns the sum of all {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the sum of all values.
     */
    public static long sum(int[] values) {
        int n1 = values.length;
        long sum1 = 0;
        for (int i = 0; i < n1; i++) {
            sum1 = sum1 + values[i];
        }
        return sum1;
    }
}
