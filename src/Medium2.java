/***
 * Goal: Remove the element at index "r" from array "a"
 * Rating: MEDIUM
 */

public class Medium2 {

    public int[] a;

    public static void main(String[] args) {
        Medium2 practice = new Medium2();
    }

    public Medium2() {

        a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*50);
        }
        System.out.println("The original array is: ");
        printArray(a); // does the same thing as System.out.println(Arrays.toString(a))

        int r = (int)(Math.random()*10);
        System.out.println("\nThe index to remove is: " + r);
        System.out.println("a[" + r + "] is: " + a[r]);

        removeValue(a, r);

        System.out.println("\nThe updated array is: ");
        printArray(a);

    }

    public void removeValue(int[] array, int indexToRemove) {

        /***
         * Your code goes here
         */

    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}