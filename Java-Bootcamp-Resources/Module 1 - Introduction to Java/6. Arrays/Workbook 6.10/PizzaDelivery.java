import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
        System.out.println("\nHow many pizza toppings do you want?");
        int topp = scan.nextInt();scan.nextLine();//so that it starts from 0 not to skip it 
        // Task 2 – Create the array here
        String[] topping = new String[topp];
        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */
        System.out.println("\nGreat, enter each topping!");
        /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */
        for (int i = 0; i < topping.length; i++) {
        System.out.println(i + ". ");
        topping[i]= scan.nextLine();
        }
        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */
        System.out.println("\nThank you! Here are the toppings your ordered");
        for (int i = 0; i < topping.length; i++) {
        System.out.println(i + ". " + topping[i]);
        }
        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */
        System.out.println("\nPress anything to confirm your order.");
        scan.next();
        System.out.println("\nGreat, a driver is on the way!");
        scan.close();


         
    }
}
