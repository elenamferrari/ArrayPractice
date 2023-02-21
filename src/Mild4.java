import java.util.Arrays;

/***
 * Goal: sort a numeric array and a String array
 * Hint 1: look at the import
 * Hint 2: Google is your friend
 * Rating: MILD
 * Too easy? Go to GhostPepper.java
 */

public class Mild4 {

    public int[] intArray = {178, 203, 189, 145, 201, 145, 245, 125, 147, 236};
    public String[] stringArray = {"English", "Art", "History", "Computer Science", "Music", "Science", "Language", "Math"};

    public static void main(String[] args) {
        Mild4 practice = new Mild4();
    }

    public Mild4() {

        System.out.println("Original numeric array: " + Arrays.toString(intArray));
        /***
         * Your code goes here
         */
        System.out.println("Sorted numeric array: " + Arrays.toString(intArray));


        System.out.println("\nOriginal string array: " + Arrays.toString(stringArray));
        /***
         * Your code goes here
         */
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

    }

}
