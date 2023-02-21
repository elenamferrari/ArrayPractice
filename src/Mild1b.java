/***
 * Goal: Determine and print the sum of array "a"
 * Method 1: no loop
 * Method 2: for loop
 * Method 3: for each loop
 * Rating: MILD
 */

public class Mild1b {

    public int[] a;

    public static void main(String[] args) {
        Mild1b practice = new Mild1b();
    }

    public Mild1b() {

        int sizeOfA = (int)(Math.random()*20+10); // a is a random size between 10 and 29
        a = new int[sizeOfA]; // construct the array itself

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100); // fill the array with individual random integers between 0 and 99
        }

        int sum = 0;

        /***
         * Your code goes here
         */

        System.out.println("The sum is " + sum);

    }

}