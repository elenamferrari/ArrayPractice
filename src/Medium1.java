/***
 * Goal: find the lowest number in a numeric array
 * Rating: MEDIUM
 */

public class Medium1 {

    public int[] a;
    public int least;

    public static void main(String[] args) {
        Medium1 practice = new Medium1();
    }

    public Medium1() {

        a = new int[30];
        //least = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);

            System.out.println(a[i]);
        }


        int min = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
            }
        }

        /***
         * Your code goes here
         */

        System.out.println("The lowest number in the array is: " + min);
    }

}
