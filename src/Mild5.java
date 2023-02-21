import java.util.Arrays;

/***
 * Goal: Determine whether array "a" contains a certain value "b"
 * The output of your program should be a print statement, either:
 * "The array does not contain value ___" OR
 * "The array contains value ___"
 * (and have it print the value, not underscores)
 * Rating: MILD
 */

public class Mild5 {

    public int[] a;
    public int b;

    public static void main(String[] args) {
        Mild5 practice = new Mild5();
    }

    public Mild5() {

        a = new int[30];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }

        b = (int)(Math.random()*100);

        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Number we're looking for: " + b);

        /***
         * Your code goes here
         */

    }

}