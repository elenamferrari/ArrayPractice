/***
 * Goal: calculate the average height of the penguins
 * Rating: MEDIUM
 */

public class Medium3 {

    public Penguin[] penguins;
    public double averageHeight;

    public static void main(String[] args) {
        Medium3 practice = new Medium3();
    }

    public Medium3() {

        penguins = new Penguin[10];
        for (int i = 0; i < penguins.length; i++) {
            penguins[i] = new Penguin((int)(Math.random()*50) + 10);
        }

        /***
         * Your code goes here
         */

        System.out.println("The average height of the penguins is: " + averageHeight);
    }

}
