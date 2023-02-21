import java.util.Arrays;

/***
 * Goal: Determine and print the median of array "a"
 * Hint 1: Google "java Arrays.sort()"
 * Hint 2: Google "java modulus"
 * Rating: SPICY
 */

public class Spicy1 {

    public int[] a;
    public double median;

    public static void main(String[] args) {
        Spicy1 practice = new Spicy1();
    }

    public Spicy1() {

        int sizeOfA = (int)(Math.random()*50+10); // a is a random size between 10 and 59
        a = new int[sizeOfA];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }

        System.out.println("Original array: " + Arrays.toString(a));

        /***
         * Your code goes here
         */

        System.out.println("The median is " + median);

    }

}